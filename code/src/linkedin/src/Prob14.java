/*************************************************************************
 *
 * Copyright (c) 2016, DATAVISOR, INC.
 * All rights reserved.
 * __________________
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of DataVisor, Inc.
 * The intellectual and technical concepts contained
 * herein are proprietary to DataVisor, Inc. and
 * may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from DataVisor, Inc.
 */

package linkedin.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=428769&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D6%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * Phone：现实描述做过的ML的项目。某扣而伞吴+妖妖铃
 * leetcode 235
 * leetcode 110
 * <p>
 * <p>
 * Onsite：
 * Round1: ML 理论。如何cross validation。 如何根据learning curve判断overfittting/underfitting
 * （Ng的课），并且如何处理。L1/L2的区别（那张著名的图）。 performance metric，
 * AUC。Logistic regression， MLE。Newton's method， GD。
 * 简单的概率题，要用到Bayes theorem。
 * <p>
 * <p>
 * <p>
 * Round2: Behavior question。
 * <p>
 * <p>
 * Round3: reservoir sampling, 并且证明。
 * https://www.geeksforgeeks.org/reservoir-sampling/
 * <p>
 * Round4: ML System design。Post ranking. 就是用ML来预测每个user 对 post的click through。
 * features 可以有哪些， 如何split training and validation data，用什么模型，
 * performance metric. 最好画个流程图。
 * <p>
 * <p>
 * <p>
 * Round5: Coding 其要柳
 * leetcode 716
 */

public class Prob14 {

    /**
     * reservoir sampling proof:
     * To prove that this solution works perfectly,
     * we must prove that the probability that any
     * item stream[i] where 0 <= i < n will be in final
     * reservoir[] is k/n.
     *
     * Let us divide the proof in two cases as first k items are treated differently.
     *
     * Case 1: For last n-k stream items, i.e., for stream[i] where k <= i < n
     *
     * For every such stream item stream[i], we pick a random index from 0 to i and
     * if the picked index is one of the first k indexes, we replace the element at
     * picked index with stream[i]
     *
     * To simplify the proof, let us first consider the last item.
     * The probability that the last item is in final reservoir =
     * The probability that one of the first k indexes is picked
     * for last item = k/n (the probability of picking one of the
     * k items from a list of size n)
     *
     *
     * Let us now consider the second last item. The probability that
     * the second last item is in final reservoir[] =
     * [Probability that one of the first k indexes is picked in iteration
     * for stream[n-2]] X [Probability that the index picked in iteration
     * for stream[n-1] is not same as index picked for stream[n-2] ] = [k/(n-1)]*[(n-1)/n] = k/n.
     *
     * Similarly, we can consider other items for all stream items
     * from stream[n-1] to stream[k] and generalize the proof.
     *
     *
     *
     *
     * Case 2: For first k stream items, i.e., for stream[i] where 0 <= i < k
     The first k items are initially copied to reservoir[] and may be removed later in iterations for stream[k] to stream[n].
     The probability that an item from stream[0..k-1] is in final array = Probability that the item is not picked when items stream[k], stream[k+1], …. stream[n-1] are considered = [k/(k+1)] x [(k+1)/(k+2)] x [(k+2)/(k+3)] x … x [(n-1)/n] = k/n

     References:
     http://en.wikipedia.org/wiki/Reservoir_sampling

     Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.
     *
     *
     *
     * */

    /**
     * 如何cross validation：
     *
     * It is commonly used in applied machine learning to compare and select
     * a model for a given predictive modeling problem because it is easy to understand,
     * easy to implement, and results in skill estimates that generally have a
     * lower bias than other methods.
     *
     *
     * Cross-validation is a resampling procedure used to evaluate machine learning models on a limited data sample.
     * The procedure has a single parameter called k that refers to the number of groups that a given data sample is
     * to be split into. As such, the procedure is often called k-fold cross-validation. When a specific value
     * for k is chosen, it may be used in place of k in the reference to the model,
     * such as k=10 becoming 10-fold cross-validation.
     *
     *
     * Cross-validation is primarily used in applied machine learning to estimate the skill of a machine learning
     * model on unseen data. That is, to use a limited sample in order to estimate how the model is expected to
     * perform in general when used to make predictions on data not used during the training of the model.
     *
     * It is a popular method because it is simple to understand and because it generally results in a less biased
     * or less optimistic estimate of the model skill than other methods, such as a simple train/test split.
     *
     *
     * The general procedure is as follows:
     * 1. Shuffle the dataset randomly.
     *
     * 2. Split the dataset into k groups
     *
     * 3. For each unique group:
     *      a. Take the group as a hold out or test data set
     *      b. Take the remaining groups as a training data set
     *      c. Fit a model on the training set and evaluate it on the test set
     *      d. Retain the evaluation score and discard the model
     *
     * 4. Summarize the skill of the model using the sample of model evaluation scores
     *
     * Importantly, each observation in the data sample is assigned to an individual group and stays in that group
     * for the duration of the procedure. This means that each sample is given the opportunity to be used in
     * the hold out set 1 time and used to train the model k-1 times.
     *
     * The k value must be chosen carefully for your data sample.

     * A poorly chosen value for k may result in a mis-representative idea of the skill of the model,
     * such as a score with a high variance (that may change a lot based on the data used to fit the model),
     * or a high bias, (such as an overestimate of the skill of the model).
     *
     * Three common tactics for choosing a value for k are as follows:
     *
     * Representative: The value for k is chosen such that each train/test group of data samples is
     * large enough to be statistically representative of the broader dataset.
     *
     *
     * k=10: The value for k is fixed to 10, a value that has been found through experimentation to
     * generally result in a model skill estimate with low bias a modest variance.
     *
     *
     * k=n: The value for k is fixed to n, where n is the size of the dataset to give each test sample
     * an opportunity to be used in the hold out dataset. This approach is called leave-one-out cross-validation.
     *
     *
     *
     *
     *
     *
     * 如何cross validation。 如何根据learning curve判断overfittting/underfitting
     * （Ng的课），并且如何处理。L1/L2的区别（那张著名的图）。 performance metric，
     * AUC。Logistic regression， MLE。Newton's method， GD。
     * 简单的概率题，要用到Bayes theorem。
     *
     * */

}

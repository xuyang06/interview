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

package facebook.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=467805&extra=page%3D2%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D2%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * 一共6轮，.
 * BQ： 美国大叔， 瞎扯， leadership, projects....
 * coding1: LC regular expression, leetcode 10
 * 换钱题  是那个给了总数， 然后一堆面值a, b. c的硬币，问有多少中组合方式的
 * <p>
 * leetcode 322
 * <p>
 * <p>
 * coding 2: LC break words, leetcode 139
 * <p>
 * 4 sum
 * <p>
 * design: FB news feed
 * <p>
 * <p>
 * ML design: POI , features, models....
 * <p>
 * BQ2: 不算分， 瞎扯
 * <p>
 * 总体偏容易
 * <p>
 * drool 发表于 2018-12-27 10:34
 * News feed 能说详细些吗？
 * <p>
 * 主要问的是infra 方面， qps计算,如何 shard, 存储schema等等， 都比较general 不是很难的
 * <p>
 * POI , features, models.... <= 这因该算是推荐系统之类的 能分想一些讨论的metric or follow up 吗? 这个感觉用CF 就足够了?
 * <p>
 * 这个是个看上去很累而且漫不经心的小哥面的， 所以我就简答带过了因为poi
 * 多数情况是作为general system design出现的，我遇到的可能比较特殊，
 * 要求personalize, 然后看我之前做过的项目集中问了怎么产生user level embedding,
 * location level embedding, 如何采集negative example, pos example,
 * 对 neg example 怎么sample, model 选择上LR, XGB, NN 各自有啥优缺点。
 * 总之问的很随意发散， 和大多数同学遇到的有点不一样， 可能是个例
 * <p>
 * drool 发表于 2018-12-27 10:34
 * News feed 能说详细些吗？
 * <p>
 * 主要问的是infra 方面， qps计算,如何 shard, 存储schema等等， 都比较general 不是很难的
 * <p>
 * POI , features, models.... <= 这因该算是推荐系统之类的 能分想一些讨论的metric or follow up 吗? 这个感觉用CF 就足够了?
 * <p>
 * 这个是个看上去很累而且漫不经心的小哥面的， 所以我就简答带过了因为poi
 * 多数情况是作为general system design出现的，我遇到的可能比较特殊，
 * 要求personalize, 然后看我之前做过的项目集中问了怎么产生user level embedding,
 * location level embedding, 如何采集negative example, pos example,
 * 对 neg example 怎么sample, model 选择上LR, XGB, NN 各自有啥优缺点。
 * 总之问的很随意发散， 和大多数同学遇到的有点不一样， 可能是个例
 * <p>
 * drool 发表于 2018-12-27 10:34
 * News feed 能说详细些吗？
 * <p>
 * 主要问的是infra 方面， qps计算,如何 shard, 存储schema等等， 都比较general 不是很难的
 * <p>
 * POI , features, models.... <= 这因该算是推荐系统之类的 能分想一些讨论的metric or follow up 吗? 这个感觉用CF 就足够了?
 * <p>
 * 这个是个看上去很累而且漫不经心的小哥面的， 所以我就简答带过了因为poi
 * 多数情况是作为general system design出现的，我遇到的可能比较特殊，
 * 要求personalize, 然后看我之前做过的项目集中问了怎么产生user level embedding,
 * location level embedding, 如何采集negative example, pos example,
 * 对 neg example 怎么sample, model 选择上LR, XGB, NN 各自有啥优缺点。
 * 总之问的很随意发散， 和大多数同学遇到的有点不一样， 可能是个例
 * <p>
 * drool 发表于 2018-12-27 10:34
 * News feed 能说详细些吗？
 * <p>
 * 主要问的是infra 方面， qps计算,如何 shard, 存储schema等等， 都比较general 不是很难的
 * <p>
 * POI , features, models.... <= 这因该算是推荐系统之类的 能分想一些讨论的metric or follow up 吗? 这个感觉用CF 就足够了?
 * <p>
 * 这个是个看上去很累而且漫不经心的小哥面的， 所以我就简答带过了因为poi
 * 多数情况是作为general system design出现的，我遇到的可能比较特殊，
 * 要求personalize, 然后看我之前做过的项目集中问了怎么产生user level embedding,
 * location level embedding, 如何采集negative example, pos example,
 * 对 neg example 怎么sample, model 选择上LR, XGB, NN 各自有啥优缺点。
 * 总之问的很随意发散， 和大多数同学遇到的有点不一样， 可能是个例
 */

/**
 * drool 发表于 2018-12-27 10:34
 * News feed 能说详细些吗？
 * <p>
 * 主要问的是infra 方面， qps计算,如何 shard, 存储schema等等， 都比较general 不是很难的
 */

/**
 * POI , features, models.... <= 这因该算是推荐系统之类的 能分想一些讨论的metric or follow up 吗? 这个感觉用CF 就足够了?
 *
 * 这个是个看上去很累而且漫不经心的小哥面的， 所以我就简答带过了因为poi
 * 多数情况是作为general system design出现的，我遇到的可能比较特殊，
 * 要求personalize, 然后看我之前做过的项目集中问了怎么产生user level embedding,
 * location level embedding, 如何采集negative example, pos example,
 * 对 neg example 怎么sample, model 选择上LR, XGB, NN 各自有啥优缺点。
 * 总之问的很随意发散， 和大多数同学遇到的有点不一样， 可能是个例
 * */

/**
 * 这轮因该是ML design 能问下 如何采集negative example, pos example,
 * 对 neg example 怎么sample, 这怎么答吗?
 * 我只想到imbalance sample 可以特殊处理    像SMOTE

 * */

public class Prob49 {

}

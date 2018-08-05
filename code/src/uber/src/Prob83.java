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

package uber.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=487212&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * 昨天刚面的uber marketing组，来一波新鲜面经，签了协议不方便说的太细，就大致说一下，
 * 1. manager轮，behavior questions，没什么好说的，
 * 主要就是介绍组介绍人员配置然后问问我的优点缺点什么的。
 * <p>
 * <p>
 * 2. 烙印senior，standford毕业的，来uber工作3年多，问的题是一个alian name的问题，
 * 就是给你一堆string，说是已经按照某种逻辑排好序的，但是排序的规则未知，
 * 然后让你找出规则输出，其实很简单，就是topological sort，我写了个dfs+剪枝的代码，
 * 虽然也可以work但是复杂度有点高，代码最后刚写完还没改完typos，时间就到了，
 * 主要和manager之前那轮多聊了五分钟，加上之前一直requirement没搞清楚浪费了好多时间，
 * 只有15分钟写代码，而且这代码量也挺大，最后烙印说先这样吧，
 * 你可以一会把代码补全了然后明天早上他再来看。感觉这轮gg，回家补全了代码，
 * 顺便topological sort的方法也写了，也不知道烙印会不会真的看。
 * <p>
 * <p>
 * 3，lunch，一个中国的小妹妹带我去吃的，没啥好吃的没吃几口就回去了。今天schedule特别紧。
 * <p>
 * <p>
 * 4. 白人小哥，tech lead还是senior忘了，system design，原来以为我是new grad想问我算法，
 * 后来发现我面的不是new grad就给我换了个system design题，设计uber heat map，
 * 要求可以zoom in，还可以查看特定时间的heat map，挺简单，geo hash+
 * ring pop+ casendra/dynamoDB，服务器数据库sharding什么的乱扯一通，
 * 然后算了一下qps，storage什么的，小哥看起来挺满意，看着我画的图想了半天觉得没什么可以问的了，
 * 然后就谈笑风生聊天起来。
 * <p>
 * <p>
 * 5。中国大哥，谷歌senior之前，人非常nice，问的题目也不难，就是给你一个有typo的string和一个字典，
 * 让你correct这个string，typo可能是大小写，也可以能是元音字母弄错，很快写完加优化完，
 * 然后重构了一下代码，改成单例模式，因为给你的字典是固定的不需要每次都初始化。之后愉快的聊天。
 * <p>
 * <p>
 * 6， bar rasie，新加坡大哥，感觉表现最好的一轮，刚开始出了一个智力题，就是砸金蛋的游戏，
 * 主持人砸的就剩一个蛋的时候问你换不换。然后把之前公司自己设计的服务架构什么的以超快的语速加上
 * 画图说了一通，说的口干舌燥，大哥感觉也挺有兴趣，一问一答有来有回，最后问问题，
 * 愉快的结束聊天送我下楼。
 * <p>
 * <p>
 * 总结一下，uber换了ceo后企业文化还是很好的，大家很友好，很geek的感觉，
 * marketing组做的东西我也很喜欢，就是as we all know，食堂的饭菜不敢恭维
 * <p>
 * <p>
 * 每次面完都会发面经，感觉第二轮要挂，还是求人品求offer求大米
 */

public class Prob83 {
}

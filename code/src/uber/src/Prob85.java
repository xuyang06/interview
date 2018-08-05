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
 * https://www.1point3acres.com/bbs/thread-487913-1-1.html
 * <p>
 * 10:00～10:15  HR接待
 * <p>
 * 10:15～11:15  algorithm轮  荷兰小哥；
 * 利口 吾幺巴；   我当时没刷到这题，只写了暴力破解DFS，一起讨论了一下怎么做成DFS+memo，
 * 这题还有一个标准的DP解法，那个我就没想到了，也没时间了。
 * leetcode 518
 * <p>
 * <p>
 * <p>
 * 11:15～12:15  System design轮  英国大哥（浓浓英伦腔） + 从澳洲过来的印度大哥远程；
 * 开始给了一个很开放的问题，就是手机或者浏览器访问网站或者服务器的时候是怎么样一个过程。
 * 然后问流量大了之后要如何handle。如何监控服务器的load，
 * 然后load很低的时候很不efficient如何调整，load很高的时候又可能handle不了，如何解决。
 * 很多用户突然都访问失败，如何知道是哪里出现问题，如果是某些服务器服务失败，
 * 如何处理，又如何提前监测预防这些问题的出现。AB实验如果上了一些新的代码机器，
 * 如何上到生产环境中，当上线发现它们里面有bug的时候又如何处理。
 * <p>
 * <p>
 * 12:15～1:00    lunch  和英国大哥 到他们组那边吃的饭，
 * 还见到一些将来可以一起工作的组员，还挺不错的
 * <p>
 * <p>
 * 1:00 ～ 2:00    hiring manager-baidu 1point3acres
 * 问了几个工作经历和以前的项目，在白板上demostrate了一下技术框架；
 * 因为我面的Java组，所以问了为什么选择Java这个语言，
 * why this team, why Uber；
 * 多这个组有什么需要了解的. check 1point3acres for more.
 * <p>
 * 2:00 ～ 3:00    coding
 * 写一个Scheduler，允许上网查Java API，不允许查看其它。这个Scheduler的基本需求就是提供出来一个底层的library，供用户调用；
 * Input是用户调用这个API，可以提交一个timestamp + 一个Job任务，然后我们可以到了这个timestamp则执行这个任务。如果提交的timestamp小于当前timestamp，则立即执行。
 * 用户可以反复多次call这个API
 * <p>
 * <p>
 * 3:00 ～ 3:45    bahavior面  其他组的两个工程师
 * 和外部其它组合作的项目经验，其它team和我合作人对我的feedback
 * 最proud的项目；和谁合作的最不愉快，为什么；
 * 你觉得谁会觉得和你合作的不太愉快；.
 * 是否当过mentor，过程如何，自己的收获，
 * 哪些地方能做的更好；why uber;
 * 你喜欢什么样的企业文化，对uber的期待；
 * <p>
 * <p>
 * My first impression is that, first you are easy going
 * and very nice to work for. Second, you know how to make
 * people work hard without laying an eye on them all the time.
 * Most importantly, you care about your employees and you
 * are willing to fight for them when they are right.
 * These are the things that in my opinion can decide
 * if one can make a successful manager.
 * <p>
 * <p>
 * it takes a lot of courage to challenge senior people.
 * And it is indeed hard to make changes happen because
 * most people don’t like to change the way they do things all the time
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 3:45 ～ 4:00    hr walk out
 */

public class Prob85 {

    /**
     * My first impression is that, first you are easy going
     * and very nice to work for.
     *
     *
     * Second, you know how to make people work hard without
     * laying an eye on them all the time.
     *
     *
     * Most importantly, you care about your employees and
     * you are willing to fight for them when they are right.
     *
     *
     * These are the things that in my opinion can decide
     * if one can make a successful manager.
     * */

    /**
     * What do you value the most in the new hire?
     * What is the most important for one to succeed in this position?
     *
     *
     * 这个是必问题，因为作为hiring manager，最关心的就是能否招到合适的人，你问这个问题表明你了解他的需要也愿意听听他的期待，是很好的一个互相沟通。
     *
     * How much would you encourage new ideas? You know, sometimes new ideas
     * mean extra time spent and no return guaranteed.
     *
     * I have *** skills. From the job description, I think it might be helpful
     * but not quite sure. What is your opinion?
     * 这个是为自己不动声色加分的方法，注意要准备好被问为什么你觉得你的这个skill会有用。
     *
     * 问未来同事的问题：
     * Ask more about the job responsibility: Could you describe a typical day of yours?
     * 或者换个方式问 how much time do you spend on working on your computer,
     * and how much time on talking to other people 诸如此类的。
     *
     * What kind of people do you like to work with? 记住在他讲完之后抓住一两点表明自己具有他喜欢的特质。
     *
     * I know you’ve been working here for a number of years. Would you mind sharing your
     * personal experience with the company? What do you like about the company
     * and the xxx team?
     *
     * 最好不要问对方不喜欢什么，最多用委婉一点的说法, what do you feel is the most challenging thing.
     *
     * Has it been hard to balance work and family life since you joined the company? （对以忙著称的公司就不要问这个了）
     *
     *
     * 问对方大头目的问题；
     * Ask about the company’s “big” topics. 做好功课，最好能做一点简单的分析和提出有意义的问题。
     * Ask about his/her personal experience with the company. 如果对方已经做到比较高的位置，
     * 个人经历都不至于太不愉快的，每次问这个问题，对方都很高兴的吹了吹牛。
     *
     *
     * */



    /**
     * leetcode 518
     * */

}

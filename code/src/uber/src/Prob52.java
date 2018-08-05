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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=449393&extra=page%3D4%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 做题先问给两个string怎么实现以下功能
 * ("aa","aa") -> true
 * ("aa","aaa") -> false
 * ("aa","a") -> false
 * 要求必须complete match然后每个string都只有小写字母。
 * 我说这不就是string equality吗，还反复确认了这就是他让我写的东西，
 * 他说对，就是很trivial。于是很快写了，大概过了5分钟。心里想，
 * 一共就30分钟你还让我花时间写这个？？？
 * <p>
 * 然后是黎釦石。我当时还很惊讶因为recruiter给的email里明确说不会考dp。
 * 结果他定义了一个限制，就是regex一定是简化形。举了个例子
 * leetcode 10
 * <p>
 * <p>
 * <p>
 * "aa" match "a*a" 和 "a*"，但是"a*"是简化形，"a*a"就不是，所以regex只会是第一种
 * <p>
 * 不知道是他解释不清楚还是lz智商没在线，反正当时没太明白这到底是什么意思，
 * 所以就说用dp还大致描述了一下。他说不你想太复杂了，你再好好看看这个restriction。
 * 我又想了想，发现好像可以用双指针linear做，终于得到了他的认可，
 * 但这时已经又过了10几分钟。。。导致lz最后只有10分钟出头写，
 * 写的过程中思考的时候还经常被打断问有没有什么问题，真的是体验极差。
 * 最后debug过程中到了时间，面试官说I have to make a hard stop，
 * 就把editor给lock了。之后问问题的时候我就想再给我两分钟就bug-free了，
 * 天竺还假惺惺地说没事就是个corner case有bug我主要看你思维方式。。。
 */

public class Prob52 {
}

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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=490703&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 1. 和hiring manager尬聊，这个manager是女华人（从名字看起来），
 * 人很好，虽然我英文口音很重，从事后反馈，她给我feedback挺好的
 * <p>
 * 2. 算法轮，给一个sorted array，给一个数，问出现的频率，https://www.geeksforgeeks.org/co ... -in-a-sorted-array/
 * 我已经给出了最优解，就是binary search左右边界，不过我用的是传统的while loop，
 * 上面的是recursive function，其他没区别
 * 从事后看，这轮把握挂了，我真是无奈
 * 后来hr说，这轮面试官说我有时候不能很好领会tip
 * 因为他问我，如果给一组完全一样的数，比如[2,2,2,2,2]，找2的频率，我该怎么办，当时我蒙了，没有反映过来
 * 事后想，他应该想我写一些fail first的code
 * <p>
 * 比如一开始就检查数组第一个是否大于2,或者数组最后一个是否小于2,否则都不用进下面的code
 * 还有就是地一个和最后一个都和target一样，直接就返回数组长度即可，可是我做死没想到，
 * 当时答复他说binary search还是比其他方法快
 * <p>
 * 3. live coding轮，面试官人非常好，让我在自己喜欢的editor写，
 * 能过就行，就是那道一条短信，根据最长字数问能拆成几条的题，不需要考虑(1/3)这种，过了
 * <p>
 * 4. 系统设计，设计uber app
 * 我从来没有设计过，就是看了一些uber的文章
 * <p>
 * 面试官当时问我，假设我是ceo，要给一帮developers讲解uber app上有几大系统，让分配任务给他们，该怎么弄
 * 当时我就晕了，和我看到的设计uber架构不一样啊，我尝试画uber后台架构，数次被面试官打断，说他不想这些
 * 问app应该拆分成几大块（我事后才明白的），是app本身
 * 比如-baidu 1point3acres
 * 1. 登录系统
 * 2. logging系统
 * 3. payment系统
 * 要求拆成10大块，我拆不出来，crying
 * <p>
 * 我上面没答好，老跳到后台去（我之前准备是后台为主555），他就转方向
 * 问我后台细节，比如为什么uber app每隔4s给后台发一个更新token？我也没有答好
 * <p>
 * 请江湖高手能否教授下，一般system design面试官会怎么问，会如何引导你一步步深入？
 * 我的系统轮面试官这个套路是正常的吗？
 * <p>
 * 最后hr说，我挂在算法论和系统论，欢迎我半年后再试
 */

/**
 * https://www.quora.com/Systems-design-What-is-the-software-design-of-the-Uber-App?awc=15748_1551855165_d8eda7394af156e5496d9d428a0f601a&uiv=6&txtv=8&source=awin&medium=ad&campaign=uad_mkt_en_acq_us_awin&set=awin
 * <p>
 * https://hackernoon.com/how-to-build-an-app-like-uber-f93a24fa9a5a
 */

public class Prob88 {

}

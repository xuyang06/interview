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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=456974&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * 第一轮hire manager，问简历和BQ的。简历的project问的还比较细，BQ我只记得一个了：说一下你的三个优点和三个缺点。
 * <p>
 * 第二轮coding，是个在亚麻工作了3年又来uber工作了两年的国人小哥。出了个number of islands的题，
 * follow up是如果二维数组很大很大，memory放不下怎么办？
 * 我一开始说的是类似于demand paging，
 * 把整个数组划分成内存能容纳下的小区域，遇到不在内存中的就swap一下。
 * <p>
 * 后来面试官hint说可以假设数组里绝大部分都是0，只有很少数量的island，
 * 那我就说只要记录下islands的坐标然后进行traverse就行了。
 * follow up没有写码，我说完想法面试官说是对的，
 * 就让我问问题了，整整问了20分钟问题，
 * 不知道是放我水还是想直接挂我了。。。
 * <p>
 * <p>
 * <p>
 * leetcode 267
 * 第三轮bar raiser，感觉这轮挂了。一进门就问BQ，不知道是不是bar raiser需要故意这样？
 * 然后做题，题目是蠡口二路器，我的思路就是计算每个char的数量，
 * 其中odd数量的只能有一个而且要在string本身的odd长度下才行，
 * 然后如果valid的话就把每个char的数量除以2，用这些char生成所有permutation，
 * 再每个加上自己的reverse（如果存在odd的char把它放中间），就得到结果了。但有bug改了半天，
 * 最后一秒钟才debug出来，面试官说你把代码发我邮件我回头再看。。。
 * <p>
 * <p>
 * 第四轮是problem solving/design，国人面试官。本来以为会是system design的，
 * 因为自己毫无基础感觉很慌，没想到并没有问。一开始让实现一个数独的validator，
 * 很快写完了，然后有问如果这个validator是一个大project里的一部分，
 * 或者说是一个class的一部分，你会增加些什么？这就让我很懵了，
 * 说了一些乱七八糟的也没说对。然后就问了第二题，是设计一个数据结构，
 * 能够实现word insert和word search。我一想那不就是Trie吗？
 * 然后就写了个Trie给她。word search的代码她一开始觉得有问题，
 * 口头跑了个case才说服了她。之后就是问答时间了。
 * <p>
 * <p>
 * 160
 * 第五轮是coding，美国人面试官。第一题是蠡口姚柳玲。我没想到two pointer的方法，
 * 说了两个，一个是用hashtable记录第一个list的node，另一个是traverse第一个list的时候修改list，
 * 两个都写了。然后面试官又问如果既不想修改list，又想constant space怎么办？
 * 想了半天没想出来，面完以后才想到two pointer的做法。
 * <p>
 * <p>
 * 第二题是best time to buy and sell stock II，就是允许多次买卖的。
 * 假装自己想出了最优解，说服了面试官，结果他又问假如只允许买卖一次怎么办？
 * 我脑子一秀逗，说在多次买卖的方法上找到max profit的那次就行，
 * 面试官竟然好像也没发现不对，让我写码，写完跑了个case就进入问答时间了。
 * 我回家以后才想到这尼玛好像是错的啊。。。不知道是他真的没发现，还是对我绝望了就不想指出了？
 * <p>
 * <p>
 * <p>
 */

public class Prob77 {
}

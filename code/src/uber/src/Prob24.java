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
 * 是个ABC小哥，感觉已经给我放水了。问一个数组。[1,1,1,1,2,2,2,2,3,3,3,4,4], 给你一个num，比如说2，返回在数组中出现的个数，不保证2一定存在。
 * 楼主脑抽刚开始Binary Search找到了一个2，再往前以及往后，但是这样是不行的。worst case 全是2 就变成O(n)了。
 * 后来支支吾吾了好久，才做出两个Binary Search，一个找startIndex，一个找endIndex，就可以了。
 * <p>
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=443784&extra=page%3D3%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * Leetcode 34
 */

public class Prob24 {
}

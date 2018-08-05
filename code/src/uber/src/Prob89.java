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
 * https://www.1point3acres.com/bbs/thread-454039-1-1.html
 * <p>
 * Uber 10.12 onsite,  感觉面的不错 但还是挂了， LZ还挂了FB 和 Two Sigma，
 * 但只有Uber让我痛心，因为对他家的products很喜欢
 * <p>
 * 一共五轮
 * <p>
 * 第一轮 team manager behavior
 * <p>
 * 第二轮， LRU， follow up 优化删除的算法,现在LRU的size不是用Number of element来算,
 * 而是用byte 比如里面存有: 2 byte data-> 3 byte data -> 8 byte data -> 50 byte data,
 * LRU size 是 65 bytes。现在有另外一个8 bytes 的data 要进来。 因为lru已经有63 bytes的data,
 * 需要删除。 按照原来的算法，50 bytes data 被删除。 但这不是最优化的，最优化的是删除8 byte的data.
 * 这是一个比较Open end 的，LZ最后也只是乱说了一通，后面想想，还是应该把那些rule都搞清楚。
 * recruiter说不错 所以这个可能不是挂点吧
 * <p>
 * <p>
 * 第三轮， Letter Combinations of a Phone Number, 用了DFS 然后BFS。讨论了complexity.
 * 最后他引导我用bit representation 去表达每一个combination，跟着他的思路走就好了，没用写代码
 * <p>
 * <p>
 * 第四轮， bar raiser, behavior
 * <p>
 * <p>
 * 第五轮， 给两个data streams, 第一个是driver的位置和时间点，第一个是rider的。
 * 第一问是算出data stream的起始时间和结束时间。因为是按照时间顺序，所以求第一个data point
 * 和最后一个的就行了。 第二问是求出driver 和 rider碰面的时间点。
 * 和面试官讨论了不同的算法，选了其中一种来code, 具体记不清了。之后我问了面试官你会怎么做，
 * 他说估计就是看rider和driver的距离保持不变一段时间后，取这个距离的开始点。感觉这一轮答得不太好
 * <p>
 * <p>
 * 最后祝大家面试顺利！
 */

public class Prob89 {

}

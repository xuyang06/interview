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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=458345&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * |.|.|x|.|.|.|
 * |.|x|o|x|.|.|
 * |.|.|x|.|.|.|   给坐标(x,y)判断有没有被capture,
 * capture的唯一标准是o周围都是x, 返回true，
 * 其他所有都返回false;我用的BFS，
 * 但貌似不是最优解，我看面试官听我说用BFS的时候挺惊讶的。。。
 * 貌似不是他想要的答案，然而我只会BFS。。。。求过啊
 */

public class Prob72 {
}

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

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=457865&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * Uber店面：
 * 首先先吐槽一下不靠谱的recruitor。第一次打电话聊得好好的，
 * 结果等我想面试了，人找不到了。消失了至少3个礼拜！活不见人死不见尸！
 * 之后那哥们说出去玩了！你妹啊！你不会再找一个人替你！
 * <p>
 * 1. 聊简历，话说Uber的攻城狮真的很牛逼！超级有经。问了两个问题，
 * 每个问题都是我们工程上的痛点！所以好好准备简历！把所有细节都想到了！
 * <p>
 * <p>
 * 2. 设计一个all way stop先到先走。可以把它当成OOD，大家发挥想象力！
 * <p>
 * 3. uber需要给客户发短信，整条message可能会很长，他们就需要把一条长的短信分成很多个短的短信发出去。
 * 但是用户接受到的短信顺序可能和原顺序不一样，所以每条短信后边都要有一个（k/n）
 * 举例：“this is a message, this is a message, this is a message" -->
 * 第一条："this is a message (1/3)"，第二条："this is a message (2/3)"，
 * 第三条："this is a message (3/3)"，你的任务是写一个程序来计算每一个短信的内容。
 * 保证每条短信的字是完整的，而且每条短信要塞进去尽量多的字。
 * 注意（k/n）里边的n有可能是多位的。有可能是（2/5）... 也有可能是（100/1000）...
 * <p>
 * <p>
 * Uber这家公司的面试真心好。很有意思。而且Uber的攻城狮水平也很高！
 * 他们在大力扩张，想学东西的小伙伴，这里是不二的选择！
 * 但是我onsite挂了，挂的我哭笑不得。不过我需要绿卡，现在也有点不敢去startup。
 */

public class Prob74 {

    public static List<String> formMessage(String str, int limit) {
        List<String> res = new ArrayList<>();
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            if (sb.length() + strs[i].length() + (sb.length() == 0 ? 0 : 1) <= limit) {
                if (sb.length() != 0) {
                    sb.append(" ");
                }
                sb.append(strs[i]);
            } else {
                res.add(sb.toString());
                sb = new StringBuilder();
                sb.append(strs[i]);
            }
        }
        if (sb.length() != 0) {
            res.add(sb.toString());
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "Hi Swanky, your Uber is arriving now!";
        int limit = 16;
        List<String> res = formMessage(str, limit);
        for (String item : res) {
            System.out.println(item);
        }
    }

}

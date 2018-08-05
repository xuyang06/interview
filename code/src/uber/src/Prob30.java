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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=458769&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * 约了这周电面，是个华人，人很好，聊了简历，做过的project，问我用什么语言，我说java，
 * 问了java相关问题，问了hashmap，treemap，还有什么想不起来了.
 * <p>
 * 然后做题，题不难，一堆数组，找所有数组重合的element，
 * 用codepair写，我的代码有一些typo，改好了跑过了，
 * 但是低级错误感觉对面试很不好。而且感觉我写代码之前说说说分析的时间太长了，
 * 加上修正代码错误，只来得及面了一道题。感觉是过不了了。
 * <p>
 * 最后问面试官问题，我问了下uber的日常，还有组相关信息，面试官给的回答都很详细又中肯。很感谢。
 */

public class Prob30 {
    /**
     * https://dzone.com/articles/hashmap-vs-treemap-vs
     *
     * This gives us the reason that HashMap should be used if it
     * is thread-safe, since Hashtable has overhead for synchronization.
     *
     *
     * The reason is that HashMap doesn't allow two identical elements.
     * By default, the hashCode() and equals() methods implemented in
     * Object class are used. The default hashCode() method gives distinct
     * integers for distinct objects, and the equals() method only returns
     * true when  two references refer to the same object. Check out the
     * hashCode() and equals() contract if this is not obvious to you.
     *
     *
     * Since TreeMaps are sorted by keys, the object for key has to be able
     * to compare with each other, that's why it has to implement Comparable
     * interface. For example,  you use String as key, because String implements
     * Comparable interface.  Let's change the Dog, and make it comparable.
     *
     *
     * LinkedHashMap is a subclass of HashMap. That means it inherits the
     * features of HashMap. In addition, the linked list preserves the insertion-order.
     * Let's replace the HashMap with LinkedHashMap using the same code used for
     * HashMap.
     *
     *
     *
     *
     * */

}

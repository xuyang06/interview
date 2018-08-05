package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.给⼀一个 target string ， ⼀一个 input 要求 replace 掉 从given index 之后的单词 a->b 如：
 target string：“Hello world!”
 input：{s:0, a:Hello b: Goodbye}
 output:"Goodbye world!"
 要求就是 input ⼀一次性给好⼏几个需要被改的单词 如：{{s:0,a:Hello,b:Goodbye},{s:11,a:!,b:?},{s:6
 a:world,b:friend}}.
 并且每次修改的index 都是基于原来未被修改的target string 所以最终结果就是
 “Goodbye friend？”。还要处理理invalid input。
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=420178&extra=page%
 3D3%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob31 {
}

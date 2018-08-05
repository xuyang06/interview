package google.src;

/**
 * Created by yangxu on 8/4/18.
 * 字符串串化简。要求输⼊入⼀一串串单词，返回⼀一个map 保存缩写与原词的对应关系。例例如：
 internationalization -> i18n 就是只留留头尾两个字符，中间⽤用字符个数代替。但是会有这种情况：
 google -> g4e 与goggle -> g4e 都对应成了了⼀一个缩写，这样的时候，就要扩展缩写⻓长度，继
 续尝试，google -> g4e -> go3e -> goo2e -> goog1e。（PS：本例例中goggle 缩写成g4e，
 google 缩写成goo2g 就可以保证不不重复了了）。
 参考leetcode 527. Word Abbreviation
 Make abbreviation for each word.
 Then, check each word, if there are some strings which have same abbreviation with it,
 increase the prefix.
 */
public class Prob5 {
}

package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.Given one input string array:
 "unit,unit,rate"
 For example:
 "m,cm,100",'usd,eur,0.84","lbs,kg,0.453592","km,m,1000"
 Take a string as input
 "unit,unit", return the exchange rate.
 For example:
 "km,cm" => 100000
 "km,eur" => -1
 如果转换路路径唯⼀一，则是⼀一个搜索问题，如果转换不不为⼀一，那是⼀一个优先搜索问题。如果能有正
 负数，那么每次优先扩展的时候，也需要保存min 和max
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=423760&extra=page%
 3D3%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob43 {
}

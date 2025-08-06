/*
3. 无重复字符的最长子串
已解答
中等
相关标签
premium lock icon
相关企业
提示
给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。

示例 1:

输入: s = "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: s = "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: s = "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

提示：

0 <= s.length <= 5 * 104
s 由英文字母、数字、符号和空格组成
面试中遇到过这道题?
1/5
是
否
通过次数
3,621,523/8.7M
通过率
41.4%
相关标签
icon
相关企业
提示 1
相似题目
评论 (9.6K)

*/
//思路：好好好，全忘了。不过一看到字串，我猜是滑动窗口法
//就看时间复杂度最后是多少吧
//i指向s字符串，startIndex，和endIndex分别指向
/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
     let startIndex = 0;
     let endIndex = 0;
     let result = 0;
     let arr = new Array();
     for(let i = 0; i < s.length; i++) {
          if(!arr.includes(s.charAt(i))) {
               arr.push(s.charAt(i));
               console.log("往里加入："+ s.charAt(i));
               result = Math.max(result, arr.length);
          } else {
               while(arr.includes(s.charAt(i))) {
                   let data = arr.shift();
                    console.log("往外排出：" + data)
               }
               arr.push(s.charAt(i));
               // result = Math.max(result, arr.length);
          }
     }
     return result;
};
let s = "aab";
console.log(lengthOfLongestSubstring(s));


//76. 最小覆盖子串
// 困难
// 相关标签
// 相关企业
// 提示
// 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
//
//
//
// 注意：
//
// 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
// 如果 s 中存在这样的子串，我们保证它是唯一的答案。
//
//
// 示例 1：
//
// 输入：s = "ADOBECODEBANC", t = "ABC"
// 输出："BANC"
// 解释：最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
// 示例 2：
//
// 输入：s = "a", t = "a"
// 输出："a"
// 解释：整个字符串 s 是最小覆盖子串。
// 示例 3:
//
// 输入: s = "a", t = "aa"
// 输出: ""
// 解释: t 中两个字符 'a' 均应包含在 s 的子串中，
// 因此没有符合条件的子字符串，返回空字符串。
//
//
// 提示：
//
// m == s.length
// n == t.length
// 1 <= m, n <= 105
// s 和 t 由英文字母组成

/**
 * @param {string} s
 * @param {string} t
 * @return {string}
 */
// var minWindow = function(s, t) {
//
// };
    let t = "sfsfsdf";
let tStrs = t.split('');
console.log(tStrs)


let arr = [3,4,5,6,8];
let arr2 = arr.slice(0,2);
arr[0] = 999;
console.log(arr2)
let arr3 = arr.splice(0,1,5,6,7,9);
console.log(arr3)
console.log(arr)
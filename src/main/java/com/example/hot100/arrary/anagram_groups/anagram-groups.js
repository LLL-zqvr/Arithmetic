/*
49. 字母异位词分组
已解答
中等
相关标签
相关企业
给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。

字母异位词 是由重新排列源单词的所有字母得到的一个新单词。


示例 1:

输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
示例 2:

输入: strs = [""]
输出: [[""]]
示例 3:

输入: strs = ["a"]
输出: [["a"]]


提示：

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] 仅包含小写字母
*
* */
var groupAnagrams = function(strs) {
    //_是假定存在的一个Lodash的全局对象,Lodash是一个js工具库，作用是降低array、number、objects、string等等的使用难度。
    const g = _.groupBy(strs, s => s.split('').sort().join(''));
    //也就是说， Object.values(g);可以写成 _.values(g);
    return Object.values(g);
};

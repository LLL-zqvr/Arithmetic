
//20. 有效的括号
// 已解答
// 简单
// 相关标签
// 相关企业
// 提示
// 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足：
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
// 每个右括号都有一个对应的相同类型的左括号。
//芜湖，一发入魂，好吧不愧是最经典的简答题
/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const symbolLeft = ['(','[','{'];
    const symbolRight = [')',']','}'];
    let strs = s.split('');
    let left = [];
    for(let i = 0; i < strs.length; i++) {
        if(symbolLeft.includes(strs[i])) {
            left.push(strs[i]);
        }
        if(symbolRight.includes(strs[i])) {
            let sy = left[left.length - 1] ;
            if(sy === '(' && strs[i] === ')' ||sy === '[' && strs[i] === ']' ||sy === '{' && strs[i] === '}') {
                left.pop();
            } else {
                return false;
            }

        }


    }
    if(left.length === 0) {
        return true;
    } else {
        return false;
    }

};
let s = "()[]{}";
console.log(isValid(s));

//执行用时分布
// 6
// ms
// 击败
// 44.46%
// 复杂度分析
// 消耗内存分布
// 55.42
// MB
// 击败
// 40.48%
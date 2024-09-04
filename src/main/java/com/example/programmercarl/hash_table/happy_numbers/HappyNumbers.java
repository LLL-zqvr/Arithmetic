package com.example.programmercarl.hash_table.happy_numbers;

public class HappyNumbers {
    /*
    202. 快乐数
    简单
    相关标签
    相关企业
    编写一个算法来判断一个数 n 是不是快乐数。

    「快乐数」 定义为：

    对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
    然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
    如果这个过程 结果为 1，那么这个数就是快乐数。
    如果 n 是 快乐数 就返回 true ；不是，则返回 false 。



    示例 1：

    输入：n = 19
    输出：true
    解释：
    12 + 92 = 82
    82 + 22 = 68
    62 + 82 = 100
    12 + 02 + 02 = 1
    示例 2：

    输入：n = 2
    输出：false

     */
/*
class Solution {
    public int calculation(int n){
        int sum = 0;
        while(n != 0 ){
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        //悲了，无限循环啊，说明肯定是有什么方法可以判断这个数到底是不是能到1
        //现在难点就是找到这个判断方法。
        //emmmm发现了，一个数字如果知道不是快乐数，那么它后面的计算的数也不是了，可以整一个缓存的东西来记录感觉
        //1是快乐数，2不是，而且2中有循环，于是就可以把这些涉及到的数记下来了
        //2：4，16，37，58，89，145，42，20
        //同理：3：9，8，65，61，37，此时这个37，和2的重合，后面就不用看了。
        //同理，4也
        //从2这里就收获了很多有用的数字，而且2这里还是循环的，，，噢噢噢噢题目的循环说的是有顺序的吧
        //还以为说的是无限不循环笑死，那就简单了。无限循环本就是一个终止条件。
        //那现在思路就很清晰了。先写一个数组，记录那些非快乐数（无论怎么按规则计算都快乐不起来的数字）
        //将计算过程中涉及到的数储存到缓存中，如果被丢入方法中的数字或计算过程中是数组中的那就不用看了，直接丢出去。
        //如果这个数变为1则丢出去然后释放缓存（在这里就是什么都不做啦，说得专业一点嘿嘿）
        //如果这个数循环且数组中无，过程中的数加进缓存中然后丢出去。
        //而且储存的总数组unhappy直接不是数组而是set更简单吧，因为上一题set的那个contains方法就很好用。
        //果然set是主角(- > -)
        //理论存在，实践开始！
        //另：写的时候发现缓存也set就很爽，因为那个方法简直太方便啦！
        //再另：啊哈，想多了，这方法是计算多个数时极大简便计算的，这才一个数，直接体现不到缓存的妙处。
        //不过还是写出来看看。emmm写完了过了，但是还是简化一下代码吧，方便后面看。
        Set<Integer> unhappy = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        int sum = 0;
        while(n != 0){
           sum = calculation(n);
           if(unhappy.contains(sum)){
            return false;
           }
           if(sum == 1){
            return true;
           }
           //看有没有陷入循环(永远都不能是快乐数了)
           if(temp.contains(sum)){
                return false;
           }else{
            temp.add(sum);
            n = sum;
           }


        }
        return false;
    }
}
 */
    /*
    //这道题的答案哈哈，上面那个也对，但是有些冗余代码是用来解决更难一点的题的，不小心发散思维了哈哈
        class Solution {
    public int calculation(int n){
        int sum = 0;
        while(n != 0 ){
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {

        Set<Integer> temp = new HashSet<>();
        int sum = 0;
        while(n != 0){
           sum = calculation(n);
           if(sum == 1){
            return true;
           }
           //看有没有陷入循环(永远都不能是快乐数了)
           if(temp.contains(sum)){
                return false;
           }else{
            temp.add(sum);
            n = sum;
           }


        }
        return false;
    }
}
     */
}
/*
执行用时分布
1
ms
击败
81.14%
复杂度分析
消耗内存分布
39.79
MB
击败
69.84%

 */
# Arithmetic

### Introductions

该仓库记录的是通过学校/网络学习到的算法。多数算法题及相关出自力扣（大概）。旨在练习并记录一些基本的算法。
<br>另：未特别注明的算法代码用的为核心代码模式，特别注明为ACM模式的即为ACM模式。

### Development Environments

- **Idea**

- **Git**

### Finding And Thinking

1. leeCode上的程序执行逻辑好像和idea上的不大一样，
比如`for(int i = left; i <= right; i++){}`,
当left和right相等时，idea会再执行一遍for的内容，
但是leeCode的程序就不会再执行for了。(所以如果在自己的程序里面运行正确但是在leeCode上提交代码发现错误时可以看看是不是因为这个原因。)

2.leeCode上的内存消耗测试是不准的。两次同样的代码测试过后内存消耗都可能天差地别。
(但是不知道时间消耗准不准)
### Update

#### 2024/8/7

1. 收录移除链表(leeCode 203)<br>
   执行用时分布
   1
   ms
   击败
   59.69%
   复杂度分析
   消耗内存分布
   44.32
   MB
   击败
   82.59%
   题解代码差不多，就不过多赘述。

#### 2024/8/6
1. 收录题开发商买土地(ACM模式)(KamaCoder 44)<br>
   (前缀和)
   答案正确
   运行时间：
   2104ms
   消耗内存：
   25700kb<br><br>
   根据较好题解重写代码(也是前缀和，但是多用现成的Math函数简化了计算，增加了代码的可读性)<br>
   本次提交
   答案正确
   运行时间：
   2271ms
   消耗内存：
   29008kb

#### 2024/8/5
1. 收录题区间和(ACM模式)(KamaCoder 58)<br>
   (暴力)超时
   <br><br>
   根据较好题解重写代码(前缀和)(该题特意卡的暴力，目的是引出前缀和)<br>
   本次提交
   答案正确
   运行时间：
   1584ms
   消耗内存：
   58464kb

#### 2024/8/4

1. 收录题螺旋矩阵(leeCode 59)<br>
   执行用时分布
   0
   ms
   击败
   100.00%
   复杂度分析
   消耗内存分布
   40.30
   MB
   击败
   93.65%<br><br>
    根据较好题解重写代码(该题考的是思维，题解的基本思想和我写的一致，但是思路更简洁易懂，可读性大大增强)<br>
   执行用时分布
   0
   ms
   击败
   100.00%
   复杂度分析
   消耗内存分布
   40.30
   MB
   击败
   92.36%

#### 2024/8/2

1. 收录题长度最小的子数组(leeCode 209)<br>
   根据较好题解重写代码(滑动窗口法)(improve)<br><br>
   执行用时分布
   1
   ms
   击败
   99.80%
   复杂度分析
   消耗内存分布
   56.77
   MB
   击败
   28.54%

#### 2024/8/1

1. 收录题原地移除元素(leeCode num.27)<br>
   执行用时分布
   0
   ms
   击败
   100.00%

   消耗内存分布
   41.00
   MB
   击败
   45.27%<br><br>
   根据较好题解重写代码(左右指针法)(improve)<br>
   执行用时分布
   0
   ms
   击败
   100.00%
   
   消耗内存分布
   41.00
   MB
   击败
   45.27%
2. 收录题有序数组的平方(leeCode num.977)<br>
   执行用时分布
   5
   ms
   击败
   21.97%
   复杂度分析
   消耗内存分布
   45.49
   MB
   击败
   89.68%<br><br>
根据较好题解重写代码，将时间复杂度减到1ms(左右指针法)(improve)<br>
   执行用时分布
   1
   ms
   击败
   100.00%
   复杂度分析
   消耗内存分布
   46.28
   MB
   击败
   66.15%

#### 2024/7/31

1. 收录题二分法(leeCode num.705)<br>
   执行用时分布
   0
   ms
   击败
   100.00%

   消耗内存分布
   44.46
   MB
   击败
   94.87%<br><br>
根据二分法的较好题解重写代码(improve)<br>
   执行用时分布
   0
   ms
   击败
   100.00%
   复杂度分析
   消耗内存分布
   44.55
   MB
   击败
   79.09%
#### 2024/4/25

1. 收录题两数相加(leeCode num.1)

#### 2024/4/25 前

1. 已记录题汉诺塔（leeCode 面试题08.06），全排列，折半查找。

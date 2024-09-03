package com.example.programmercarl.hash_table.the_intersection_of_two_arrays;

public class TheIntersectionOfTwoArrays {
        /*

        以后都在力扣上直接编码啦，锻炼一下自己。走出idea这个舒适圈。

        349. 两个数组的交集
        简单
        相关标签
        相关企业
        给定两个数组 nums1 和 nums2 ，返回 它们的
        交集
         。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。



        示例 1：

        输入：nums1 = [1,2,2,1], nums2 = [2,2]
        输出：[2]
        示例 2：

        输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        输出：[9,4]
        解释：[4,9] 也是可通过的


        提示：

        1 <= nums1.length, nums2.length <= 1000
        0 <= nums1[i], nums2[i] <= 1000
         */
    /*
    答案：
        class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //试一试写前一题的思路

        int[] record = new int[10001];
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            record[nums1[i]] = 1;
        }
        for(int i = 0; i < nums2.length; i++){
            if(record[nums2[i]] == 1){
                set.add(nums2[i]);
            }
        }
         Iterator<Integer> it = set.iterator();
        int i = 0;
        int[] result = new int[set.size()];
        while (it.hasNext()) {
            result[i] = it.next();
            i++;
        }
        return result;


    }
}
     */
}
/*
执行用时分布
3
ms
击败
49.90%
复杂度分析
消耗内存分布
43.73
MB
击败
5.00%
 */
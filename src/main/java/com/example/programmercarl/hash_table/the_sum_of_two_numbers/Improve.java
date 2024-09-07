package com.example.programmercarl.hash_table.the_sum_of_two_numbers;

public class Improve {
    /*
    C++中map，有三种类型：

    映射	底层实现	是否有序	数值是否可以重复	能否更改数值	查询效率	增删效率
    std::map	红黑树	key有序	key不可重复	key不可修改	O(log n)	O(log n)
    std::multimap	红黑树	key有序	key可重复	key不可修改	O(log n)	O(log n)
    std::unordered_map	哈希表	key无序	key不可重复	key不可修改	O(1)	O(1)
    std::unordered_map 底层实现为哈希表，std::map 和std::multimap 的底层实现是红黑树。
     */
    /*
    使用哈希表：
    //使用哈希表
    //注：这里的map中key储存的是数组值，value储存的是数组下标。
public int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
    if(nums == null || nums.length == 0){
        return res;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
        int temp = target - nums[i];   // 遍历当前元素，并在map中寻找是否有匹配的key
        if(map.containsKey(temp)){
            res[1] = i;
            res[0] = map.get(temp);
            break;
        }
        map.put(nums[i], i);    // 如果没找到匹配对，就把访问过的元素和下标加入到map中
    }
    return res;
}
     */
}

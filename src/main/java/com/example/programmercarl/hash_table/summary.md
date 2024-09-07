# 哈希表

### 哈希表理论基础
首先什么是哈希表，哈希表（英文名字为Hash table，国内也有一些算法书籍翻译为散列表，大家看到这两个名称知道都是指hash table就可以了）。

哈希表是根据关键码的值而直接进行访问的数据结构。

这么官方的解释可能有点懵，其实直白来讲其实数组就是一张哈希表。

哈希表中关键码就是数组的索引下标，然后通过下标直接访问数组中的元素。

那么哈希表能解决什么问题呢，一般哈希表都是用来快速判断一个元素是否出现集合里。

例如要查询一个名字是否在这所学校里。

要枚举的话时间复杂度是O(n)，但如果使用哈希表的话， 只需要O(1)就可以做到。

我们只需要初始化把这所学校里学生的名字都存在哈希表里，在查询的时候通过索引直接就可以知道这位同学在不在这所学校里了。

将学生姓名映射到哈希表上就涉及到了hash function ，也就是哈希函数。

### 哈希函数

哈希函数，把学生的姓名直接映射为哈希表上的索引，然后就可以通过查询索引下标快速知道这位同学是否在这所学校里了。

哈希函数如下图所示，通过hashCode把名字转化为数值，一般hashcode是通过特定编码方式，可以将其他数据格式转化为不同的数值，这样就把学生名字映射为哈希表上的索引数字了。

### 哈希碰撞

#### 拉链法
刚刚小李和小王在索引1的位置发生了冲突，发生冲突的元素都被存储在链表中。 这样我们就可以通过索引找到小李和小王了 

其实拉链法就是要选择适当的哈希表的大小，这样既不会因为数组空值而浪费大量内存，也不会因为链表太长而在查找上浪费太多时间。

#### 线性探测法

使用线性探测法，一定要保证tableSize大于dataSize。 我们需要依靠哈希表中的空位来解决碰撞问题。

例如冲突的位置，放了小李，那么就向下找一个空位放置小王的信息。所以要求tableSize一定要大于dataSize ，要不然哈希表上就没有空置的位置来存放 冲突的数据了。

### 常见的三种哈希结构

当我们想使用哈希法来解决问题的时候，我们一般会选择如下三种数据结构。

- 数组
- set （集合）
- map(映射)

### set的使用

#### set的遍历

`
Iterator<Integer> it = set.iterator();
while (it.hasNext()) {
System.out.println(it.next());
            }
` 

或者 

`for (Integer integer : set) {
System.out.println(integer);
            }`
### map的使用

#### 常见的三种map
- HashMap：基于哈希表实现，具有快速的查找和插入操作，适用于需要快速查找键值对的场景。
- TreeMap：基于红黑树实现，可以对键进行排序，并提供了一系列与排序相关的方法，适用于需要对键进行排序的场景。
- LinkedHashMap：基于哈希表和链表实现，保持键值对的插入顺序，适用于需要保持插入顺序的场景。
![截图](the_sum_of_two_numbers/img_2.png) 

##### Hashmap

HashMap是Map接口的一个常见实现类，它基于哈希表实现，可以提供快速的查找和插入操作。以下是一些常用的HashMap方法：

- put(K key, V value): 将指定的键值对添加到HashMap中。
- remove(Object key): 从HashMap中移除指定键的键值对。
- get(Object key): 返回指定键对应的值。
- containsKey(Object key): 检查HashMap中是否包含指定的键。
- containsValue(Object value): 检查HashMap中是否包含指定的值。
- size(): 返回HashMap中键值对的数量。

##### Treemap

TreeMap是Map接口的另一个常见实现类，它基于红黑树实现，可以对键进行排序，并提供了一系列与排序相关的方法。以下是一些常用的TreeMap方法：

- put(K key, V value): 将指定的键值对添加到TreeMap中。
- remove(Object key): 从TreeMap中移除指定键的键值对。
- get(Object key): 返回指定键对应的值。
- containsKey(Object key): 检查TreeMap中是否包含指定的键。
- size(): 返回TreeMap中键值对的数量。
- firstKey(): 返回TreeMap中的第一个键。
- lastKey(): 返回TreeMap中的最后一个键。

##### LinkedHashMap

LinkedHashMap是Map接口的另一个实现类，它基于哈希表和链表实现，并保持键值对的插入顺序。以下是一些常用的LinkedHashMap方法：

- put(K key, V value): 将指定的键值对添加到LinkedHashMap中。
- remove(Object key): 从LinkedHashMap中移除指定键的键值对。
- get(Object key): 返回指定键对应的值。
- containsKey(Object key): 检查LinkedHashMap中是否包含指定的键。
- size(): 返回LinkedHashMap中键值对的数量。

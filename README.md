# MyAlgorithm
用来记录自己刷过的一些题(Leetcode)
## 算法
`简单`  
* [两数之和](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code1.java) 
* [反转整数](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code7.java) 
* [回文数](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code9.java) 
* [罗马数字转整数](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code13.java) 
* [最长公共前缀](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code14.java) 
* [有效的括号](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code20.java) 
* [合并两个有序链表](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code21.java) 
* [删除排序数组中的重复项](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code26.java) 
* [移除元素](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code27.java) 
* [实现strStr()](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code28.java) 
* [搜索插入位置](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code35.java) 
* [报数](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code38.java) 
* [最大子序和](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code53.java) 
* [最后一个单词的长度](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code58.java) 
* [加一](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code66.java) 
* [二进制求和](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code67.java) 
* [x的平方根](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code69.java) 
* [删除排序链表中的重复元素](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code83.java) 
* [合并两个有序数组](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code88.java) 
* [相同的树](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/easy/Code100.java) 

`中等` 
* [两数相加](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/middle/Code2.java) 

## 比较经典的算法
`动态规划`
* [最长回文子串](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/middle/Code5.java)  
「比如输入`abada`则返回`aba`，输入`aaaa`则返回`aaaa`」    
「利用动态规划记录ij位置上是否为回文(ij为起止坐标的子串)」    
「比如判断`abefba`是否回文，就判断首尾a和a是否相同，`相同`，则判断子串(befb)是否为回文，如果是则`abeffa`为回文」    
「然后判断`befb`是否回文，就判断首尾b和b是否相同，`相同`，则判断子串(ef)是否为回文，如果是则`befb`为回文，进而`abefba`为回文」    
「然后判断`ef`是否回文，就判断首尾e和f是否相同，`不相同`，则以上的`abefba`，`befb`，`ef`都不是回文」    
 需要注意的是i和j的顺序，防止出现短串没判断就判断长串(具体看代码注释)      

## [剑指offer](https://www.nowcoder.com/ta/coding-interviews)
`动态规划`
* [变态跳台阶](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/practice/Code9.java)  
「在已有的`跳台阶`基础上加上了可以跳1-n阶,所以由`f(n)=f(n-1)+f(n-1)`转为`f(n)=f(n-1)+f(n-2)+...+f(n-n)`即可」    
`二叉树`
* [重构二叉树](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/practice/Code4.java)  
「在给定的先序遍历和中序遍历还原二叉树」    
「1.先序的第一个为父节点(root)」  
「2.去中序找到root,左边是左子树,右边是右子树」
「3.然后左右子树重复1 2操作...」  

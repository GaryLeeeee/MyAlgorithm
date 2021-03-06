| leetcode | 比较经典的算法 |剑指offer|公司笔试真题|
| :---: | :----: | :---: | :----: |
| [:art:](#art-算法) | [:pencil2:](#pencil2-比较经典的算法) | [:zap:](#zap-剑指offer) | [:memo:](#memo-公司笔试真题) |
## :art: 算法
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

## :pencil2: 比较经典的算法
`动态规划`
* [最长回文子串](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/leetcode/middle/Code5.java)  
「比如输入`abada`则返回`aba`，输入`aaaa`则返回`aaaa`」    
「利用动态规划记录ij位置上是否为回文(ij为起止坐标的子串)」    
「比如判断`abefba`是否回文，就判断首尾a和a是否相同，`相同`，则判断子串(befb)是否为回文，如果是则`abeffa`为回文」    
「然后判断`befb`是否回文，就判断首尾b和b是否相同，`相同`，则判断子串(ef)是否为回文，如果是则`befb`为回文，进而`abefba`为回文」    
「然后判断`ef`是否回文，就判断首尾e和f是否相同，`不相同`，则以上的`abefba`，`befb`，`ef`都不是回文」    
 需要注意的是i和j的顺序，防止出现短串没判断就判断长串(具体看代码注释)      

## :zap: [剑指offer](https://www.nowcoder.com/ta/coding-interviews)
`动态规划`
* [变态跳台阶](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/practice/Code9.java)  
「在已有的`跳台阶`基础上加上了可以跳1-n阶,所以由`f(n)=f(n-1)+f(n-1)`转为`f(n)=f(n-1)+f(n-2)+...+f(n-n)`即可」    

`二叉树`
* [重构二叉树](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/practice/Code4.java)  
「在给定的先序遍历和中序遍历还原二叉树」    
「1.先序的第一个为父节点(root)」  
「2.去中序找到root,左边是左子树,右边是右子树」
「3.然后左右子树重复1 2操作...」  

`二进制`
* [二进制中1的个数](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/practice/Code11.java)    
「对于该种题型应该尽量用位运算(&等)计算，不然会很麻烦，毕竟是基于二进制的」     
「本题思路是从后往前计算1的个数,并将其去除」    
「1101 1100 & 1101 1011 = 1101 1000」    
「1101 1000 & 1101 0111 = 1101 0000」   
「1101 0000 & 1100 1111 = 1100 0000」    
   ...    
「1000 0000 & 0111 1011 = 0000 0000」    
「运行到这里后为0000 0000了就可以停止循环了,然后计算&的次数即有1的个数」    

## :memo: 公司笔试真题
### 360
* [城市修建](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/company/c_360/Code1.java)    
`有一个城市需要修建，给你N个民居的坐标X,Y，问把这么多民居全都包进城市的话，城市所需最小面积是多少（注意，城市为平行于坐标轴的正方形）`     
「比较每次输入的x和y，比如得出最大的xy，最小的xy    
     然后用xMax-xMin与yMax-yMin比较取出最大值即可」
     
### 360 2020届秋招正式批笔试
* [散步](https://github.com/GaryLeeeee/MyAlgorithm/blob/master/src/bishi/capmus360/Main2.java)    
`小A在一条笔直的路上走，该路平均分为m个点，小A可能从任意一个点出发`    
`n表示小A每个阶段记录的路程(每一段都是单向)，不同段可能是同向可能是反向的`     
`问这样的终点有几个？`      
「用`二叉树`来存储状态，表示从当前点向左或向右移动的情况(对应左右子树)       
     然后查看是否有一条路径的value都在1->length上，即可当`起点`」    

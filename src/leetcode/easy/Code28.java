package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-09 21:24.
 * 28. 实现strStr()(https://leetcode-cn.com/problems/implement-strstr/description/)
 * 实现 strStr() 函数。
 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 示例 1:
 输入: haystack = "hello", needle = "ll"
 输出: 2
 * 示例 2:
 输入: haystack = "aaaaa", needle = "bba"
 输出: -1
 */
public class Code28 {
    static class Solution10{
        public int strStr(String haystack, String needle) {
            //应该用<=而不是<,比如bba在aaaaa外部循环只需要循环三次，即5-3=2，可视为下标，即0,1,2（三次）
            for(int i=0;i<=haystack.length()-needle.length();i++){
                boolean isTrue = true;
                for(int j=0;j<needle.length();j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        isTrue = false;
                        break;
                    }
                }
                if(isTrue)
                    return i;
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(new Solution10().strStr(haystack,needle));
    }
}

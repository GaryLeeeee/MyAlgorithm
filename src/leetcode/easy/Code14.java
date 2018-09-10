package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-06 18:34.
 * 14. 最长公共前缀(https://leetcode-cn.com/problems/longest-common-prefix/description/)
 *
 * 描述：编写一个函数来查找字符串数组中的最长公共前缀。
 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 输出: "fl"
 */
public class Code14 {
    static class Solution5 {
        public String longestCommonPrefix(String[] strs) {
            String common = "";//存储公共前缀
            if(strs.length>0)
                 common = strs[0];
            for (int i = 1; i < strs.length; i++) {
                int num = 0;
                StringBuffer temp = new StringBuffer();
                while (num<common.length()&&num<strs[i].length()&&common.charAt(num) == strs[i].charAt(num)) {
                    temp.append(common.charAt(num));
                    num++;
                }
                common = temp.toString();
            }
            return common;
        }
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println("result:"+new Solution5().longestCommonPrefix(strs));
    }
}

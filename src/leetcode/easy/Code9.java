package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-05 00:11.
 * 9. 回文数(https://leetcode-cn.com/problems/palindrome-number/description/)
 *
 * 描述：判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 2:
 * 输入: 10
 输出: false
 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class Code9 {
    static class Solution3 {
        //思路:与反转数类似,反转后与原数相比,相同则为回文数
        public boolean isPalindrome(int x) {
            if(x<0)
                return false;
            long num = 0;
            int temp = Math.abs(x);
            while(temp>0){
                num *= 10;
                num += temp%10;
                if(num>Integer.MAX_VALUE)
                    return false;
                temp /= 10;
            }
            return x==num;
        }
    }

    public static void main(String[] args) {
        int x = 12321;
        System.out.println(new Solution3().isPalindrome(x));
    }
}

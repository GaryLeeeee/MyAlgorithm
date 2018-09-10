package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-04 23:11.
 * 7. 反转整数(https://leetcode-cn.com/problems/reverse-integer/solution/)
 *
 * 描述：给定一个 32 位有符号整数，将整数中的数字进行反转。
 *
 * 示例：
 输入: -123
 输出: -321
 */
public class Code7 {
    static class Solution2 {
        //示例:123->321
        //思路:将x的个位作为反转后的数num的最高位(其他位数同理)
        public int reverse(int x) {
            long num = 0;//用long存储反转后的整数(防止溢出)
            int temp = Math.abs(x);
            while(temp>0){
                num *= 10;
                num += temp%10;
                //判断反转后的整数是否溢出,是则返回0
                if(num>Integer.MAX_VALUE)
                    return 0;
                temp = temp/10;
            }
            return (int) (x>0?num:-num);//判断正负
        }
    }
    public static void main(String[] args) {
        int x = 2454536;
        System.out.println(new Solution2().reverse(x));
    }
}

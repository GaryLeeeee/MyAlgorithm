package leetcode.easy;

/**
 * Created by GaryLee on 2018-12-14 21:41.
 * 231.2的幂(https://leetcode-cn.com/problems/power-of-two/)
 */
public class Code231 {
    //为true的数都是二进制中某一位为1，其他位为0的树
    //例如:1000,0100,0010,0001
    //上面的例子-1得:0111,0011,0001,0000
    //可以发现但n和n-1每一位上的1都不重复
    //并且2的n次幂都是大于0
    public static boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(10));
        System.out.println(isPowerOfTwo(-2147483648));
    }
}

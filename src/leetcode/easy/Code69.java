package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-25 17:54.
 * 69.x 的平方根(https://leetcode-cn.com/problems/sqrtx/)
 */
public class Code69 {
    //这么简单？应该不是这么解
    public static int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
    //二分法(demo)
    public static int mySqrt2(int x) {
        int down = 0;
        int up = x;
        while(down<=up){
            int mid = (down + up)/2;
            long square = (long)mid * mid;//这一步很有必要！避免square溢出(int)
            if(square == x)
                return mid;
            else if(square > x)
                up = mid - 1;
            else
                down = mid + 1;
        }
        return up;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(258));
        System.out.println(mySqrt2(258));
    }
}

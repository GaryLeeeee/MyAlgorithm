package leetcode.easy;

/**
 * Created by GaryLee on 2019-07-23 17:43.
 * 198.打家劫舍(https://leetcode-cn.com/problems/house-robber)
 * 还是动态规划
 * 注意不能相邻，所以每次当前数(n)与前前个数(n-2)max的和  与  前个数(n-1)的max作比较得出 当前位置(n)的max
 */
public class Code198 {
    //遍历过去，每次都设置当前max
    //n-2 n-1 n n+1 n+2
    //max的求法：求n的max，就将 n+(n-2的max) 与 (n-1的max)比较(做Math.max(a,b))
    public static int rob(int[] nums) {
        int before = 0;//存放包含n-2的最大值
        int after = 0;//存放包含n-1的最大值
        int max = 0;//存放结果
        for(int num:nums){
            max = Math.max(num+before,after);
            before = after;
            after = max;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}

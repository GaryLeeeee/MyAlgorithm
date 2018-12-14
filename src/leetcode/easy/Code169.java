package leetcode.easy;

/**
 * Created by GaryLee on 2018-11-06 09:59.
 * 169.求众数(https://leetcode-cn.com/problems/majority-element/)
 */
public class Code169 {
    public static int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length;i++) {
            if (count == 0){
                major = nums[i];
                count = 1;
            }else if(nums[i] == major) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int[] sums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(sums));
    }
}

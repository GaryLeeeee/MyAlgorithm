package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-24 01:07.
 * 53.最大子序和(https://leetcode-cn.com/problems/maximum-subarray/)
 * 这一题比较难
 */
public class Code53 {
    //扫描法(复杂度为O(n))
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];//存储最大和
        int temp = nums[0];//存储循环到的位置的和
        for(int i=1;i<nums.length;i++){
            if(temp<0)
                temp = nums[i];//当temp为负数，且当前nums[i]为正数，则连续子数组目前以i开始
            else
                temp += nums[i];//否则加上当前数

            if(temp>sum)
                sum = temp;//当上面加完当前数或temp赋值为当前数后，大于当前sum，则取代sum
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

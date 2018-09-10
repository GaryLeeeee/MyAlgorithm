package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by GaryLee on 2018-09-04 22:56.
 * 1. 两数之和(https://leetcode-cn.com/problems/two-sum/description/)
 *
 * 描述：
 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 示例：
 给定 nums = [2, 7, 11, 15], target = 9
 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 */
public class Code1 {
    static class Solution1 {
        //暴力法
        public int[] twoSum(int[] nums, int target) {
            for(int x=0;x<nums.length-1;x++){
                for(int y=x+1;y<nums.length;y++){
                    if(nums[x]+nums[y]==target) {
                        System.out.println("x:"+x);
                        System.out.println("y:"+y);
                        return new int[]{x, y};
                    }
                }
            }
            return null;
        }
        //哈希表版本
        public int[] twoSum2(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],i);
            }
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=-1)
                    return new int[]{i,map.get(target-nums[i])};
            }
            throw new IllegalArgumentException("No two sum solution");
        }
        //一遍哈希表
        public int[] twoSum3(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=-1)
                    return new int[]{i,map.get(target-nums[i])};
                map.put(nums[i],i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int sum[] = new Solution1().twoSum(nums,target);
        System.out.println(Arrays.toString(sum));//返回[0, 1]格式的字符串
    }
}


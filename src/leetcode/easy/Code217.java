package leetcode.easy;

import java.util.HashSet;

/**
 * Created by GaryLee on 2018-12-14 21:29.
 * 217.存在重复元素(https://leetcode-cn.com/problems/contains-duplicate/)
 */
public class Code217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num))
                return true;
            else
                set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}

package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-23 22:53.
 * 35.搜索插入位置(https://leetcode-cn.com/problems/search-insert-position/)
 */
public class Code35 {
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(i==0&&target<=nums[i])
                return 0;
            else if(i!=0&&target>nums[i-1]&&target<=nums[i])
                return i;
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,3,5,6};
        int target = 8;
        System.out.println(searchInsert(nums,target));
    }
}

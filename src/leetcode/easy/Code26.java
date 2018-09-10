package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-09 14:11.
 * 26. 删除排序数组中的重复项(https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/description/)
 * 描述:给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 示例 2:
 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 你不需要考虑数组中超出新长度后面的元素。
 */
public class Code26 {
    static class Solution8{
        //思路：在有序数组中，依次判断与前一个数大小，
        //      如果不同，则接到上一个数后面(两个数组覆盖成一个)
        public int removeDuplicates(int[] nums) {
            if(nums.length==0)
                return 0;
            int len = 0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[len]){
                    nums[++len]=nums[i];
                }
            }
            return len+1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3};
        int len = new Solution8().removeDuplicates(nums);
        for(int i=0;i<len;i++)
            System.out.print(nums[i]+" ");
    }
}

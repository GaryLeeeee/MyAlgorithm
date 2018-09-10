package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-09 19:10.
 * 27. 移除元素(https://leetcode-cn.com/problems/remove-element/description/)
 * 描述：给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 示例 1:
 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 注意这五个元素可为任意顺序。
 你不需要考虑数组中超出新长度后面的元素。
 */
public class Code27 {
    static class Solution9{
        public int removeElement(int[] nums, int val) {
            if(nums.length == 0)
                return 0;
            int len = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[len]=nums[i];
                    len++;
                }
            }
            return len;
        }
    }
    public static void main(String[] args) {
//        int[] nums = {0,1,2,2,3,0,4,2};
        int[] nums = {3,2,2,3};
        int val = 2;
        int num = new Solution9().removeElement(nums,val);
        for(int i=0;i<num;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

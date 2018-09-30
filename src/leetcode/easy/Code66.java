package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-25 09:09.
 * 66.加一(https://leetcode-cn.com/problems/plus-one/)
 */
public class Code66 {
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1;i>=0;i--){
            int sum = digits[i] + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
        }
        //最高位进1判断
        if(carry==1){
            int nums[] = new int[digits.length + 1];
            nums[0] = 1;
            return nums;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {9,9,9,9};
        for(int num:plusOne(nums))
            System.out.println(num);

    }
}

package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by GaryLee on 2018-11-01 14:56.
 * 136.只出现一次的数字(https://leetcode-cn.com/problems/single-number/)
 * !!!新的知识点：位运算
 */
public class Code136 {
    //用List存，如果已有则移除，最后剩下的即为结果
    public static int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            if(!list.contains(num))
                list.add(num);
            else
                list.remove(new Integer(num));
        }
        return list.get(0);
    }
    //位运算(按位异或)
    //相同位不同则返回1,否则为0,如1001和0010,返回1011
    //本题可理解为每两个相同的位运算一次后返回0000,最后剩下单独的数字与0000运算，结果则是该数字
    public static int singleNumber2(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n = n ^ num;
            System.out.println("what?"+n);
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber2(nums));

    }
}

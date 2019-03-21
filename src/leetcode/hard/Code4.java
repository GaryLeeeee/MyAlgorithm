package leetcode.hard;

/**
 * Created by GaryLee on 2019-02-11 17:30.
 * 寻找两个有序数组的中位数(https://leetcode-cn.com/problems/median-of-two-sorted-arrays/)
 */
public class Code4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];
        int i = 0, j = 0, n = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                array[n] = nums1[i];
                i++;n++;
            } else {
                array[n] = nums2[j];
                j++;n++;
            }
        }
        while(i < nums1.length){
            array[n] = nums1[i];
            i++;n++;
        }
        while(j < nums2.length){
            array[n] = nums2[j];
            j++;n++;
        }
        //数组合并完成
        for(int a:array)
            System.out.print(a+" ");

        if(array.length%2!=0){
            //中位数为中间那个
            return array[array.length/2];

        }else {
            int left = array[array.length/2-1];
            int right = array[array.length/2];
            return (double)(left+right)/2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {2,4};
        double i = findMedianSortedArrays(nums1,nums2);
        System.out.println("中位数："+i);
    }
}

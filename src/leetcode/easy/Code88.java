package leetcode.easy;

/**
 * Created by GaryLee on 2018-09-29 00:10.
 * 88.合并两个有序数组(https://leetcode-cn.com/problems/merge-sorted-array/)
 */
public class Code88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        //从后面开始递减判断大小
        while(m>0&&n>0){
            if(nums1[m-1] >= nums2[n-1]) {
                nums1[length-1] = nums1[m - 1];
                m--;
                length--;
            }else{
                nums1[length-1] = nums2[n - 1];
                n--;
                length--;
            }
        }
        //当存在nums2中的数比nums1[0]还小的值，则将nums2剩余的数一个个排列到nums1前面
        //(此时不会存在m>0,因为对应数量m的元素本来就放在nums1数组中)
        while(n>0){
            nums1[length-1] = nums2[n - 1];
            n--;
            length--;
        }
    }

    public static void main(String[] args) {
        int nums1[] = {0};
        int nums2[] = {1};
        int m = 0,n=1;
        merge(nums1,m,nums2,n);
        for(int i:nums1)
            System.out.println(i);
    }
}

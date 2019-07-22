package sort;

import java.util.Arrays;

/**
 * Created by GaryLee on 2019-07-19 20:17.
 * 3 5 8 1 2 9 4 7 6
 1 2 3 4 5 6 7 8 9
 */
public class QuickSort{

    public static int[] sortQuick(int[] arr, int left, int right){
        int pivot = arr[left];//因为已经获取到值了，所以后面随便swap
        int start = left;//左哨兵(坐标)
        int end = right;
        while(start<end){
            //从右往左遍历，将小于pivot的移动左边去
            //否则右哨兵--
            while (start<end && arr[end] >=pivot){
                end--;//
            }
            arr[start] = arr[end];
            while(start<end&&arr[start]<pivot){
                start++;
            }
            arr[end] = arr[start];
        }
        //运行到这里说明start=end,就把这个数设为pivot
        //用start与end坐标均可
        arr[start] = pivot;//到这一步才到pivot赋到中间去(过程中该数不见，用于其他数temp交换)
        if(start > left)
            sortQuick(arr,left,start-1);
        if(end < right)
            sortQuick(arr,start+1,right);



        return arr;
    }
    public static void main(String[] args) {
        int[] arr  = {3,5,8,1,2,9,4,7,6};
        for(Integer i:arr)
            System.out.print(i+" ");
        System.out.println();
        int[] after = sortQuick(arr,0,arr.length-1);
        for(Integer i:after)
            System.out.print(i+" ");
    }
}

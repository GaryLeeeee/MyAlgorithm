package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by GaryLee on 2019-07-22 15:42.
 * 快排v2.0
 */
public class QuickSort2 {

    static void sort(int[] arr){
        quickSort(arr,0,arr.length-1);//传的是坐标值(基0)
    }

    static void quickSort(int[] arr,int left,int right){
        int start = left;//设置左哨兵
        int end = right;//设置右哨兵
        int pivot = arr[left];//还是需要设置！！！不然后面arr会修改到！！！
        //默认基准值pivot就是第一个(arr[left])
        while(start < end){//当左哨兵还在右哨兵左边(即两个还没重合)
            //右哨兵从右边往左走，如果找到比pivot小的就与start位置上元素交换，否则end--继续走
            //=是如果是相同的也没必要换了
            while(start < end && arr[end] >= pivot){//如果重合了就要及时判断,否则会right会超过start
                end --;
            }
            swap(arr,start,end);

//            System.out.println("右边"+Arrays.toString(arr));
            //左哨兵同理
            while(start < end && arr[start] < pivot){
                start ++;
            }
            swap(arr,start,end);


//            System.out.println("左边"+Arrays.toString(arr));
        }
        //当基准数大于左边，小于右边，就完成了
        //接下来就是对左边和右边无序数组进行递归排序
        if(start > left)
            quickSort(arr,left,start-1);//排序左边的(如果左边只剩一个就不排序)
        if(end < right)
            quickSort(arr,end+1,right);

    }

    //交换数组两个下标值
    static void swap(int[] arr,int left,int right){
        int temp  = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
//        System.out.println("交换了"+left+"和"+right);
    }

    public static void main(String[] args) {
        int[] arr= {3,5,8,1,2,9,4,7,6};
//        System.out.println(Arrays.toString(arr));
//        swap(arr,0,1);
//        System.out.println(Arrays.toString(arr));
        System.out.println("排序前:"+Arrays.toString(arr));
        sort(arr);
        System.out.println("排序后:"+Arrays.toString(arr));
    }
}

package leetcode.middle;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by GaryLee on 2019-04-24 00:54.
 */
public class Code435 {
    public static int eraseOverlapIntervals(int[][] intervals) {

        if(intervals.length==0)
            return 0;

        int num = 1;//存放最多能组成的不重叠区间个数
        int after = intervals[0][1];//存放后面的数
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<after)
                continue;
            after = intervals[i][1];
            num++;

        }

        return intervals.length-num;
    }
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,2},{1,3},{2,3},{3,4}};
        int[][] intervals2 = new int[][]{{1,2}};
        System.out.println(eraseOverlapIntervals(intervals));
        System.out.println(eraseOverlapIntervals(intervals2));
    }
}

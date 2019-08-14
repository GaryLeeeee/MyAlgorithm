package company.c_360;
import java.util.*;
/**
 * Created by GaryLee on 2019-08-14 12:23.
 * from:360公司2019校招笔试编程题合集
 * 城市修建
 * 有一个城市需要修建，给你N个民居的坐标X,Y，问把这么多民居全都包进城市的话，城市所需最小面积是多少（注意，城市为平行于坐标轴的正方形）
 * 输入
 * 2
 * 0 0
 * 2 2
 * 输出
 * 4
 */
public class Code1 {
    /**
     * 比较每次输入的x和y，比如得出最大的xy，最小的xy
     * 然后用xMax-xMin与yMax-yMin比较取出最大值即可
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int xMax = Integer.MIN_VALUE,xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE,yMin = Integer.MAX_VALUE;

        for(int i=0;i<num;i++){
            int x = sc.nextInt();
            xMax = Math.max(xMax,x);
            xMin = Math.min(xMin,x);

            int y = sc.nextInt();
            yMax = Math.max(yMax,y);
            yMin = Math.min(yMin,y);
        }
        long max = Math.max(yMax-yMin,xMax-xMin);
        System.out.println(max * max);
    }
}

package bishi.bilibili;

import java.util.Scanner;

/**
 * Created by GaryLee on 2019-08-20 18:58.
 * 背包问题(在负重允许的情况下求最大价值)
 * 5
 10
 2 2 6 5 4
 6 3 5 4 6
 返回
 15
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = sc.nextInt();
        int w[] = new int[num+1];
        int v[] = new int[num+1];
        for(int i=1;i<num+1;i++)
            w[i] = sc.nextInt();
        for(int j=1;j<num+1;j++)
            v[j] = sc.nextInt();

        //动态规划法 或者 贪心法
        int[][] arr = new int[num+1][sum+1];

        for(int j=0;j<num+1;j++)
            arr[j][0] = 0;
        for(int i=0;i<sum+1;i++)
            arr[0][i] = 0;

        // TODO: 2019/8/20 0020
        for(int i=1;i<num+1;i++){
            for(int j=1;j<sum+1;j++){
                //可以小于或等于最大容量sum
                //num=5,sum=10
                if(w[i]<=j)
                    arr[i][j] = Math.max(arr[i-1][j],arr[i-1][j-w[i]]+v[i]);//取当前最大值
                else    //这里必须用else,不能省略
                arr[i][j] = arr[i-1][j];
            }
        }

        int result = Integer.MIN_VALUE;
        for(int i=0;i<num+1;i++){
            for(int j=0;j<sum+1;j++){
                result = Math.max(result,arr[i][j]);
            }
        }
        System.out.println(result);


    }
}

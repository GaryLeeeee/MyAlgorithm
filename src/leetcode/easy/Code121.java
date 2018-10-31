package leetcode.easy;

/**
 * Created by GaryLee on 2018-10-19 13:35.
 * 121.买卖股票的最佳时机（https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/）
 */
public class Code121 {
    //暴力法
    public static int maxProfit(int[] prices) {
        int max = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>max)
                    max = prices[j] - prices[i];
            }
        }

        return max;
    }
    //一次遍历
    public static int maxProfit2(int[] prices) {
        if(prices.length<2)
            return 0;
        int min = prices[0],max = 0;
        for(int i=1;i<prices.length;i++){
            int temp = prices[i] ;
            if(temp<min)
                min = temp;
            if(temp-min>max)
                max = temp - min;

        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {1,6};
        System.out.println(maxProfit2(prices));
    }
}

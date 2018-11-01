package leetcode.easy;

/**
 * Created by GaryLee on 2018-10-31 21:13.
 * 122.买卖股票的最佳时机（https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii//）
 */
public class Code122 {
    //简单的遍历
    public static int maxProfit(int[] prices) {
        int max = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                max += prices[i] - prices[i-1];
        }
        return max;
    }
    //一次遍历
    public static int maxProfit2(int[] prices){
        int i = 0;
        int max = 0;
        int top = prices[0],bottom=prices[0];
        while(i < prices.length-1) {
            //7,1,5,3,6,4
            //循环找出最小值买入
            while (i < prices.length - 1 && prices[i] > prices[i + 1])
                i++;
            bottom = prices[i];
            //循环找出最大值卖出
            while (i < prices.length - 1 && prices[i] < prices[i + 1])
                i++;
            top = prices[i];
            //最大利益加上利润
            max += top - bottom;
        }
        return max;
    }
    //暴力法就不列举了
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int prices2[] = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));

        System.out.println(maxProfit2(prices));
        System.out.println(maxProfit2(prices2));

    }
}

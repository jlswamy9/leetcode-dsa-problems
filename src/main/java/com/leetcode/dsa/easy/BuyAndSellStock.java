package com.leetcode.dsa.easy;

public class BuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int j=0;
        for(int i=1;i<prices.length;i++){
            if(prices[j] < prices[i]){
                int currentProfit = prices[i] - prices[j];
                maxProfit = Math.max(maxProfit,currentProfit);
            }
            else{
                j = i;
            }
        }

        return maxProfit;
    }
}
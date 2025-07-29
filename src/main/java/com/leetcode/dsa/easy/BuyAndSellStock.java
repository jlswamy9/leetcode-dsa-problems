package com.leetcode.dsa.easy;

public class BuyAndSellStock {
    public static void main(String[] args) {
        /*
        You are given an array prices where prices[i] is the price of a given stock on the ith day.
        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
         */
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
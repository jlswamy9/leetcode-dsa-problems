package com.leetcode.dsa.easy;

public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] indArr = new int[2];
        for(int left=0;left<nums.length;left++){
            int right = left+1;
            while(right < nums.length ){
                int sum = nums[left]+nums[right];
                if(sum == target){
                    indArr[0] = left;
                    indArr[1] = right;
                    break;
                }
                right++;
            }
        }
        return indArr;
    }
}

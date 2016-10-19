package com.algorithm.jumpgame;

public class JumpGame2Greedy {
	
	public static void main(String[] args) {
		int[] input = {1, 2, 0, 1};
		System.out.println(jump(input));
	}
	
	public static int jump(int[] nums) {
        int maxReachableDistance = 0;
        int currentReachableDistance = 0;
        int jumpsForMaxReachableDistance = 0;
        for (int i=0; i<nums.length-1; i++) {
        	currentReachableDistance = Math.max(currentReachableDistance, i+nums[i]);
        	if (i == maxReachableDistance) {
        		jumpsForMaxReachableDistance++;
        		maxReachableDistance = currentReachableDistance;
        	}
        }
               
        return jumpsForMaxReachableDistance;
    }

}

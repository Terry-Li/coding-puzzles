package com.algorithm.jumpgame;

public class JumpGame2 {
	
	public static void main(String[] args) {
		int[] input = {1, 2, 0, 1};
		System.out.println(jump(input));
	}
	
	public static int jump(int[] nums) {
        int count = nums.length;
        int[] steps = new int[count];
        for (int i=0; i<count; i++) {
            int jumps = nums[i];
            for (int j=i+1; j<i+1+jumps; j++) {
                if (j >= count) break;
                if (steps[j] == 0) {
                    steps[j] = steps[i] + 1;
                }
            }
        }
        return steps[count-1];
    }

}

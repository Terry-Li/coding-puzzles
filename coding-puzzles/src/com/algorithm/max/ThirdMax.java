package com.algorithm.max;

public class ThirdMax {
	
	public static void main(String[] args) {
		int[] input = {1,2,-2147483648};
		System.out.println(thirdMax(input));
	}
	
	public int numberOfArithmeticSlices(int[] A) {
        if (A.length<3) return 0;
        int slices = 0;
        int count = 2;
        int gap = A[1] - A[0];
        for (int i=1; i<A.length-1; i++) {
            int currentGap = A[i+1] - A[i];
            if (currentGap == gap) {
                count++;
                if (i==A.length-2) {
                    slices += (count-1)*(count-2)/2;
                }
            } else {
                if (count>=3) {
                    slices += (count-1)*(count-2)/2;
                }
                gap = currentGap;
                count = 2;
            }
        }
        return slices;
    }
	
	public static int thirdMax(int[] nums) {
        if (nums.length==1) {
            return nums[0];
        } else if (nums.length==2) {
            return nums[0] >= nums[1] ? nums[0] : nums[1];
        } else {
            int first = Integer.MIN_VALUE; 
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;
            for (int i=0; i<nums.length; i++) {
                if (nums[i]==first || nums[i]==second || nums[i]==third) continue;
                if (nums[i] > first) {                   
                    third = second;
                    second = first;
                    first = nums[i];
                } else if (nums[i] > second) {
                    third = second;
                    second = nums[i];
                } else if (nums[i] > third) {
                    third = nums[i];
                }
            }            
            return third;
        }
        
    }

}

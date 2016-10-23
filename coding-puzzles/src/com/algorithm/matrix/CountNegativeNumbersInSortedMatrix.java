package com.algorithm.matrix;

/**
 * @author Terry Li
 * 
 * This is an Amazon coding interview question:
 * 
 * find the number of negative integers in a row-wise/column-wise sorted matrix.
 * 
 * Example:
 * 
 * [-3, -2, -1, 1]
 * [-2,  2,  3, 4]
 * [ 4,  5,  7, 8]
 *
 * output: 4
 */
public class CountNegativeNumbersInSortedMatrix {
	
	public static void main(String[] args) {
		int[][] matrix = new int[10000][10000];
		for (int i=0; i<10000; i++) {
			for (int j=0; j<10000; j++) {
				if (i+j<=9999) {
					matrix[i][j] = -1;
				} else {
					matrix[i][j] = 1;
				}
			}
		}
		naiveSolution(matrix);
		optimalSolution(matrix);
	}
	
	//time complexity: O(n*m)
	public static void naiveSolution(int[][] matrix) {
		long startTime = System.currentTimeMillis();
		int count = 0;
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					count++;
				} else {
					break;
				}
			}
		}
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
		System.out.println("Naive solution: "+count+" calculated in "+elapsedTime+" ms");
	}
	
	//time complexity: O(n+m)
	public static void optimalSolution(int[][] matrix) {
		long startTime = System.currentTimeMillis();
		int count = 0;
		int tempCol = matrix[0].length-1;
		for (int i=0; i<matrix.length; i++) {
			for (int j=tempCol; j>=0; j--) {
				if (matrix[i][j] < 0) {
					count += j+1;
					tempCol = j;
					break;
				}
			}
		}
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
		System.out.println("Optimal solution: "+count+" calculated in "+elapsedTime+" ms");
	}

}

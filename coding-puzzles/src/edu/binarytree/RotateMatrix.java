package edu.binarytree;



/**
 * @author Terry Li
 *
 * Rotate a square matrix clockwise by 90 degrees in place
 */
public class RotateMatrix {
	
	public static void rotate(int[][] matrix) {
		if (matrix == null || matrix.length <= 1) return;
		int n = matrix.length;
		for (int i=0; i<n/2; i++) {

			for (int j=i; j<n-1-i; j++) {
				
				int temp = matrix[i][j];
				
				matrix[i][j] = matrix[n-1-j][i];
				
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				
				matrix[j][n-1-i] = temp;
				
				//observations: 1) the row index of the assignee is the same as the column index of the assigner
				//              2) the sum of the column index of the assignee and the row index of the assigner is equal to n-1
				
			}
		}
	}
	
	public static void printMatrix(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[0].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.print("\n");
		}
		
	}
	
	public static void main(String[] args) {
		int[][] matrix1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println("Before rotate: ");
		printMatrix(matrix1);
		
		rotate(matrix1);
		
		System.out.println("After rotate: ");
		printMatrix(matrix1);
		
		int[][] matrix2 = {
				{1,2,3,4,5},
				{4,5,6,7,8},
				{7,8,9,0,1},
				{0,1,2,3,4},
				{3,4,5,6,7}
		};
		
		System.out.println("Before rotate: ");
		printMatrix(matrix2);
		
		rotate(matrix2);
		
		System.out.println("After rotate: ");
		printMatrix(matrix2);
	}

}

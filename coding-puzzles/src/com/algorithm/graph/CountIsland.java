package com.algorithm.graph;

/*
 * Given a map of the world, where 1s represent land and 0s represent the sea, 
 * could you write an algorithm that counts the number of islands (adjacent pieces of land).

0 1 1 0 0
1 1 1 0 1
0 0 0 0 1

result: 2

0 0 0 0 1
0 1 0 0 1
0 0 0 0 0
1 0 0 0 1

result: 4

0 0
0 0

result: 0

1 1
1 1

result: 1

*/

public class CountIsland {
	
	public static void main(String[] args) {
		
		int[][] matrix1 = {{0,1,1,0,0}, {1,1,1,0,1}, {0,0,0,0,1}};
		System.out.println(count(matrix1));
		
		int[][] matrix2 = {{0,0,0,0,1}, {0,1,0,0,1}, {0,0,0,0,0}, {1,0,0,0,1}};
		System.out.println(count(matrix2));
		
		int[][] matrix3 = {{0,0}, {0,0}};
		System.out.println(count(matrix3));
		
		int[][] matrix4 = {{1,1}, {1,1}};
		System.out.println(count(matrix4));
		
	}
	
	public static int count(int[][] original) {
		
	    boolean[][] visited = new boolean[original.length][original[0].length];
	    
	    int count = 0;	    
	    
	    for (int i=0; i<original.length; i++) {
	        for (int j=0; j<original[0].length; j++) {
	            if (!visited[i][j] && original[i][j] == 1) {
	                count++;
	                traverse(i, j, original, visited);
	            } else if (!visited[i][j] && original[i][j] == 0) {
	            	visited[i][j] = true;
	            }
	        }
	    }
	    
	    return count;
	}

	private static void traverse(int row, int col, int[][] original, boolean[][] visited) {
		if (visited[row][col]) return;
		visited[row][col] = true;

	    //navigate right
	    if (col < original[0].length-1) {
	        int right = original[row][col+1];	        
	        if (right == 1) {
	            traverse(row, col+1, original, visited);
	        }
	    }
	    
	    //navigate left
	    if (col > 0) {
	        int left = original[row][col-1];	        
	        if (left == 1) {
	            traverse(row, col-1, original, visited);
	        }
	    }
	    
	    //navigate down
	    if (row < original.length-1) {
	        int down = original[row+1][col];	        
	        if (down == 1) {
	            traverse(row+1, col, original, visited);
	        }
	    }
	    
	    //navigate bottom right
	    if (row < original.length-1 && col < original[0].length-1) {
	        int bottomRight = original[row+1][col+1];	        
	        if (bottomRight == 1) {
	            traverse(row+1, col+1, original, visited);
	        }
	    }
	    
	    //navigate bottom left
	    if (row < original.length-1 && col > 0) {
	        int bottomLeft = original[row+1][col-1];	        
	        if (bottomLeft == 1) {
	            traverse(row+1, col-1, original, visited);
	        }
	    }

	}


}

package edu.binarytree;

import edu.repo.datastructures.BinaryTree;


/**
 * @author Terry Li
 * 
 * Determine if a binary tree is symmetric
 *
 */
public class SymmetricBinaryTree {
	
	public static boolean isSymmetric(BinaryTree btree) {
		
		if (btree == null) {
			return true; 
		} else {
			return mirrorEquals(btree.left, btree.right);
		}
		
	}
	
	private static boolean mirrorEquals(BinaryTree left, BinaryTree right) {
		
		if (left == null || right == null) {
			return left == null && right == null;
		} else {
			return left.value == right.value && mirrorEquals(left.left, right.right) && mirrorEquals(left.right, right.left);
		}
		
	}
	

	public static void main(String[] args) {
	     /*	   
	      *    1
		      / \     
		     2   2
		 
		 */
		BinaryTree btree1 = new BinaryTree(1);
		btree1.left = new BinaryTree(2);
		btree1.right = new BinaryTree(2);
		System.out.println(isSymmetric(btree1));
		
		/*	
		 *   1
		  	/ \
		   2   2
		  	\
		   	 3
		   	 
		 */
		BinaryTree btree2 = new BinaryTree(1);
		btree2.left = new BinaryTree(2);
		btree2.right = new BinaryTree(2);
		btree2.left.right = new BinaryTree(3);
		System.out.println(isSymmetric(btree2));
		
		/*	    
		 *    1
	     	/   \
	       2     2
	      / \   / \
	     4   3 3   4
	    
	     */
		BinaryTree btree3 = new BinaryTree(1);
		btree3.left = new BinaryTree(2);
		btree3.right = new BinaryTree(2);
		btree3.left.left = new BinaryTree(4);
		btree3.left.right = new BinaryTree(3);
		btree3.right.left = new BinaryTree(3);
		btree3.right.right = new BinaryTree(4);
		System.out.println(isSymmetric(btree3));
		
		/*
		 * 	  1
	     	/   \
	       2     2 
	      / \   / \
	     3   4 3   4
	  
	     */
		BinaryTree btree4 = new BinaryTree(1);
		btree4.left = new BinaryTree(2);
		btree4.right = new BinaryTree(2);
		btree4.left.left = new BinaryTree(3);
		btree4.left.right = new BinaryTree(4);
		btree4.right.left = new BinaryTree(3);
		btree4.right.right = new BinaryTree(4);
		System.out.println(isSymmetric(btree4));
		
		/*		
		 * 	  1
	     	/   \
	       2     2
	      /       \
	     3         3
	     
	     */
		BinaryTree btree5 = new BinaryTree(1);
		btree5.left = new BinaryTree(2);
		btree5.right = new BinaryTree(2);
		btree5.left.left = new BinaryTree(3);
		btree5.right.right = new BinaryTree(3);
		System.out.println(isSymmetric(btree5));
		
	}

}

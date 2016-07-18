package com.algorithm.binarytree;

import com.repo.datastructure.BinaryTree;

public class BinarySearchTree {
	
	private BinaryTree root;
	
	public BinarySearchTree(int value) {
		this.root = new BinaryTree(value);
	}
	
	public void insertNode(int value) {
		insertNode(value, root);
	} 
	
	public void inorderTraverse() {
		inorderTraverse(root);
	}
	
	private void inorderTraverse(BinaryTree node) {
		if (node == null) return;
		inorderTraverse(node.left);
		System.out.print(node.value+" ");
		inorderTraverse(node.right);
	}
	
	private void insertNode(int value, BinaryTree node) {
		if (value < node.value) {
			if (node.left == null) {
				node.left = new BinaryTree(value);
			} else {
				insertNode(value, node.left);
			}
		} else {
			if (node.right == null) {
				node.right = new BinaryTree(value);
			} else {
				insertNode(value, node.right);
			}
		}
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree(10);
		
		bst.insertNode(22);
		bst.insertNode(3);
		bst.insertNode(1);
		bst.insertNode(12);
		bst.insertNode(2);
		bst.insertNode(3);
		bst.insertNode(0);
		
		bst.inorderTraverse();
	}

}

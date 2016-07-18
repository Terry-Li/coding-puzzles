package com.algorithm.sorting;



/**
 * @author Terry Li
 * 
 * An enlightening interactive demo of quick sort: http://me.dt.in.th/page/Quicksort/
 *
 */
public class Quicksort {
	
	public static void sort(int[] list) {
		quicksort(list, 0, list.length-1);
	}
	
	private static void quicksort(int[] list, int start, int end) {
		int pivot = list[start+(end-start)/2];
		int i = start;
		int j = end;
		while(i <= j) {
			while(list[i]<pivot) {
				i++;
			}		
			while(list[j]>pivot) {
				j--;
			}
			if (i<=j) {
				swap(list, i, j);
				i++;
				j--;
			}
			if (start<j) quicksort(list, start, j);
			if (i<end) quicksort(list, i, end);
		}
		
	}
	
	private static void swap(int[] list, int start, int end) {
		int temp = list[start];
		list[start] = list[end];
		list[end] = temp;
	}
	
	public static void main(String[] args) {
		int[] list = { 1, 5, 6, 9, 4, 4, 11, 5, 99, 4, 6, 7, 22, 5 };
		Quicksort.sort(list);
		for (int n: list) {
			System.out.print(n+" ");
		}
	}

}

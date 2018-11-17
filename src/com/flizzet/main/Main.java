package com.flizzet.main;

/**
 * Performs a binary search.
 *
 * @author Pedro Dutra (2017)
 * @version 1.0
 */
public class Main {

    private static BinarySearcher searcher = new BinarySearcher();
    private static int[] testList = new int[] { 2, 3, 5, 9, 18, 20, 22, 23 };
    
    public static void main(String[] args) {
    	System.out.println(searcher.binarySearch(testList, 22));
    }
}

class BinarySearcher {
    public BinarySearcher() {}
    
    /** Searches through an Array with a BinarySearch.
     * 
     * Note: An Array used must be sorted low to high */
    public int binarySearch(int[] a, int target) {
		int low = 0;
		int high = a.length;
		
		while (low + 1 < high) {
		    int test = (low + high) / 2;
		    if (a[test] > target) {
			high = test;
		    } else {
			low = test;
		    }
		}
		if (a[low] == target) {
		    return low;
		} else {
		    System.out.println("Not found!");
		    return -1;
		}
    }
}

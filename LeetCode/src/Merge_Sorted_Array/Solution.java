/**
https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
88. Merge Sorted Array

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/
 

package Merge_Sorted_Array;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
    	int[] numsM1;
    	int[] numsM2;
  
    	int a;
    	int b;
    	int m;
    	int n;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	//Input Array1
    	System.out.println("nums1 : ");
    	a = sc.nextInt();
    	numsM1 = new int[a];
 
    	for(int i = 0; i < a ; i++) {
    		numsM1[i] = sc.nextInt();
    	}
    	
    	System.out.println("m : ");
    	m = sc.nextInt();
    	
    	//Input Array2
    	System.out.println("nums2 : ");
    	b = sc.nextInt();
    	numsM2 = new int[b];

    	for(int j = 0; j < b ; j++) {
    		numsM2[j] = sc.nextInt();
    	}

    	System.out.println("n : ");
    	n = sc.nextInt();
    	
    	merge(numsM1, m, numsM2, n);

    }
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int result[] = new int[m+n];
    	
    	int a=0;
        
        for( ; a < m; a++) {
        	result[a] = nums1[a];
        }
        for(int b=0 ; b < n; b++) {
        	result[a] = nums2[b];
        	a++;
        }
        
        Arrays.sort(result);
        
    	System.out.println(Arrays.toString(result));        
    }
}


package Merge_Sorted_Array;

import java.util.Arrays;

public class Solution_day03 {
    public static void main(String[] args){
    	int[] numsM1 = {-1,0,0,3,3,3,0,0,0};
    	int[] numsM2 = {1,2,2};
  
    	int m = 6;
    	int n = 3;
    	
    	merge(numsM1, m, numsM2, n);
    }
	
    static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int a = 0;
    	
    	for(int i=m; i < m+n ; i++) {    		
    		nums1[i] = nums2[a];
    		a++;
    	}

        Arrays.sort(nums1);
        
    	System.out.print(Arrays.toString(nums1));   
    }
}

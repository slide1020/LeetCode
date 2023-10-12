package Merge_Sorted_Array;

import java.util.Arrays;

public class Solution_day02 {
    public static void main(String[] args){
    	int[] numsM1 = {-1,0,0,3,3,3,0,0,0};
    	int[] numsM2 = {1,2,2};
  
    	int m = 6;
    	int n = 3;
    	
    	merge(numsM1, m, numsM2, n);
    }
	
    static void merge(int[] nums1, int m, int[] nums2, int n) {
    	
    	int[] fNums1 = new int[m+n];
    	int[] fNums2 = new int[n];
    	
    	int a = 0;
    	int b = 0;
    	
    	for(int i=0; i < m+n ; i++) {    		
    		if(nums1[i] == 0) {
    			//pass
    		}else {
    			fNums1[a] = nums1[i];
    			a++;
    		}
    	}

    	for(int j=0; j < n ;j++) {
    		if(nums2[j] == 0) {
    			//pass
    		}else {
    			fNums2[b] = nums2[j];
    			b++;
    		}
    	}
    	
    	for(int i=0; i < a ; i++) {    		
    		nums1[i] = fNums1[i];
    	}
    	
    	for(int j=0; j < b ; j++) {
    		nums1[a] = fNums2[j];
    		a++;
    	}
    	
        Arrays.sort(nums1);
        
    	System.out.print(Arrays.toString(nums1));   
    }
}

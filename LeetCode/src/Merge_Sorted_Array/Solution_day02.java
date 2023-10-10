package Merge_Sorted_Array;

import java.util.Arrays;

public class Solution_day02 {
    public static void main(String[] args){
    	int[] numsM1 = {1,2,3,0,0,0};
    	int[] numsM2 = {2,3,6};
  
    	int m = 3;
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
    			break;
    		}else {
    			fNums1[i] = nums1[i];
    			a++;
    		}
    	}

    	for(int j=0; j < n ; j++) {
    		if(nums2[j] == 0) {
    			break;
    		}else {
    			fNums2[j] = nums2[j];
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

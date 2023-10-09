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


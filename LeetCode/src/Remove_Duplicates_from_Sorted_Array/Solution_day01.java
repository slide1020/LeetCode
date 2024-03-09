/**
 * 
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
package Remove_Duplicates_from_Sorted_Array;

import java.util.Arrays;

public class Solution_day01 {
	public static void main(String args[])	{
		/*declaration*/
		int[] nums = {-3,-2,-1,0,0,1,1,2,2,3,3,4}; // Input array
		
		int[] expectedNums = removeDuplicates(nums); // Calls your implementation
		
		int k = 1;
		
		for( ; k<expectedNums.length; k++) {
			if(expectedNums[k-1] == expectedNums[k]) {
				break;
			}
		}
		
		System.out.println("expectedNums : " + Arrays.toString(expectedNums));
		System.out.println("k : " + k);
	}


	public static int[] removeDuplicates(int[] nums) {
		//remove
		for(int i=0; i<nums.length;i++) {
			for(int j=i; j<nums.length-1; j++) {
				if(nums[i] == nums[j+1]) {
					nums[j] = 0;
				}
			}
		}
		
		//sort
		int tempNums;
		
		for(int a=0; a<nums.length; a++) {
			for(int b = 1; b < nums.length-a; b++) {
				if(nums[b-1] > nums[b]) {
					tempNums = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = tempNums;
				}
			}
		}

	    return nums;
	}
}
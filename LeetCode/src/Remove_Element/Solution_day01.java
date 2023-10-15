/**
https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */

package Remove_Element;

import java.util.Arrays;

public class Solution_day01 {
	public static void main(String args[]) {
		//Use testCase
		int[] tcNums = {3,2,2,3}; // Input array
		int tcVal = 3; // Value to remove
		
		removeElement(tcNums, tcVal);
	}
   
	public static void removeElement(int[] nums, int val) {
		int k = nums.length;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==val) {
				nums[i] = 0;
				
				k = k-1;
			}
		}
		
		//the answer is..
		int[] expectedNums = descArr(nums);
		
		System.out.println("k :: " + k);
		System.out.println("nums :: " + Arrays.toString(expectedNums));
    }
	
	//embody descArr
	private static int[] descArr(int nums[]) {
		int[] descArr = new int[nums.length];
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++) {
			descArr[i] = nums[nums.length-i-1];
		}
		
		return descArr;
	}
}



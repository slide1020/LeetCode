/**
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than [n / 2] times. 
You may assume that the majority element always exists in the array.
 */

package Majority_Element;

public class MJ_Solution_day01 {
	public static void main(String args[]) {
		int[] nums1 = {3,2,3}; // Case 1
		int[] nums2 = {2,2,1,1,1,2,2}; // Case 2
		int[] nums3 = {3,3,4}; // Case 3
		int[] nums4 = {8,8,7,7,7}; // Case4
		
		int answer = 0;
		
		answer = majorityElements(nums3);
		
		System.out.println("answer is : " + answer);
		
		
	}
	
	public static int majorityElements(int[] nums) {
		int k = 0;
		double appearCnt = 0.0;
		
		double length = nums.length;
		
		for(int i=0; i<length;i++) {
			appearCnt = 0.0;
			for(int j=0; j<nums.length;j++) {
				if(nums[i] == nums[j]) {
					appearCnt++;
				}
			}
			if(appearCnt > length / 2) {
				k = nums[i];
				break;
			}
		}
		
		System.out.println("appear Cnt is : " + appearCnt + ", length / 2 is :" + length / 2);
		return k;
	}
}

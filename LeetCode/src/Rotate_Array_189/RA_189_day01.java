/**
 * 189. Rotate Array
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 

rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

Constraints
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105

Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space? 
 */



package Rotate_Array_189;
import java.util.Arrays;

public class RA_189_day01 {
	public static void main(String[] args){

		int[] nums1 = {1,2,3,4,5,6,7};

		int[] nums2 = {-1,-100,3,99};

		rotateArray(nums1,3);
		rotateArray(nums2,4);
		rotateArray(nums2,105);

	}

	

	public static void rotateArray(int[] nums, int k){
		System.out.println("before num is : " + Arrays.toString(nums));
		
		int arrSize = nums.length;
		int Idx1 = 0; // use for substr workStr idx 
		int Idx2 = 0; // use for put to workStr idx 
		String workStr = ""; 

		//if arrSize is 1, rotate is 0 dont need this process progress 
		if(arrSize == 1 || k == 0){
			// do not anything
		}else{
			//if arrSize is bigger than rotate, use mod is rotate
			if(arrSize<k){
				k = k % arrSize;
			}
			// rotate impletented
			// first. behind of arrange nums put to workArr in order.  
			for(int i=arrSize-k;i<arrSize;i++){
				workStr += nums[i] + ",";
			}

			// Second. remain arrange nums put to workArr behind in order.
			for(int j=0 ; j<arrSize-k; j++){
				workStr += nums[j] + ",";
			}		
			System.out.println(workStr);
			for(int a=0 ; a < workStr.length() ; a++) {
				String tempStr = "";
				
				if(',' ==  workStr.charAt(a)) {
					tempStr = workStr.substring(Idx1, a);
					tempStr = tempStr.replace(",", "");
					nums[Idx2] = Integer.valueOf(tempStr);
					Idx1 = a;
					Idx2++;
				}

			}
			System.out.println("nums : " + Arrays.toString(nums));
		}
	}
}

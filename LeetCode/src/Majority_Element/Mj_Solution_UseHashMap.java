package Majority_Element;

import java.util.HashMap;
import java.util.Map;

public class Mj_Solution_UseHashMap {
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
		int n = 0;
		Map<Integer, Integer> hashMap = new HashMap<>();
		
		n = nums.length / 2;
		
		for(int i=0; i<nums.length; i++) {
			hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if(entry.getValue() > n) {
				return entry.getKey();
			}
		}
		
		System.out.println("hashMap is : " + hashMap);
		return k;
	}


}

package Minimum_Size_Subarray_Sum;

import java.util.HashMap;

public class MSSS_solution_day02 {
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	//initialize main
	public static void main(String[] args) {
		int[] nums1 = {2,3,1,2,4,3};
		int[] nums2 = {1,4,4};
		int[] nums3 = {1,1,1,1,1,1,1,1};
		int[] nums4 = {1,2,3};
		int[] nums5 = {1,2,3,4,5};
		int target = 11;
		int Output;
		
		Output = minSubArrayLen(nums5, target);
		
		System.out.println(Output);
	}
	
	private static int minSubArrayLen(int[] nums, int target) {
		HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		
		int Output = 0;
		int numsLength = nums.length;
		int depth = 0;
		
		int[] perResult = new int[numsLength];
		boolean[] visited = new boolean[numsLength];
		
		// Using permutation put the hashmap sums values
		for(int count = 1; count <= numsLength; count++) {
			resultMap = permutation(nums, perResult, visited, numsLength, depth, count);
		}
		
		if(null != resultMap.get(target)){
			return resultMap.get(target);
		} else {
			return 0;
		}
	}
	
	//find minimum sums Values
	private static HashMap<Integer, Integer> permutation(int[] arr, int[] perResult, boolean[] visited, int numsLength, int depth, int count) {
		if(count == 0) {
			int sum = 0;
			int useCnt = 0;
			int tempUseCnt = 0;
			for(int k=0; k<numsLength;k++) {
				sum += perResult[k];
				if(perResult[k] != 0) {
					useCnt++;
				}
			}
			
			if(map.get(sum) != null) {
				if(tempUseCnt > useCnt) {
					map.put(sum, useCnt);
				}
			} else {
				map.put(sum, useCnt);
			}
			return map;
		}
		
		for(int j=depth ; j<numsLength ; j++) {
			visited[j] = true;
			perResult[depth] = arr[j];
			permutation(arr, perResult, visited, numsLength, depth+1, count-1);
			visited[j] = false;
		}
		return map;
	}

}

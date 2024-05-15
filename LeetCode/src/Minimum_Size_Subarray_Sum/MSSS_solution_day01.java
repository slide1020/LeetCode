/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */

package Minimum_Size_Subarray_Sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MSSS_solution_day01 {
	
	static HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
	
	public static void main(String[] args) {
		int[] nums1 = {2,3,1,2,4,3};
		int[] nums2 = {1,4,4};
		int[] nums3 = {1,1,1,1,1,1,1,1};
		int[] nums4 = {1,2,3};
		int target = 4;
		
		minSubArrayLen(nums1, target);
	}
	
	private static int minSubArrayLen(int[] nums, int target) {
		HashMap<Integer, List<Integer>> resultMap = new HashMap<Integer, List<Integer>>();
		
		int answer = 0;
		int numsLength = nums.length;
		int depth = 0;
		
		int[] perResult = new int[numsLength];
		boolean[] visited = new boolean[numsLength];
		
		for(int count = 1; count <= numsLength; count++) {
			resultMap = permutation(nums, perResult, visited, numsLength, depth, count);
		}
		
		System.out.println(resultMap);

		return answer;
	}
	
	private static HashMap<Integer, List<Integer>> permutation(int[] arr, int[] perResult, boolean[] visited, int numsLength, int depth, int count) {
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		int useCnt = 0;
		
		if(count == 0) {
			for(int k=0; k<numsLength;k++) {
				sum += perResult[k];
				if(perResult[k] != 0) {
					useCnt ++;
				}
				System.out.print(perResult[k]);
			}
			System.out.println();
			System.out.print("sum : " + sum + " / useCnt : " + useCnt);
			System.out.println();
			list.add(useCnt);
			map.put(sum, list);
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
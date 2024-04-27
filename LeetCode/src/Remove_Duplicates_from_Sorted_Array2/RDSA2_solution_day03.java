package Remove_Duplicates_from_Sorted_Array2;

import java.util.Arrays;

public class RDSA2_solution_day03 {
	public static void main(String args[]) {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		//{0,0,1,1,2,3,3} -> 7
		//int[] nums = {1};
		//1,1,1,2,2,3
		
		removeDuplSortedArr2(nums);
	}
	

	private static int removeDuplSortedArr2(int[] nums){
		int j=0;
		int dupCnt = 1;
		
		if(nums.length == 1) {
			return 1;
		}
		
		for(int i=j+1; i<nums.length; i++) {
			if(dupCnt < 2 && nums[i] == nums[j]) {
				dupCnt++;
				j++;
				nums[j] = nums[i];
			}else if(nums[i] != nums[j]) {
				dupCnt = 1;
				j++;
				nums[j] = nums[i];
			}
		}
		return j;
	}
}

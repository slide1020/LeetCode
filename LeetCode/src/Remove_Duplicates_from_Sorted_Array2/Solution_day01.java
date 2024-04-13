package Remove_Duplicates_from_Sorted_Array2;

import java.util.Arrays;

public class Solution_day01 {
	public static void main(String args[]) {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		//{0,0,1,1,2,3,3} -> 7
		
		removeDuplSortedArr2(nums);
	}
	

	private static int removeDuplSortedArr2(int[] nums){
		int k=0;
		int tempIdx = 0;
		int dupChkCnt = 0;
		int j=1;
		boolean dupchk = false;
		
		
		for(int i=1; i<nums.length; i++) {
			System.out.println("i : " + i + ", nums[i] : " + nums[i] + " / i-1 : " + (i-1) + ", nums[i-1] : " + nums[i-1]);
			if(nums[i] == nums[i-1]) {
				dupchk = true;
			} 
			
			if(nums[i] != nums[i-1]) {
				nums[tempIdx] = nums[i];
			}
			
			if(dupchk) {
				++dupChkCnt;
				if(dupChkCnt == 2) {
					tempIdx = i;
				}
				if(nums[i] != nums[i-1]) {
					nums[tempIdx] = nums[i];
					tempIdx = i;
					dupChkCnt= 0;
					
					dupchk = false;
				}
			}
			
			System.out.println(Arrays.toString(nums));
			System.out.println("-----------------------------------");
		}
		
		System.out.println("final :: " + Arrays.toString(nums));
		
		return k;
	}
	
}
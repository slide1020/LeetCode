package Remove_Duplicates_from_Sorted_Array2;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
		int dupChkCnt = 0;
		int k = 0;
		boolean dupchk = false;
		boolean change = false;
		boolean work = false;
		
		for(int i=1; i<nums.length; i++) {
			change = false;
			
			if(nums[i] == nums[i-1]) {
				dupchk = true;
			} 
	
			if(dupchk) {
				++dupChkCnt;
				if(dupChkCnt == 2) {
					k = i;
				}
				if(nums[i] != nums[i-1]) {
					nums[k] = nums[i];
					change = true;
					dupChkCnt= 0;
					dupchk = false;
					k++;
				}else if(nums[k] != nums[i]) {
					nums[k] = nums[i];
					change = true;
					k++;
				}
			}else {			
				if(nums[k] != nums[i]) {
					nums[k] = nums[i];
					k++;
				}
			}
			
			
			if(nums.length-1 > i) {
				if(change && (nums[i+1] == nums[k])  && (nums[k] <= nums[i-1]) ) {
					dupChkCnt++;
				}
			}else if(nums.length-1 == i && change) {
				work = true;
			}
		}
		
		if(!work) {
			k = nums.length;
			return k;
		}else {
			return k;
		}
	}
}
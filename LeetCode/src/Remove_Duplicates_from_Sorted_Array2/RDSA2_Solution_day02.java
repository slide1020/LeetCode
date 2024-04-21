package Remove_Duplicates_from_Sorted_Array2;
import java.util.Arrays;

public class RDSA2_Solution_day02 {
	public static void main(String args[]) {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		//{0,0,1,1,2,3,3} -> 7
		
		removeDuplSortedArr2(nums);
	}
	

	private static int removeDuplSortedArr2(int[] nums){
		int k=0;
		int tempIdx = 0;
		int dupChkCnt = 0;
		boolean dupchk = false;
		
		
		for(int i=1; i<nums.length; i++) {
			System.out.println("i : " + i + ", nums[i] : " + nums[i] + " / i-1 : " + (i-1) + ", nums[i-1] : " + nums[i-1]+ ", tempIdx: " + tempIdx + ", nums[tempIdx] : " + nums[tempIdx]);
			if(nums[i] == nums[i-1]) {
				dupchk = true;
			} 
			
			
			if(dupchk) {
				++dupChkCnt;
				if(dupChkCnt == 2) {
					tempIdx = i;
				}
				if(nums[i] != nums[i-1]) {
					nums[tempIdx] = nums[i];
					//tempIdx = i;
					dupChkCnt= 0;
					dupchk = false;
					tempIdx++;
					k++;
				}else if(nums[tempIdx] != nums[i]) {
					nums[tempIdx] = nums[i];
					tempIdx++;
					k++;
				}
			}else {			
				if(nums[tempIdx] != nums[i]) {
					nums[tempIdx] = nums[i];
					tempIdx++;
					k++;
				}
			}

			
			System.out.println(Arrays.toString(nums));
			System.out.println("-----------------------------------");
		}
		
		System.out.println("final :: " + Arrays.toString(nums) + "/ K : " + tempIdx);
		
		return k;
	}
}

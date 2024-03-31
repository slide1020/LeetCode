package Remove_Duplicates_from_Sorted_Array;

import java.util.Arrays;

public class solution_day02 {
	public static void main(String args[])	{
		/*declaration*/
		int[] nums = {-3,-2,-1,0,0,1,1,2,2,3,3,4}; // Input array
		
		int[] expectedNums = removeDuplicates(nums); // Calls your implementation
		
		System.out.println("expectedNums : " + Arrays.toString(expectedNums));

	}
	public static int[] removeDuplicates(int[] nums) {
		
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println("j  = " + j);
        return j;
	}
}

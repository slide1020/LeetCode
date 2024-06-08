/**
 * You are given a sorted unique integer array nums.
A range [a,b] is the set of all integers from a to b (inclusive).
Return the smallest sorted list of ranges that cover all the numbers in the array exactly. 
That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 
Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
 
Constraints:
0 <= nums.length <= 20
-231 <= nums[i] <= 231 - 1
All the values of nums are unique.
nums is sorted in ascending order.
 */

package Summary_Ranges;

import java.util.ArrayList;
import java.util.List;

public class SR_Solution_day01 {
	public static void main(String args[]) {
		int[] nums1 = {0,1,2,4,5,7};
		int[] nums2 = {0,2,3,4,6,8,9};
		
		List<String> ansList = summaryRanges(nums2);
		System.out.println(ansList);
	}
	
    public static List<String> summaryRanges(int[] nums) {
    	List<String> answer = new ArrayList<>();
    	String a = "";
    	String b = "";
    	String c = ""; // Last nums handle
    	
    	if(nums.length == 1) {
    		a = Integer.toString(nums[0]);
    		answer.add(a);
    		return answer;
    	}
    	
    	for(int i=0 ; i < nums.length-1; i++) {
    		//if 'a' is empty put it first array num
    		if("" == a) {
    			a = Integer.toString(nums[i]);
    		}
    		
    		//next nums and nums+1 is same continue
    		if(nums[i+1] == nums[i]+1) {
    			// not work
    		}else if(nums[i+1] != nums[i]+1) {
    			//if next nums and nums+1 is diffrent put 'b'
    			b = Integer.toString(nums[i]);
    			
    			//put in list answer form
    			if(a.equals(b)) {
    				answer.add(a);
    			} else {
    				answer.add(a + "->" + b);
    			}
    			
    			//initialize
    			a = "";
    			b = "";
    		}
    		
    		//Only working Last i
    		if(i+1 == nums.length-1) {
    			c = Integer.toString(nums[i+1]);

    			if("" == a) {
    				answer.add(c);
    			} else {
    				answer.add(a + "->" + c);
    			}
    		}
    	}
    	
        return answer;
    }
}

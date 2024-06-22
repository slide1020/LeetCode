package Rotate_Array_189;

import java.util.Arrays;

public class RA_189_day02 {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4,5,6,7};

		int[] nums2 = {-1,-100,3,99};

		rotate(nums1,3);
		rotate(nums2,4);
		rotate(nums2,105);
	}
	
    public static void rotate(int[] nums, int k) {
		int arrSize = nums.length;
	
		//if arrSize is 1, rotate is 0 dont need this process progress 
		if(arrSize == 1 || k == 0){
	
		}else{
			nums = reverse(nums, k);
			System.out.println(Arrays.toString(nums));
		}
	}
    
    public static int[] reverse(int[] workArr, int rotate){
		int arrSize = workArr.length;
		int idx = 0; // use for put to workArr idx 
		int[] privateWorkArr = new int[arrSize];
		
    	//if arrSize is bigger than rotate, use mod is rotate
		if(arrSize<rotate){
			rotate = rotate % arrSize;
		}
		// rotate impletented
		// first. behind of arrange nums put to workArr in order.  
		for(int i=arrSize-rotate;i<arrSize;i++){
			privateWorkArr[idx] = workArr[i];
			idx++;
		}

		// Second. remain arrange nums put to workArr behind in order.
		for(int j=0 ; j<arrSize-rotate; j++){
			privateWorkArr[idx] = workArr[j];
			idx++;
		}		
		
    	return privateWorkArr;
    }
}

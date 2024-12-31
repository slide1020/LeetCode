package Spiral_Matrix_54;

import java.util.ArrayList;
import java.util.List;

public class SM54_day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix01[][] = {{1,2,3},
							{4,5,6},
							{7,8,9}};
		
		int matrix02[][] = {{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12}};
		
		int matrix03[][] = {{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16}};
		
		System.out.println("ans1 >>> ");
		System.out.println(spiralOrder(matrix01));
		
		System.out.println("ans2 >>> ");
		System.out.println(spiralOrder(matrix02));
		
		System.out.println("ans3 >>> ");
		System.out.println(spiralOrder(matrix03));
	}
	
    public static List<Integer> spiralOrder(int[][] matrix) {
    	ArrayList<Integer> ansList = new ArrayList<Integer>();
    	//00 - 01 - 02 - 12 - 22 - 21 - 20 - 10 - 11
    	//00 - 01 - 02 - 03 - 13 - 23 - 33 - 32 - 31 - 30 - 20 - 21 - 22
    	//00 - 01 - 02 - 03 - 13 - 23 - 33 - 32 - 31 - 30 - 20 - 10 - 11 - 12 - 22 - 21
    	
    	int maxWeight = matrix[0].length;
    	int maxHeight = matrix.length;
    	int whileIdx = 0;
    	int heightIdx = 0;
    	int weightIdx = 0;
    	
    	System.out.println("maxWeight : " + maxWeight);
    	System.out.println("maxHeight : " + maxHeight);
    	
    	if(maxWeight < maxHeight) {
    		whileIdx = maxHeight-1;
    	}else if(maxHeight < maxWeight) {
    		whileIdx = maxWeight-1;
    	}else {
    		whileIdx = maxHeight-1;
    	}
    	
    	while(whileIdx > 0){
    		for( ; heightIdx < maxHeight; heightIdx++) {
    			for(; weightIdx < maxWeight; weightIdx++) {
        			ansList.add(matrix[heightIdx][weightIdx]);
        		}
    		}
    		whileIdx--;
    	}
    	 
        return ansList;
    }

}

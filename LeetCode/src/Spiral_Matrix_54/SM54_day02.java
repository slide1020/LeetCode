package Spiral_Matrix_54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SM54_day02 {

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
		
		int matrix04[][] = {{23,18,20,26,25},
							{24,22,3,4,4},
							{15,22,2,24,29},
							{18,15,23,28,28}};
		
		
		System.out.println("ans1 >>> ");
		System.out.println(" >>> " + spiralOrder(matrix01));
		
		System.out.println("ans2 >>> ");
		System.out.println(" >>> " + spiralOrder(matrix02));
		
		System.out.println("ans3 >>> ");
		System.out.println(" >>> " + spiralOrder(matrix03));
		
		System.out.println("ans3 >>> ");
		System.out.println(" >>> " + spiralOrder(matrix04));
	}
	
    public static List<Integer> spiralOrder(int[][] matrix) {
    	ArrayList<Integer> ansList = new ArrayList<Integer>();
    	HashMap<Integer, Boolean> visitHM = new HashMap<Integer, Boolean>();
    	//00 - 01 - 02 - 12 - 22 - 21 - 20 - 10 - 11
    	//00 - 01 - 02 - 03 - 13 - 23 - 33 - 32 - 31 - 30 - 20 - 21 - 22
    	//00 - 01 - 02 - 03 - 13 - 23 - 33 - 32 - 31 - 30 - 20 - 10 - 11 - 12 - 22 - 21
    	
    	int top = 0;
    	int bottom = matrix.length-1;
    	int right = matrix[0].length-1;
    	int left = 0;
    	int index = 0;
    	
    	
    	for(int i = 0; i <= bottom; i++) {
    		for(int j = 0; j <= right; j++) {
    			visitHM.put(matrix[i][j], false);
    		}
    	}
    	
    	while(left <= right && top <= bottom) {
    		
        	System.out.println("index :: " + index);
        	System.out.println("top :: " + top);
        	System.out.println("left :: " + left);
        	System.out.println("right :: " + right);
        	System.out.println("bottom :: " + bottom);
        	System.out.println("---------------------------");
        	// step1. put line 1
        	while(index <= right) {
        		if(false == visitHM.get(matrix[top][index])) {
            		ansList.add(matrix[top][index]);
            		visitHM.put(matrix[top][index], true);
        		}
        		index++;
        	}
        	top++;
        	index = top;
        	//step2. put last col
        	while(index <= bottom) {
        		if(false == visitHM.get(matrix[index][right])) {
            		ansList.add(matrix[index][right]);
            		visitHM.put(matrix[index][right], true);
        		}
            	index++;	
        	}
        	right--;
        	index = right;
        	//step3. put last row
        	while(0 <= index) {
        		if(false == visitHM.get(matrix[bottom][index])) {
            		ansList.add(matrix[bottom][index]);
            		visitHM.put(matrix[bottom][index], true);
        		}
        		index--;
        	}
        	bottom--;
        	index = bottom;
        	//step4. put first col
        	while(top <= index) {
        		if(false == visitHM.get(matrix[index][left])) {
            		ansList.add(matrix[index][left]);
            		visitHM.put(matrix[index][left], true);
        		}
        		index--;
        	}
        	left++;
        	index = left;
    	}
    	
        return ansList;
    }



}

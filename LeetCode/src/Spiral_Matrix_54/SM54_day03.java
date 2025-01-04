package Spiral_Matrix_54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SM54_day03 {

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
		
		int matrix05[][] = {{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16},
							{17,18,19,20},
							{21,22,23,24}};
		
		
		System.out.println("ans1 >>> ");
		System.out.println(" >>> " + spiralOrder(matrix01));
		
		System.out.println("ans2 >>> ");
		System.out.println(" >>> " + spiralOrder(matrix02));
		
		System.out.println("ans3 >>> ");
		System.out.println(" >>> " + spiralOrder(matrix03));
		
		System.out.println("ans4 >>> ");
		System.out.println(" >>> " + spiralOrder(matrix04));
		
		System.out.println("ans5 >>> ");
		System.out.println(" >>> " + spiralOrder(matrix05));
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
    	int matrixSize = (bottom+1) * (right+1);
    	int whileIdx = 0;
    	
    	// using visit index
    	for(int i = 0 ; i < matrixSize; i++) {
    		visitHM.put(i, false);
    	}
    	
    	while(whileIdx < matrixSize) {

    		if(false == visitHM.get(whileIdx)) {
    			// step1. put line 1
            	while(index <= right && whileIdx < matrixSize) {
                	ansList.add(matrix[top][index]);
                	visitHM.put(whileIdx, true);
            		index++;
            		whileIdx++;
            	}
            	top++;
            	index = top;
            	//step2. put last col
            	while(index <= bottom && whileIdx < matrixSize) {
            		ansList.add(matrix[index][right]);
            		visitHM.put(whileIdx, true);
                	index++;	
            		whileIdx++;
            	}
            	right--;
            	index = right;
            	//step3. put last row
            	while(left <= index && whileIdx < matrixSize) {
            		ansList.add(matrix[bottom][index]);
            		visitHM.put(whileIdx, true);
            		index--;
            		whileIdx++;
            	}
            	bottom--;
            	index = bottom;
            	//step4. put first col
            	while(top <= index && whileIdx < matrixSize) {
            		ansList.add(matrix[index][left]);
            		visitHM.put(whileIdx, true);
            		index--;
            		whileIdx++;
            	}
            	left++;
            	index = left;
    		}
    	}
        return ansList;
    }





}

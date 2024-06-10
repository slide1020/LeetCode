/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * 
Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.

Input: board = 
[["5","3",'.','.',"7",'.','.','.','.']
,["6",'.','.',"1","9","5",'.','.','.']
,['.',"9","8",'.','.','.','.',"6",'.']
,["8",'.','.','.',"6",'.','.','.',"3"]
,["4",'.','.',"8",'.',"3",'.','.',"1"]
,["7",'.','.','.',"2",'.','.','.',"6"]
,['.',"6",'.','.','.','.',"2","8",'.']
,['.','.','.',"4","1","9",'.','.',"5"]
,['.','.','.','.',"8",'.','.',"7","9"]]
Output: true
Example 2:

Input: board = 
[["8","3",'.','.',"7",'.','.','.','.']
,["6",'.','.',"1","9","5",'.','.','.']
,['.',"9","8",'.','.','.','.',"6",'.']
,["8",'.','.','.',"6",'.','.','.',"3"]
,["4",'.','.',"8",'.',"3",'.','.',"1"]
,["7",'.','.','.',"2",'.','.','.',"6"]
,['.',"6",'.','.','.','.',"2","8",'.']
,['.','.','.',"4","1","9",'.','.',"5"]
,['.','.','.','.',"8",'.','.',"7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 
 */

package Valid_Sudoku;

public class VS_Soultion_day01 {
	public static void main(String[] args) {

		char board1[][] = 
				{{'8','3','.','8','7','.','.','.','.'}
				,{'6','.','.','1','9','5','.','.','.'}
				,{'.','9','8','.','.','.','.','6','.'}
				,{'.','.','.','.','6','.','.','.','3'}
				,{'4','.','.','8','.','3','.','.','1'}
				,{'7','.','.','.','2','.','.','.','6'}
				,{'.','6','.','.','.','.','2','8','.'}
				,{'.','.','.','4','1','9','.','.','5'}
				,{'.','.','.','.','8','.','.','7','9'}};
		
		char board2[][] =
				{{'8','3','.','.','7','.','.','.','.'}
				,{'6','.','.','1','9','5','.','.','.'}
				,{'.','9','8','.','.','.','.','6','.'}
				,{'8','.','.','.','6','.','.','.','3'}
				,{'4','.','.','8','.','3','.','.','1'}
				,{'7','.','.','.','2','.','.','.','6'}
				,{'.','6','.','.','.','.','2','8','.'}
				,{'.','.','.','4','1','9','.','.','5'}
				,{'.','.','.','.','8','.','.','7','9'}};
		
		char board3[][] =
				{{'.','.','.','.','.','.','.','.','.'}
				,{'.','.','.','.','.','.','.','.','.'}
				,{'.','9','.','.','.','.','.','.','1'}
				,{'8','.','.','.','.','.','.','.','.'}
				,{'.','9','9','3','5','7','.','.','.'}
				,{'.','.','.','.','.','.','.','4','.'}
				,{'.','.','.','8','.','.','.','.','.'}
				,{'.','1','.','.','.','.','4','.','9'}
				,{'.','.','.','5','.','4','.','.','.'}};

		boolean Ans = isValidSudoku(board1);
		System.out.println("Ans : " + Ans);
	}
	public static boolean isValidSudoku(char[][] board) {

    	char compareBoard1[] = new char[9];
    	char compareBoard2[] = new char[9];
    	int a = 0;

    	while(a < 9){
    		// make un and side line
    		for(int i=0 ; i < 9 ; i++){
        		compareBoard1[i] = board[a][i];
        		compareBoard2[i] = board[i][a];
        	}
    		System.out.println(compareBoard1);
    		System.out.println(compareBoard2);
    		// compare and dupcheck
    		for(int k=0 ; k < 9 ; k++){
    			int dupChk = 0;
    			for(int l=0 ; l < 9 ; l++){
    				//up and side line compare
    				//black is .
    				if(compareBoard1[k] == compareBoard2[l] && compareBoard1[k] != '.' && compareBoard2[l] != '.'){
    					dupChk++;
    				}
    			}

    			//dup is more than 1 is false
    			if(dupChk > 1){
    				return false;
    			} 
    		}

        	// initialized        	
        	compareBoard1 = new char[9];
        	compareBoard2 = new char[9];

        	a++;        	        	
    	}

    	return true;

    }
}

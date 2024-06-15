package Valid_Sudoku;

public class VS_Solution_day03 {
	public static void main(String[] args) {

		char board1[][] = 
				{{'8','3','.','.','7','.','.','.','.'}
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

		boolean Ans = isValidSudoku(board3);
		System.out.println("Ans : " + Ans);
	}

    public static boolean isValidSudoku(char[][] board) {

    	char compareBoard1[] = new char[9];
    	char compareBoard2[] = new char[9];
    	int a = 0;

    	while(a < 9){
    		// make line by side, up
    		for(int i=0 ; i < 9 ; i++){
        		compareBoard1[i] = board[a][i];
        		compareBoard2[i] = board[i][a];
        	}
    		
    		// compare side standard compareBoard2(to) dupcheck
    		for(int k=0 ; k < 9 ; k++){
    			int dupChk = 0;
    			for(int l=0 ; l < 9 ; l++){
    				//up and side line compare
    				//blank is .
    				if(compareBoard1[k] != '.' || compareBoard2[l] != '.'){
    					if(compareBoard1[k] == compareBoard2[l]){
    						dupChk++;
    					}
    				}
    			}
    			//dup is more than 1 is false
    			if(dupChk > 1){
    				return false;
    			}
    		}

    		// compare up standard(compareBoard1)
    		for(int k=0 ; k < 9 ; k++){
    			int dupChk = 0;
    			for(int l=0 ; l < 9 ; l++){
    				//up and side line compare
    				//blank is .
    				if(compareBoard1[k] != '.' || compareBoard1[l] != '.'){
    					if(compareBoard1[k] == compareBoard1[l]){
    						dupChk++;
    					}
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

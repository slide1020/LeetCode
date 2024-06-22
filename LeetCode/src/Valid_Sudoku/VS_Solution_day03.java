package Valid_Sudoku;

import java.util.ArrayList;

public class VS_Solution_day03 {
	public static void main(String[] args) {
		char board1[][] = 
				{{'5','3','.','.','7','.','.','.','.'}
				,{'6','.','.','1','9','5','.','.','.'}
				,{'.','9','8','.','.','.','.','6','.'}
				,{'.','.','.','.','6','.','.','.','3'}
				,{'4','.','.','8','.','3','.','.','1'}
				,{'7','.','.','.','2','.','.','.','6'}
				,{'.','6','.','.','.','.','2','8','.'}
				,{'.','.','.','4','1','9','.','.','5'}
				,{'.','.','.','.','8','.','.','7','9'}};

		char board2[][] =
			   {{'.','.','.','8','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','6','.','.','.','.','3','.','.'},
				{'7','.','.','9','6','4','1','.','.'},
				{'6','.','9','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','5','.'},
				{'.','.','9','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','5'},
				{'.','.','1','.','.','.','.','2','.'}};

		
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

		char board4[][] = 
				{{'.','.','.','.','5','.','.','1','.'}
				,{'.','4','.','3','.','.','.','.','.'}
				,{'.','.','.','.','.','3','.','.','1'}
				,{'8','.','.','.','.','.','.','2','.'}
				,{'.','.','2','.','7','.','.','.','.'}
				,{'.','1','5','.','.','.','.','.','.'}
				,{'.','.','.','.','.','2','.','.','.'}
				,{'.','2','.','9','.','.','.','.','.'}
				,{'.','.','4','.','.','.','.','.','.'}};

		char board5[][] = 
				{{'.','.','.','.','.','.','.','5','2'},
				{'.','.','.','.','.','.','2','.','.'},
				{'7','.','.','6','.','.','.','.','.'},
				{'8','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','7','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','2'},
				{'.','.','.','.','.','4','8','.','.'}};

		boolean Ans1 = isValidSudoku(board1);
		System.out.println("Ans : " + Ans1);
		boolean Ans2 = isValidSudoku(board2);
		System.out.println("Ans : " + Ans2);
		boolean Ans3 = isValidSudoku(board3);
		System.out.println("Ans : " + Ans3);
		boolean Ans4 = isValidSudoku(board4);
		System.out.println("Ans : " + Ans4);
		boolean Ans5 = isValidSudoku(board5);
		System.out.println("Ans : " + Ans5);
	}

    public static boolean isValidSudoku(char[][] board) {

    	//Step2. up, side line check param
    	ArrayList<Character> compareList = new ArrayList<Character>();
    	//Step2. up, side line check param
    	char compareBoard1[] = new char[9];
    	char compareBoard2[] = new char[9];
    	int a = 0;

    	//Step1. 3x3 vaild check
    	//make 3x3 matrix
    	for(int row = 0 ; row < 3 ; row ++) {
    		for(int col = 0 ; col < 3 ; col++) {
    			int n1 = (row+1) * 3;
    			int n2 = (col+1) * 3;
    			for(int m = n1-3; m < n1 ; m++) {
    				for(int n = n2-3; n < n2 ; n++) {
    					if('.' != board[m][n]) {
    						//3x3 maxtrix list
        					compareList.add(board[m][n]);
    					}
    				}
    			}
    			System.out.println(compareList);
    			//remove blank '.'
    			compareList.remove("^[0-9]*$");
    			for(int c=0;c<compareList.size();c++){
    				int chk=0;
    				for(int d=0 ; d<compareList.size();d++){
    					if(compareList.get(d)==compareList.get(c)){
    						//if exist duplucated chk is over 2
    						chk++;
    					}
    				}

        			if(chk > 1){
        				return false;
        			}
    			}
    			//initialized
    			compareList.clear();
    		}
    	}

    	//Step2. up, side line check
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
    		
    		System.out.println(compareBoard1);
			System.out.println(compareBoard2);
			System.out.println("---------------------");
    		
			
			// each board dup chk
    		for(int c=0;c<compareBoard1.length;c++){
				int chk=0;
				for(int d=0 ; d<compareBoard1.length;d++){
					if(compareBoard1[d]==compareBoard1[c] && compareBoard1[d] != '.' && compareBoard1[c] != '.'){
						//if exist duplucated chk is over 2
						chk++;
					}
				}

    			if(chk > 1){
    				return false;
    			}
			}
    		
    		for(int c=0;c<compareBoard2.length;c++){
				int chk=0;
				for(int d=0 ; d<compareBoard2.length;d++){
					if(compareBoard2[d]==compareBoard2[c] && compareBoard2[d] != '.' && compareBoard2[c] != '.'){
						//if exist duplucated chk is over 2
						chk++;
					}
				}

    			if(chk > 1){
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

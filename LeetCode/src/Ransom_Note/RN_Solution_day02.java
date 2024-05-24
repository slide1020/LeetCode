package Ransom_Note;

import java.util.HashMap;

public class RN_Solution_day02 {
	public static void main(String[] args) {
		String ransomNote1 = "aa";
		String magazine1 = "b";
		String ransomNote2 = "aa";
		String magazine2 = "ab";
		String ransomNote3 = "aa";
		String magazine3 = "aab";
		String ransomNote4 = "aa";
		String magazine4 = "ab";
		
		canConstruct(ransomNote4, magazine4);
	}

    public static boolean canConstruct(String ransomNote, String magazine) {
    	HashMap<Integer, String> hm = new HashMap<Integer, String>();
    	String putWork = "";
    	String findWork = "";
    	int rnCnt = 0;
    	boolean rnBool = false;
    	
    	for(int i=1; i<=magazine.length();i++) {
    		putWork = magazine.substring(i-1,i);
    		hm.put(i, putWork);
    	}

       	for(int j=1; j<=ransomNote.length();j++) {
       		findWork = ransomNote.substring(j-1,j);
       		
       		for(int k=1; k<=hm.size(); k++) {
       			if(findWork.equals(hm.get(k))){
       				rnCnt++;
       				rnBool = true;
       			}
       		}
    	}
       	
       	
       	if(rnBool && rnCnt == ransomNote.length()) {
       		System.out.println("true");
       		return true;
       	}
    	
       	System.out.println("false");
    	return false;
    }
}

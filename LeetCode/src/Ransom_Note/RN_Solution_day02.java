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
		String ransomNote4 = "aab";
		String magazine4 = "baa";
		
		canConstruct(ransomNote4, magazine4);
	}

    public static boolean canConstruct(String ransomNote, String magazine) {
    	HashMap<Integer, String> hm = new HashMap<Integer, String>();
    	String putWork = "";
    	int Idx = 0;
    	
    	for(int i=1; i<=magazine.length();i++) {
    		putWork = magazine.substring(i-1,i);
    		hm.put(i, putWork);
    	}
    	
       	for(int i=1; i<=magazine.length();i++) {
       		if(ransomNote.substring(i-1,i).equals(hm.get(i))) {
       			
       		}
    	}
    	
    	System.out.println(hm);
    	
    	return true;
    }

}

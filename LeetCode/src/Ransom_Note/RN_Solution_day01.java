/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 
 */

package Ransom_Note;

import java.util.HashMap;

public class RN_Solution_day01 {
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
    	
    	String putWorkStr = "";
    	int idx = 0;
    	
    	for(int j=0 ; j < magazine.length() ; j++) {
        	for(int i=j+1 ; i <= magazine.length(); i++) {
        		putWorkStr += magazine.substring(j,i);
        		hm.put(idx++, putWorkStr);
        		putWorkStr = "";
        	}
    	}
    	

    	System.out.println("map : " + hm);
    	
    	for(int k=0 ; k < hm.size(); k ++) {
    		if(ransomNote.equals(hm.get(k))){
    			System.out.println("존재");
    			return true;
    		}
    				
    	}
    	return false;
    }
}

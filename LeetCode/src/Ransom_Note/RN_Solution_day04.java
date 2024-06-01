package Ransom_Note;
import java.util.HashMap;

public class RN_Solution_day04 {
	public static void main(String[] args) {
		String ransomNote1 = "aa";
		String magazine1 = "b";
		String ransomNote2 = "aa";
		String magazine2 = "ab";
		String ransomNote3 = "aa";
		String magazine3 = "aab";
		String ransomNote4 = "aab";
		String magazine4 = "baa";
		String ransomNote5 = "ab";
		String magazine5 = "abaa";

		boolean Ans = canConstruct(ransomNote1, magazine1);

		System.out.println(Ans);
	}

    public static boolean canConstruct(String ransomNote, String magazine) {
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

    	char workChar = ' ';
    	char findChar = ' ';

    	for(int i=0; i<magazine.length(); i++){
    		workChar = magazine.charAt(i);
    		if(hm.containsKey(workChar)){
    			hm.put(workChar, hm.get(workChar) + 1);
    		}else{
    			hm.put(workChar, 1);
    		}
    	}

    	System.out.println(hm);

    	for(int j=0; j<ransomNote.length(); j++){
    		findChar = ransomNote.charAt(j);
    		if(hm.containsKey(findChar)){
    			if(hm.get(findChar) > 0){
    				hm.put(findChar, hm.get(findChar) - 1);
    			}else{
    				return false;
    			}
    		}else{
    			return false;
    		}
    	}
    	return true;
    }
}
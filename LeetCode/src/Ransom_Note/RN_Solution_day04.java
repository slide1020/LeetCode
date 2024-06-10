<<<<<<< HEAD
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
=======
package YSG_TEST;



import java.util.HashMap;



public class YSG_TEST01 {

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
    String ransomNote6 = "fffbfg";
		String magazine6 = "effjfggbffjdgbjjhhdegh";
    

		canConstruct(ransomNote3, magazine3);
	}
    public static boolean canConstruct(String ransomNote, String magazine) {
    	HashMap<Integer, String> hm = new HashMap<Integer, String>();
    	String putWork = "";
    	String findWork = "";
    	int rnCnt = 0;
    	int idx = 0;
    	boolean rnBool = false;
      
    	for(int i=1; i<=magazine.length();i++) {
    		putWork = magazine.substring(i-1,i);
    		putWork += magazine.substring(i, magazine.length());
    		idx++;
    		hm.put(idx, putWork);
    	}
      
    	for(int a = magazine.length(); a > 0; a--) {
    		putWork = magazine.substring(a-1,a);
    		for(int a1 = a-1 ; a1 > 0; a1--){
    			putWork += magazine.substring(a1-1, a1);
    		}
    		idx++;
    		hm.put(idx, putWork);
    	}

   		for(int k=1; k <= hm.size(); k++) {
   			System.out.println("hm.get(k) : " + hm.get(k) + " / ransomNote : " + ransomNote);
   			if(hm.get(k).indexOf(ransomNote) >= 0){
   				rnBool = true;
   				System.out.println("find it!");
   				break;
   			}
   		}
    	System.out.println(hm);
       	if(rnBool) {
       		System.out.println("true");
       		return true;
       	}
      System.out.println("false");
    	return false;
    }
}

>>>>>>> refs/remotes/origin/master

/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
 (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
 */


package inSubsequences_189;

import java.util.ArrayList;
import java.util.Arrays;


public class IS_day01 {
	public static void main(String[] args) {
		String s1 = "abc";
		String t1 = "habgdc";
		String s2 = "axc";
		String t2 = "ahbgdc";
		String s3 = "abc";
		String t3 = "abx";
		String s4 = "acb";
		String t4 = "ahbgdc";
		
		boolean ans1 = isSubsequence(s1, t1);
		System.out.println(ans1);
		boolean ans2 = isSubsequence(s2, t2);
		System.out.println(ans2);
		boolean ans3 = isSubsequence(s3, t3);
		System.out.println(ans3);
		boolean ans4 = isSubsequence(s4, t4);
		System.out.println(ans4);
	}

    public static boolean isSubsequence(String s, String t) {
    	boolean ans = true;
    	int idx = 0;
    	String data = "";
    	String compareData = "";

    	ArrayList<String> dataList = new ArrayList<String>(Arrays.asList(String.valueOf(s).split("")));
    	ArrayList<String> compareList = new ArrayList<String>(Arrays.asList(String.valueOf(t).split("")));
    	
    	if(s.length() > t.length()) {
    		return false;
    	} else if(s.length() == 0) {
    		return true;
    	}
    		
    	

    	for(int i=0; i<dataList.size(); i++){
    		if(ans == false) break;
    		data = dataList.get(i);
    		System.out.println("- data : " + data);
    		for(int j=i; j<compareList.size(); j++){
    			compareData = compareList.get(j);
    			System.out.println("-- compareData : " + compareData);
    			if(data.equals(compareData)){
    				System.out.println("--- true occr ---");
    				ans = true;
    				break;
    			}else{
    				System.out.println("--- false occr ---");
    				ans = false;
    			}
    		}
    	}
        return ans;
    }
}





public class ISQS0001 {}
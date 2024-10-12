package Longest_SubString_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

// approaching HashSap
public class LSWRC_day03 {

	public static void main(String[] args) {
		String s1 = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "pwwkew";
		String s4 = "abcdefgabcdea";
		String s5 = "dvdf";
		String s6 = " ";

		System.out.println("s1 : " + lengthOfLongestSubstring(s1));
		System.out.println("======================================");
		System.out.println("s2 : " + lengthOfLongestSubstring(s2));
		System.out.println("======================================");
		System.out.println("s3 : " + lengthOfLongestSubstring(s3));
		System.out.println("======================================");
//		System.out.println("s4 : " + lengthOfLongestSubstring(s4));
//		System.out.println("======================================");
//		System.out.println("s5 : " + lengthOfLongestSubstring(s5));
//		System.out.println("======================================");
//		System.out.println("s6 : " + lengthOfLongestSubstring(s6));
	}

    public static int lengthOfLongestSubstring(String s) {
    	int ans = 0;
    	int right = 0;
    	int left = 0;
    	
    	Set<Character> hs = new HashSet<>();
    	
    	//pwwkew
    	while(right < s.length()){
    		char workChar = s.charAt(right);
    		if(!hs.contains(workChar)) {
    			hs.add(workChar);
    			ans = Math.max(ans, right - left + 1);
    			right++;
    		} else {
    			while(s.charAt(left) != workChar) {
        			hs.remove(s.charAt(left));
    				left++;
    			}
    			hs.remove(s.charAt(left));
    			left++;
    		}
    	}
    	System.out.println(hs);
        return ans;
    }
}

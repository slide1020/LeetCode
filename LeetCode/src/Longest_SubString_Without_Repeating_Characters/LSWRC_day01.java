/**
 * 3. Longest Substring Without Repeating Character
Given a string s, find the length of the longest 
substring
 without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3

Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:
0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */


package Longest_SubString_Without_Repeating_Characters;

//use sliding window
public class LSWRC_day01 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String s1 = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "pwwkew";

		System.out.println("s1 : " + lengthOfLongestSubstring(s1));
		System.out.println("s2 : " + lengthOfLongestSubstring(s2));
		System.out.println("s3 : " + lengthOfLongestSubstring(s3));
	}

    public static int lengthOfLongestSubstring(String s) {
    	int ansLen = 0;
    	String ansStr = "";
    	String workStr = "";

    	if(s.length() > 0){
    		for(int i=0 ; i < s.length(); i++){
    			if(i == 0) {
    				workStr += s.charAt(i);
    			}else if(s.charAt(i) != workStr.charAt(i)){
    				
    			}
    		}
    	}else{
    		ansLen = 0;
    	}

        return ansLen;
    }
}

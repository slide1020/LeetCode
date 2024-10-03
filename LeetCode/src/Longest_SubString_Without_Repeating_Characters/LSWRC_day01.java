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

import java.util.ArrayList;

//use sliding window
public class LSWRC_day01 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String s1 = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "pwwkew";

		System.out.println("s1 : " + lengthOfLongestSubstring(s1));
		System.out.println("======================================");
		System.out.println("s2 : " + lengthOfLongestSubstring(s2));
		System.out.println("======================================");
		System.out.println("s3 : " + lengthOfLongestSubstring(s3));
	}

    public static int lengthOfLongestSubstring(String s) {
    	int ansLen = 0;
    	boolean putSwitch = true;
    	
    	String[] sArr = {};
    	sArr = s.split("");
    	
		ArrayList<String> sArrList = new ArrayList<>();
		ArrayList<String> ansList = new ArrayList<>();
		
    	for(int a=0 ; a < s.length(); a++) {
    		sArrList.add(sArr[a]);
    	}
    	
//    	System.out.println(sArrList);
    	
    	if(sArrList.size() > 0) {
    		Loop1 :
    		for(int i=0; i < sArrList.size(); i++) {
				putSwitch = true;
    			System.out.println("- i : " + sArrList.get(i));
        		if(ansList.size() == 0) {
    				ansList.add(sArrList.get(i));
    				putSwitch = false;
    			}else {
    				for(int j=0; j < ansList.size(); j++) {
    					if(sArrList.get(i).equals(ansList.get(j))) {
    						putSwitch = false;
    						ansLen = ansList.size();
    						ansList.clear();
    				    	System.out.println("1 : " + ansList);
    				    	break;
    					}
    				}
    			}
				if(putSwitch) {
					ansList.add(sArrList.get(i));
					System.out.println("2 : " + ansList);
					continue Loop1;
				}
    		}
    	}
    	
    	if(ansLen < ansList.size()) {
    		ansLen = ansList.size();
    	}
        return ansLen;
    }
}

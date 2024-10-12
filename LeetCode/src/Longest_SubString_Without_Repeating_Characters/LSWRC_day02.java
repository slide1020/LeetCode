package Longest_SubString_Without_Repeating_Characters;

import java.util.ArrayList;

public class LSWRC_day02 {
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
		System.out.println("s4 : " + lengthOfLongestSubstring(s4));
		System.out.println("======================================");
		System.out.println("s5 : " + lengthOfLongestSubstring(s5));
		System.out.println("======================================");
		System.out.println("s6 : " + lengthOfLongestSubstring(s6));
	}

    public static int lengthOfLongestSubstring(String s) {
    	// Initialized
    	int ansLen = 0;
    	boolean putSwitch = true;

    	// For using arraylist to make Arr
    	String[] sArr = {};
    	sArr = s.split("");
    	

		ArrayList<String> sArrList = new ArrayList<>();
		ArrayList<String> ansList = new ArrayList<>();
		
		// Arraylist add String
    	for(int a=0 ; a < s.length(); a++) {
        	sArrList.add(sArr[a]);
    	}
    	
    	// Process
    	if(sArrList.size() > 0) {
    		Loop1 :
    		for(int i=0; i < sArrList.size(); i++) {
    			// Making putswitch and after put
				putSwitch = true;
				System.out.println("---------------------------");
    			System.out.println("- i : " + sArrList.get(i));
    			// first, size is 0 then add List 
        		if(ansList.size() == 0) {
    				ansList.add(sArrList.get(i));
    				// Already added, don't put into List later
    				ansLen = ansList.size();
    				putSwitch = false;
    			}else {
    				//ansList and sArrList compare
    				for(int j=0; j < ansList.size(); j++) {
    					// use sliding Window, sArrList and ansList same character
    					if(sArrList.get(i).equals(ansList.get(j))) {
    						putSwitch = false;
    						// claer
    						ansList.clear();
    						// and new one add
    						ansList.add(sArrList.get(i));
    			        	if(ansLen < ansList.size()) {
    			        		ansLen = ansList.size();
    			        	}
    				    	System.out.println("1 : " + ansList);
    				    	break;
    					}
    				}
    			}
        		
        		// put into ansArrList
				if(putSwitch) {
					ansList.add(sArrList.get(i));
					System.out.println("2 : " + ansList);
					// new ansList is bigger than orign ans change length  
		        	if(ansLen < ansList.size()) {
		        		System.out.println("3 : " + ansList);
		        		ansLen = ansList.size();
		        	}
		        	// continue i
					continue Loop1;
				}
    		}
    	}
    	return ansLen;
    }
}

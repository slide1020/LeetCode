package Longest_SubString_Without_Repeating_Characters;

import java.util.ArrayList;

public class LSWRC_day02 {
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
    						//ansLen = ansList.size();
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
				
	        	if(ansLen < ansList.size()) {
	        		System.out.println("3 : " + ansList);
	        		ansLen = ansList.size();
	        	}
    		}
    	}
    	
        return ansLen;
    }
}

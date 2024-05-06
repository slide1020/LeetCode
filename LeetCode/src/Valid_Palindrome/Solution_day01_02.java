package Valid_Palindrome;

import java.util.regex.Pattern;

public class Solution_day01_02 {
	public static void main(String args[]){
		String s = "A man, a plan, a canal: Panama";
		String s1 = "race a car";
		String s2 = " ";
		String s3 = "a";
		String s4 = "aa";
		String s5 = "0P";
		
		valid_palindrome(s5);
	}
	
	private static boolean valid_palindrome(String s) {
		boolean workYN = true;
		String stringCase = "";
		String rightString = "";
		String reverseString = "";
		
		int start = 0;
		int last = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(!" ".equals(s.substring(i, i+1))) {
				if(Pattern.matches("^[A-Z]*$", s.substring(i, i+1))){
					stringCase += s.substring(i,i+1).toLowerCase();
				}else if(Pattern.matches("^[0-9a-z]*$", s.substring(i, i+1))){
					stringCase += s.substring(i,i+1);
				}
			}
		}
		
		
		last = stringCase.length();
		
		while(last >= start) {
			rightString += stringCase.substring(start,start+1);
			start++;
			reverseString += stringCase.substring(last-1,last);
			last--;
		}
		
		System.out.println("reverseString : " + reverseString + " / rightString : " + rightString);
		
		
		if(rightString.equals(reverseString)){
			workYN = true;
		} else {
			workYN = false;
		}
		System.out.println(workYN);
		return workYN;

	}
}

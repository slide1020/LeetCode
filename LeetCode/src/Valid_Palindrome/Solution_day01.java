/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
... I dont understood about this problem
I think solution that UpperCase to LowerCase.. but it isn't
this problem is Palindrome.
Palindrome mean that eqauls to reverse sentence and right sentence
*/

package Valid_Palindrome;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Solution_day01 {
	public static void main(String args[]){
		String s = "A man, a plan, a canal: Panama";
		String s1 = "race a car";
		String s2 = " ";
		String s3 = "a";
		
		valid_palindrome(s3);
	}
	
	private static boolean valid_palindrome(String s) {
		boolean workYN = true;
		
		//ArrayList<String> arrayListString = new ArrayList<String>();
		
		String stringCase = "";
		
		for(int i=0; i<s.length(); i++) {
			System.out.println(i + ", s.substring : " + s.substring(i, i+1));
			if(!" ".equals(s.substring(i, i+1)) && Pattern.matches("^[a-zA-Z]*$", s.substring(i, i+1))) {
				stringCase += s.substring(i,i+1);
				workYN = true;
			}
		}
		
		for(int j=0; j<stringCase.length(); j++) {
			if(Pattern.matches("^[A-Z]*$",stringCase.substring(j, j+1))){
				stringCase.substring(j, j+1).toLowerCase();
				workYN = true;
				break;
			}else {
				workYN = false;
			}
		}
		System.out.println(stringCase + " / workYn : " + workYN);
		
		return workYN;
	}
}

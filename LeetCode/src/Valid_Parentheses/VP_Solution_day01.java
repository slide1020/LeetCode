/**
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false


Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/
package Valid_Parentheses;

import java.util.Stack;

public class VP_Solution_day01 {
	public static void main(String args[]){
		boolean ans = true;
		
		String s1 = "()";
		String s2 = "()[]{}";
		String s3 = "(]";
		String s4 = "()[";
		String s5 = "(";
		String s6 = "{[]}";

		ans = Valid_Parentheses(s6);
		System.out.println(ans);
	}
	
	public static boolean Valid_Parentheses(String s){
		Stack<String> stackStr = new Stack<String>();
		String pop1Str = "";
		String pop2Str = "";
		int stackSize = 0;

		// String is odd number or less 2 is false
		// odd number is overflow
		if(s.length() < 2 || s.length() % 2 != 0 ){
			return false;
		}

		// put to s for stack
		for(int i=0; i<s.length(); i++){
			stackStr.push(s.substring(i,i+1));
		}

		// loop is going, stack size is being short.
		// that's why not in the loop declare size, declation is outside 
		stackSize = stackStr.size();

		// being algoritm
		// use pop str 1 and 2
		// compare eachother
		if(stackStr.size() > 0){
			for(int j=0 ; j < stackSize; j++){
				if(!stackStr.isEmpty()){

					pop1Str = stackStr.pop();
					pop2Str = stackStr.pop();

					if("}".equals(pop1Str)){
						if("{".equals(pop2Str)){
							continue;
						}else{
							return false;
						}
					}else if("]".equals(pop1Str)){
						if("[".equals(pop2Str)){
							continue;
						}else{ 
							return false;
						}
					}else if(")".equals(pop1Str)){
						if("(".equals(pop2Str)){
							continue;
						}else{
							return false;
						}
					}
				}
			}
		}

		return true;
	}
}

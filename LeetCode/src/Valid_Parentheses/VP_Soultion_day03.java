package Valid_Parentheses;
import java.util.Stack;

public class VP_Soultion_day03 {
	public static void main(String args[]){
		boolean ans = true;
		String s1 = "()";
		String s2 = "()[]{}";
		String s3 = "(]";
		String s4 = "()[";
		String s5 = "(([]){})";
		String s6 = "{[]}";
		String s7 = "((";

		ans = Valid_Parentheses(s1);
		System.out.println(ans);
		ans = Valid_Parentheses(s2);
		System.out.println(ans);
		ans = Valid_Parentheses(s3);
		System.out.println(ans);
		ans = Valid_Parentheses(s4);
		System.out.println(ans);
		ans = Valid_Parentheses(s5);
		System.out.println(ans);
		ans = Valid_Parentheses(s6);
		System.out.println(ans);
		ans = Valid_Parentheses(s7);
		System.out.println(ans);
	}
	

	public static boolean Valid_Parentheses(String s){
	
		Stack<String> stackStr = new Stack<String>();
		// Step1. String is odd number or less 2 is false
		// odd number is overflow
		if(s.length() < 2 || s.length() % 2 != 0 ){
			return false;
		}
		
		// Step2. in order Case Process
		// put to s for stack
		for(int i=0; i<s.length(); i++){
			if("(".equals(s.substring(i,i+1)) || "{".equals(s.substring(i,i+1)) || "[".equals(s.substring(i,i+1))) {
				stackStr.push(s.substring(i,i+1));
			}
			if(!stackStr.empty()) {
				if(")".equals(s.substring(i,i+1))){
					if(!"(".equals(stackStr.pop())) {
						return false;
					}
				}else if("}".equals(s.substring(i,i+1))) {
					if(!"{".equals(stackStr.pop())) {
						return false;
					}
				}else if("]".equals(s.substring(i,i+1))) {
					if(!"[".equals(stackStr.pop())) {
						return false;
					}
				}
			}else {
				return false;
			}
		}
		
		if(stackStr.empty()) {
			return true;
		}
		return false;
	}
}

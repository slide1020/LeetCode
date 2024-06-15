package Valid_Parentheses;
import java.util.Stack;

public class VP_Solution_day02 {
	public static void main(String args[]){
		boolean ans = true;
		String s1 = "()";
		String s2 = "()[]{}";
		String s3 = "(]";
		String s4 = "()[";
		String s5 = "(([]){})";
		String s6 = "{[]}";

//		ans = Valid_Parentheses(s1);
//		System.out.println(ans);
//		ans = Valid_Parentheses(s2);
//		System.out.println(ans);
//		ans = Valid_Parentheses(s3);
//		System.out.println(ans);
//		ans = Valid_Parentheses(s4);
//		System.out.println(ans);
		ans = Valid_Parentheses(s5);
		System.out.println(ans);
//		ans = Valid_Parentheses(s6);
//		System.out.println(ans);
	}
	

	public static boolean Valid_Parentheses(String s){
		boolean answer = false;

		//Case1 : Parenthese is in order
		Stack<String> stackStr = new Stack<String>();
		//Case2 : Parenthese is bind
		Stack<String> stackStrDir = new Stack<String>();
		Stack<String> stackStrRev = new Stack<String>();

		String pop1Str = "";
		String pop2Str = "";

		int halfStringSize = 0;
		int stackSize = 0;

		// Step1. String is odd number or less 2 is false
		// odd number is overflow
		if(s.length() < 2 || s.length() % 2 != 0 ){
			return false;
		}
		
		// Step2. in order Case Process
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
							answer = true;
							continue;
						}else{
							answer = false;
							break;
						}
					}else if("]".equals(pop1Str)){
						if("[".equals(pop2Str)){
							answer = true;
							continue;
						}else{
							answer = false;
							break;
						}
					}else if(")".equals(pop1Str)){
						if("(".equals(pop2Str)){
							answer = true;
							continue;
						}else{
							answer = false;
							break;
						}
					}else {
						answer = false;
						break;
					}
				}
			}
		}
		// Step3. bind Case Process
		// only answer is false to start this process
		// put to stackStrDir is in order and stackStrRev is reverse order
		if(!answer){
			halfStringSize = s.length() / 2;
			pop1Str = "";
			pop2Str = "";

			for(int a = 0; a < halfStringSize ; a++){
				stackStrDir.push(s.substring(a,a+1));
			}
			for(int b = s.length(); b > halfStringSize ; b--){
				stackStrRev.push(s.substring(b-1,b));
			}

			//compare eachother
			for(int c = 0; c < halfStringSize; c++){
				if(!stackStrDir.isEmpty()){
					pop1Str = stackStrDir.pop();
					pop2Str = stackStrRev.pop();

					if("[".equals(pop1Str)){
						if("]".equals(pop2Str)){
							answer = true;
							continue;
						}else{
							answer = false;
							break;
						}
					}else if("{".equals(pop1Str)){
						if("}".equals(pop2Str)){
							answer = true;
							continue;
						}else{
							answer = false;
							break;
						}
					}else if("(".equals(pop1Str)){
						if(")".equals(pop2Str)){
							answer = true;
							continue;
						}else{
							answer = false;
							break;
						}
					} else {
						answer = false;
						break;
					}
				}
			}
		}

		return answer;
    }
}

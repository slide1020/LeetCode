package inSubsequences_189;
import java.util.ArrayList;
import java.util.Arrays;


public class IS_day02 {
	public static void main(String[] args) {
		String s1 = "abc";
		String t1 = "ahbgdc";
		String s2 = "axc";
		String t2 = "ahbgdc";
		String s3 = "abc";
		String t3 = "abx";
		String s4 = "acb";
		String t4 = "ahbgdc";
		String s5 = "aaaaaa";
		String t5 = "bbaaaa";
		
		boolean ans1 = isSubsequence(s1, t1);
		System.out.println(ans1); // true
		boolean ans2 = isSubsequence(s2, t2);
		System.out.println(ans2); // false
		boolean ans3 = isSubsequence(s3, t3);
		System.out.println(ans3); // false
		boolean ans4 = isSubsequence(s4, t4);
		System.out.println(ans4); // false
		boolean ans5 = isSubsequence(s5, t5);
		System.out.println(ans5); // false
	}

    public static boolean isSubsequence(String s, String t) {
    	boolean ans = true;
    	int idx = 0;
    	String data = "";
    	String compareData = "";

    	// make Two List by inherit
    	ArrayList<String> dataList = new ArrayList<String>(Arrays.asList(String.valueOf(s).split("")));
    	ArrayList<String> compareList = new ArrayList<String>(Arrays.asList(String.valueOf(t).split("")));
    	
    	// fixed case handled
    	if(s.length() > t.length()) {
    		return false;
    	} else if(s.length() == 0) {
    		return true;
    	}
    		
    	// start process
    	for(int i=0; i<dataList.size(); i++){
    		// ans is break next dataList
    		if(ans == false) break;
    		
    		data = dataList.get(i);
    		
    		while(idx<compareList.size()) {
    			compareData = compareList.get(idx);
    			if(data.equals(compareData) && i <= idx){
    				ans = true;
        			idx++;
        			// when compareList ended but last ans is true wrong ans
        			// Make ans to false
        			if((i < dataList.size()-1 && idx == compareList.size())) {
        				ans = false;
        			}
    				break;
    			}else{
    				ans = false;
        			idx++;
    			}
    			// idx is ended ans is false
    			if(idx == compareList.size()-1) {
    				ans = false;
    			}
    		}
    	}
        return ans;
    }
}




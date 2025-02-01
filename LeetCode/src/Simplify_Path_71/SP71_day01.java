/**
 * You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

The rules of a Unix-style file system are as follows:

A single period '.' represents the current directory.
A double period '..' represents the previous/parent directory.
Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
The simplified canonical path should follow these rules:

The path must start with a single slash '/'.
Directories within the path must be separated by exactly one slash '/'.
The path must not end with a slash '/', unless it is the root directory.
The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
Return the simplified canonical path.

Example 1:
Input: path = "/home/"
Output: "/home"
Explanation:
The trailing slash should be removed.

Example 2:
Input: path = "/home//foo/"
Output: "/home/foo"
Explanation:
Multiple consecutive slashes are replaced by a single one.

Example 3:
Input: path = "/home/user/Documents/../Pictures"
Output: "/home/user/Pictures"
Explanation:
A double period ".." refers to the directory up a level (the parent directory).

Example 4:
Input: path = "/../"
Output: "/"

Explanation:
Going one level up from the root directory is not possible.

Example 5:
Input: path = "/.../a/../b/c/../d/./"
Output: "/.../b/d"

Explanation:
"..." is a valid name for a directory in this problem.

 */


package Simplify_Path_71;

import java.util.ArrayList;

public class SP71_day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ex1 = "/home/";							 // "/home"
		String ex2 = "/home//foo/"; 					 // "/home/foo"
		String ex3 = "/home/user/Documents/../Pictures"; // "/home/user/Pictures"
		String ex4 = "/../";							 // "/"
		String ex5 = "/.../a/../b/c/../d/./";			 // "/.../b/d"
		
		System.out.println("ex1 : " + simplifyPath(ex1));
//		System.out.println("ex2 : " + simplifyPath(ex2));
//		System.out.println("ex3 : " + simplifyPath(ex3));
//		System.out.println("ex4 : " + simplifyPath(ex4));
//		System.out.println("ex5 : " + simplifyPath(ex5));
	}
	
    public static String simplifyPath(String path) {
    	String rtnPath = "/";
    	String wFold = "";
    	ArrayList wPath = new ArrayList();
    	
    	for(int i=0; i<path.length(); i++) {
    		System.out.println(path.charAt(i));
    		if(path.charAt(i) != '.' || path.charAt(i) != '/'){
    			int j = i; 
    			while(path.charAt(j) == '.' || path.charAt(j) == '/') {
    				wFold += path.charAt(j);
    				j++;
    			}
    			System.out.println(wFold);
    		}
    	}
    	 
        return rtnPath;
    }

}

/**
 * 70. Climbing Stairs
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2

Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3

Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Constraints:
1 <= n <= 45
 */
/*
 * 
1 -> 1
1

2 -> 1+1, 2
2

3 -> 1+1+1, 1+2, 2+1
3

4 -> 1+1+1+1, 2+1+1, 1+2+1, 1+1+2, 2+2
5

5 -> 1+1+1+1+1, 2+1+1+1, 1+2+1+1, 1+1+1+2, 1+1+2+1, 2+2+1, 2+1+2, 1+2+2
8
*/

package climbStairs_70;

import java.util.HashMap;
import java.util.Map;

public class CS_day01 {

	static Map<Integer, Integer> hm = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(1));
		System.out.println(climbStairs(2));
		System.out.println(climbStairs(3));
		System.out.println(climbStairs(4));
		System.out.println(climbStairs(5));
		System.out.println(climbStairs(6));
		System.out.println(climbStairs(35));
	}

	// this is fibo..
	// using memoization
	public static int climbStairs(int n) {
		int ans = 0;
		int index = 3;
		
		if(n==1 || n==2 || n==3) {
			hm.put(n, n);
			return n;
		}
		
		while(index <= n){
			if(hm.containsKey(n)){
				return hm.get(n);
			} else {
				ans = hm.get(index-1) + hm.get(index-2);
				hm.put(index, ans);
			}
			index++;
		}
		return hm.get(n); 
    }
}

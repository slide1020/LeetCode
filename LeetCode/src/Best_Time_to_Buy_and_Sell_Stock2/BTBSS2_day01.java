/**
 * 122. Best Time to Buy and Sell Stock II
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. 
You can only hold at most one share of the stock at any time. 
However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 */

package Best_Time_to_Buy_and_Sell_Stock2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BTBSS2_day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ex1 = {7,1,5,3,6,4};
		int[] ex2 = {1,2,3,4,5};
		int[] ex3 = {7,6,4,3,1};
		
		System.out.println("ex1 : " +maxProfit(ex1));
//		System.out.println("ex2 : " +maxProfit(ex2));
//		System.out.println("ex3 : " +maxProfit(ex3));
	}
	
    public static int maxProfit(int[] prices) {
        int ans = 0;
        int backNum = 0;
        int sumNum = 0;
        int tempSumNum = 0;
        
        //change Array to List cause can not reuse argument
        //Case 1. use asList
        //Using asList is not convert to Integer 
        //List<int[]> pricesList = Arrays.asList(prices);
        //So use loop
        List<Integer> pricesList = new ArrayList<>();
        for(int element : prices) {
        	pricesList.add(element);
        }
        
        // find ans
        for(int i = pricesList.size()-1; i >= 0 ; i--) {
        	backNum = pricesList.get(i);
        	for(int j = i-1 ; j >= 0 ; j--) {
        		System.out.println("when err Occr" +  pricesList.get(j));
        		sumNum = backNum - pricesList.get(j);
        		if(sumNum > 0 && sumNum > tempSumNum) {
        			tempSumNum = sumNum;
        			ans += tempSumNum;
        			pricesList.remove(j);
        		}
        	}
        }
        
        return ans;
    }

}

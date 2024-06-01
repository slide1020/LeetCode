/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 */

package Best_Time_to_Buy_and_Sell_Stock01;

public class BTBSS01_Solution_day01 {
	public static void main(String[] args) {
		int[] prices1 = {7,1,5,3,6,4};
		int[] prices2 = {7,6,4,3,1};
		int[] prices3 = {7,1,5,3,6,4};
		
		int answer = BestTimeSellStock(prices3);
		
		System.out.println("answer is : " + answer);
	}
	
	public static int BestTimeSellStock(int[] prices) {
		int result = 0;
		int backNum = 0;
		int sumNum = 0;
		
		for(int i = prices.length-1; i >= 0 ; i--) {
			backNum = prices[i];
			
			if((result != 0 && backNum < result) || backNum == 0) {
				continue;
			}
			
			for(int j=0 ; j <= i ; j++) {
				if(backNum < prices[j]) {
					continue;
				}else {
					sumNum = backNum - prices[j];
					if(sumNum > 0 && sumNum > result) {
						result = sumNum;
					}
				}
			}

		}
		return result;
	}
}

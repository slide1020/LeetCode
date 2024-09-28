package Best_Time_to_Buy_and_Sell_Stock2;

/*
 * Don't get confuse
 * ans is simple
 * yon don't have to sell best prices
 * if you got the profit each day, just sell
 * then you got the best profit.
 */

public class BTSSS_day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ex1 = {7,1,5,3,6,4};
		int[] ex2 = {1,2,3,4,5};
		int[] ex3 = {7,6,4,3,1};
		int[] ex4 = {1,2};
		int[] ex5 = {1};
		int[] ex6 = {};
		int[] ex7 = {6,1,3,2,4,7};

		System.out.println("ex1 : " +maxProfit(ex1));
		System.out.println("ex2 : " +maxProfit(ex2));
		System.out.println("ex3 : " +maxProfit(ex3));
		System.out.println("ex4 : " +maxProfit(ex4));
		System.out.println("ex5 : " +maxProfit(ex5));
		System.out.println("ex6 : " +maxProfit(ex6));
		System.out.println("ex7 : " +maxProfit(ex7));
	}
	
    public static int maxProfit(int[] prices) {
    	int ans = 0;
    	int buy = 0;
    	int profit = 0;
    	
    	for(int i=0 ; i <prices.length-1;i++) {
    		buy = prices[i];
    		if(prices[i] < prices[i+1]) {
    			profit = prices[i+1] - buy;
    			ans += profit;
    		}
    	}
    	
    	return ans;
    }
}

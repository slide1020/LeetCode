package Best_Time_to_Buy_and_Sell_Stock2;
//wrong
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BTBSS2_day02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ex1 = {7,1,5,3,6,4};
		int[] ex2 = {1,2,3,4,5};
		int[] ex3 = {7,6,4,3,1};
		int[] ex4 = {1,2};
		int[] ex5 = {1};
		int[] ex6 = {};
		int[] ex7 = {6,1,3,2,4,7};

//		System.out.println("ex1 : " +maxProfit(ex1));
		System.out.println("ex2 : " +maxProfit(ex2));
//		System.out.println("ex3 : " +maxProfit(ex3));
//		System.out.println("ex4 : " +maxProfit(ex4));
//		System.out.println("ex5 : " +maxProfit(ex5));
//		System.out.println("ex6 : " +maxProfit(ex6));
		System.out.println("ex7 : " +maxProfit(ex7));
	}

    public static int maxProfit(int[] prices) {
        int ans = 0;
        int sum = 0;
        
        // standIdx Loop i
        Loop1:
        for(int i=0 ; i < prices.length; i++){
        	for(int j=i+1 ; j < prices.length; j++){
        		// on the bases of i, j loop
        		// today's stock prices is bigger than last day stock prices 
        		if(prices[j] > prices[i]){
            		// out of index control
        			// if i can sell the lastday, sell the stock and braek the loop1.  
        			if(j == prices.length-1 && sum == 0 && prices[prices.length-1] > prices[i]){
        				sum = prices[prices.length-1] - prices[i];
        				System.out.println("1 - i : " + i + " / prices[i] : " + prices[i] + " / prices[j] : " + prices[j] + "/ prices.length :" + prices.length + "/ sum : " + sum);
            			ans += sum;
            			sum = 0; 
            			break Loop1;
            		// main process
            		// if today is best prices, sell the stock
        			}else if(sum < prices[j] - prices[i] && prices[j] > prices[j+1]){
            			sum = prices[j] - prices[i];
            			System.out.println("2 - i : " + i + " / prices[i] : " + prices[i] + " / prices[j] : " + prices[j] + "/ prices[j+1] :" + prices[j+1] + "/ sum : " + sum);
            			ans += sum;
            			sum = 0;
            			i = j;
            			break;
            		}
            	}
        	}
        }
        return ans;
    }
}

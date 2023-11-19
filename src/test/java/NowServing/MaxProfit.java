package NowServing;



	public class MaxProfit {
	    public static int maxProfit(int[] prices) {
	        int maxProfit = 0;
	        int minPrice = Integer.MAX_VALUE;

	        for (int price : prices) {
	            if (price < minPrice) {
	                minPrice = price;
	            } else if (price - minPrice > maxProfit) {
	                maxProfit = price - minPrice;
	            }
	        }

	        return maxProfit;
	    }

	    public static void main(String[] args) {
	        int[] prices = {7, 1, 5, 3, 6, 4};//5
	        int maxProfit = maxProfit(prices);
	        System.out.println("Maximum profit: " + maxProfit);
	    }
	}





public class buyingAndSellingStocks {
    public static int maxProfit(int prices[]){
        int buyPrice =Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice< prices[i])
            {
                int profit = prices[i]- buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {2,4,5,7,1,4,9,4};
        System.out.println(maxProfit(prices));
    }
}

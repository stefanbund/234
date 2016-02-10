import java.util.ArrayList;

//import java.util.Random;

public class mainer 
{
	public Market market; 
	
	public static void main(String[] args) 
	{ 											//main compilation unit, runs first
		Market market = new Market(6000);
												//what shape should the market take? 
												// what data structure should house all my stocks? 
		//market.printMarket(); //market exists

		for(int i = 0; i <= 100000; i++)
		{
			Buyer b = new Buyer(); //print numTransactions, apt, budget
			b.buildRandomPortfolio(market);
			
			ArrayList<Transaction> t = new ArrayList<Transaction>();//stuff for sale	
			t = b.searchForSaleableHoldings(); //saleable holdings should be put upon the for-sale-market
			updatePricingForBoughtStocks(t);

			for(Transaction y : t)
			{
				market.forSaleMarket.add(y); //balance out, as new buyers are added to the marketplace
			}
			
		}
				
	}

	/**
	 * 
	 * @param t, a list of transactions you've selected as saleable
	 * @param market, the current stock index of prices, which you'll adjust, once a sale is made
	 */
	private static void updatePricingForBoughtStocks(ArrayList<Transaction> t) 
	{
		
		for(Transaction tr : t )
		{
							//get the stock symbol
			//tr.price	
							//search the market for the stock, by symbol
	
							//take that stock and adjust its price upward by a random number 
			//double randomNewPriceIncrement = r.nextDouble(); //add new value to the price, after buying
			//l.price += randomNewPriceIncrement;
		}
	}
}	



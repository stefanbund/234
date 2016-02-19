import java.util.ArrayList;
import java.util.Random;

//import java.util.Random;

public class mainer 
{
	//public Market market; 
	
	public static void main(String[] args) 
	{ 											//main compilation unit, runs first
		Market market = new Market(6000); //THE MAIN MARKET THAT MATTERS
		for(int i = 0; i <= 5; i++)
		{
			Buyer b = new Buyer(); 									//print numTransactions, apt, budget
			//System.out.println("new buyer made here...");
			try
			{
				market  = b.buildRandomPortfolio(market); 			//done
			}catch(Exception e)
			{
				if(e.getMessage() != null)
				{
					System.out.println("exception " + e.getMessage());
				}
			}
		}
		
		try
		{
			for(Transaction t : market.forSaleMarket) //ITERATE THE STUFF FOR SALE
			{
				System.out.println("buyer " + t.buyerName + " holds " + t.numStockPurchased + " of "+ t.symbol +" @ $" +t.price);
			}
		}catch(Exception e)
		{
			if(e.getMessage() != null)
			{
					System.out.println("exception " + e.getMessage());
			}

		}
	}

	/**
	 * 
	 * @param t, a list of transactions you've selected as saleable
	 * @param market, the current stock index of prices, which you'll adjust, once a sale is made
	 */
	
}	



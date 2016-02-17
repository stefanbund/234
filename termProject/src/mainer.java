import java.util.ArrayList;
import java.util.Random;

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
			
						//for all transactions in your portfolio, adjust their prices upward
			if(b.p != null)
			{
				for (Transaction t : b.p.portfolio)
				{
						//get the symbol name and search for it within the wider market
						System.out.println("symbol in portfolio = " + t.symbol);
						for(Stock l : market.m)
						{
							if(l.symbol.equalsIgnoreCase(t.symbol))
							{
								Random inc = new Random();
								l.price = l.price + inc.nextDouble(); //ups the price a little bit
							}
						}
				}
			}
			
		}
				
	}

	/**
	 * 
	 * @param t, a list of transactions you've selected as saleable
	 * @param market, the current stock index of prices, which you'll adjust, once a sale is made
	 */
	
}	



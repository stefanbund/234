import java.util.ArrayList;
import java.util.Random;


public class Buyer {
	
	/* DECLARATIONS: */
	public double budget; //in currency, credit the budget once you've sold something
	public int name; //identifier
	Portfolio p; //p.portfolio
	public ArrayList<Transaction> portfolio = new ArrayList<Transaction>();
	int numTransactions; //determined randomly
	double apt; //allocation per transaction, $ budgeted per transaction of stock
	
	Market storageMarket;
	
	/**
	 * 1. need to know the buyer's budget (randomly)
	 * 2. know the number of stock transactions he/she plans to make (transaction = # of stock, @ at a given price)
	 * 3. budget / num transactions = allocation per transaction (apt), "budget per transaction"
	 */

	public Buyer() 						//resp setup
	{
		establishBudget(); //STEP ONE ok
		establishBuyerName();
		proveEstablishment();
		establishNumberOfTransactions();	//step two ok
		establishAPT(); //step three, budget per transaction
		//buildRandomPortfolio(Market ); //portfolio is a collection of groups of stock we bought, transactions
	}
	
	/**
	 * apt expresses the amount we can spend per transaction, given whatever price is
	 * per stock, which will differ, per transaction
	 * 
	 */
	private void establishAPT() 
	{
		apt = budget / numTransactions; 
		//System.out.println(" allocated budget per transaction is " + apt);
	}

	private void establishNumberOfTransactions() 
	{
		//set numTransactions
		
		Random r = new Random();
		numTransactions = r.nextInt(25); //limit of 25 transactions
		//System.out.println("num transactions = " + numTransactions); //ok
	}
	
	/**
	 * algo: 
	 * 1. take the budget, get numTransactions, determine apt
	 * 
	 * 2. get the market, randomly choose a stock to buy  OK
	 * 
	 * 3. get the price of the chosen stock, then divide apt by the stock's price <--
	 * 4. step 3 provides a volume of stock, numStock to buy
	 * 5. make a transaction, wherein you buy numStock in (4), then 
	 * 6. push the transaction into the Buyer's portfolio (use the .add() feature in the ArrayList)
	 */
	public Market buildRandomPortfolio(Market market) 
	{
		//boolean done = false; 
		//check for the stock in the market, if it's ipoQty == 0, 
		//search the for-Sale-market, for stuff that's on sale [NEW RULE]
		
		for(int i = 0; i <= numTransactions; i++) //PORTFOLIO CONSTRUCTION
		{
			Random r = new Random();
			int ind = r.nextInt(6000);
			Stock l = market.m.get(ind); 				//! gives you a randomly chosen stock
			//System.out.println("RANDOM stock details for stock " + ind + " is " + l.symbol + "@ $" + l.price + " in industry " + l.getIndustry()); //l represents the stock
															//prepare to make a transaction at this point
			Transaction t = new Transaction();
			t.price = l.price;
			t.symbol = l.symbol;
			t.numStockPurchased = (int) (apt / l.price); //complete transaction
			t.buyerName = name; 
			portfolio.add(t); //moves the transaction into the portfolio
			
				//now change the price of the stock you just bought
			Random newPrice = new Random();
			l.price = l.price + newPrice.nextDouble(); //change the pricing in one stock
			//System.out.println("price of stock, " + l.symbol +  " is now " + l.price);
			l.priceHistory.add(l.price);
			//l.displayPriceHistory();			
		}
		
		Market l = sellOffWinners(market);
		
		
		return l; 
 
	}
/**
 * 
 * take the existing portfolio,
 * loop through it
 * check the price of the holding against the current price of the stock in the market
 * if the price of the holding is less than the current market price, you've made $, 
 * put it up for sale....
 */
	public ArrayList<Transaction> searchForSaleableHoldings() 
	{
		return portfolio;
		
	}

	private void proveEstablishment() 
	{
		//System.out.println("buyer " + name + " has a budget of $" + budget);
	}

	private void establishBuyerName() 
	{
		Random r = new Random();
		name = r.nextInt(1000000); //long and semi-unique
	}

	private void establishBudget() 
	{
		Random r = new Random();
		budget = r.nextInt() / 100; //initialized, setting an initial value to something
		budget = Math.abs(budget);
		//System.out.println("budget is set to " + budget);
	}

	public boolean testForCompletedPortfolio() 
	{
		boolean finish = false; 

		if(this.p != null)
		{
			finish = true; 
		}
		return finish;
	}

	public Market sellOffWinners(Market market) 
	{
		//System.out.println("entering sell off");
	try{
				for(Transaction t : this.portfolio)
				{
					//System.out.println("iterating portfolio of buyer");
																		//if the price of your holding < current market price
																		//to do that, iterate the market for the symbol in the transaction
					for(Stock s : market.m)
					{
						if(t.symbol.equalsIgnoreCase(s.symbol))
						{
							if(t.price < s.price) //if your holding is more valuable now
							{
								market.forSaleMarket.add(t);
								//System.out.println("just put up a transaction for sale");
							}
							else
							{
								//System.out.println("sorry, not for sale right now");
							}
							
						}
							
							//take your holding, put it into the forSaleMarket
					}
					
				}
	}catch(Exception e)
	{
		if(e.getMessage() != null)
		{
				System.out.println("exception " + e.getMessage());
		}
	}
		
		return market;
	}
	
	

}

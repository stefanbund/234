import java.util.Random;


public class Buyer {
	
	/* DECLARATIONS: */
	public double budget; //in currency
	public int name; //identifier
	Portfolio p; 
	int numTransactions; //determined randomly
	double apt; //allocation per transaction, $ budgeted per transaction of stock
	
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
		System.out.println(" allocated budget per transaction is " + apt);
	}

	private void establishNumberOfTransactions() 
	{
		//set numTransactions
		
		Random r = new Random();
		numTransactions = r.nextInt(25); //limit of 25 transactions
		System.out.println("num transactions = " + numTransactions);
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
	public void buildRandomPortfolio(Market market) 
	{
		//the market, 6,000 stocks
		Random r = new Random();
		int ind = r.nextInt(6000);
		
		Stock l = market.m.get(ind); //! gives you a randomly chosen stock

		System.out.println("RANDOM stock details for stock " + ind + " is " + l.symbol + "@ $" + l.price); //l represents the stock
			//prepare to make a transaction at this point
		
			//define the variables necessary to make a transaction, purchase of stock
		
			//after you've made your transaction (Transaction t = new Transaction();, set its vars
		
		
			//add the transaction onto the Portfolio, p, belonging to this Buyer
		
		
			//project creates a large realistic market of stocks, creates one buyer who
			//fills up his/her portfolio with a random number of transactions, 
			//END
	
	}

	private void proveEstablishment() 
	{
		System.out.println("buyer " + name + " has a budget of $" + budget);
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
		System.out.println("budget is set to " + budget);
	}
	
	

}

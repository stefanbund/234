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
		buildRandomPortfolio(); //portfolio is a collection of groups of stock we bought, transactions
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
	 * 2. get the market, randomly choose a stock to buy <--
	 * 3. get the price of the chosen stock, then divide apt by the stock's price
	 * 4. step 3 provides a volume of stock, numStock to buy
	 * 5. make a transaction, wherein you buy numStock in (4), then 
	 * 6. push the transaction into the Buyer's portfolio
	 */
	private void buildRandomPortfolio() 
	{
		
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
		if(budget < 0)
		{
			budget = budget * -1; //turn it positive
		}
		System.out.println("budget is set to " + budget);

	}
	
	

}

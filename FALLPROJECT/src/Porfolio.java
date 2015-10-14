import java.util.ArrayList;


public class Porfolio {
	ArrayList<Transaction> portfolio = new ArrayList<Transaction>();
	
	/**
	 * 
	 * RECORD OF PURCHASES OF STOCK
	 */
	public Porfolio() {

	
	
	}
	
	public void addStockToPortfolio(Transaction t)
	{
		portfolio.add(t);
	}
	
	/**
	 * 
	 * print the portfolio
	 */
	public void printPortfolio()
	{
		
	}

}

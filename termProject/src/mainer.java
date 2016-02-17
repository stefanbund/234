import java.util.ArrayList;
import java.util.Random;

//import java.util.Random;

public class mainer 
{
	//public Market market; 
	
	public static void main(String[] args) 
	{ 											//main compilation unit, runs first
		Market market = new Market(6000);
		for(int i = 0; i <= 100000; i++)
		{
			Buyer b = new Buyer(); 									//print numTransactions, apt, budget
			//System.out.println("new buyer made here...");
			market  = b.buildRandomPortfolio(market); 				//== true
		}
	}

	/**
	 * 
	 * @param t, a list of transactions you've selected as saleable
	 * @param market, the current stock index of prices, which you'll adjust, once a sale is made
	 */
	
}	



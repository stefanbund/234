/**
 * 
 */

/**
 * @author stefanbund
 *
 */
public class Market {

	/**
	 * CONSTRUCTOR: FIRST THING THE OBJECT DOES WHEN IT'S CREATED 
	 */
	public Market() 
	{
		initializeAllStocksInSimulation();		//set up the market
	}

	private void initializeAllStocksInSimulation() 
	{
		for(int i = 0 ; i <= 6000; i++)
		{
			Stock s = new Stock();//creates one stock
			System.out.println("the new price of stock " + s.getSymbol() + " is " + s.getPrice());
			System.out.println("the ipo float was " + s.getIpoQty());
			System.out.println();
		}
	}

}

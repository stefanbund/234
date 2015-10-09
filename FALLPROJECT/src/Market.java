import java.util.ArrayList;

/**
 * 
 */

/**
 * @author stefanbund
 *
 */
public class Market {
	private ArrayList<Stock> index = new ArrayList<Stock>();

	/**
	 * @return the index
	 */
	public ArrayList<Stock> getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(ArrayList<Stock> index) {
		this.index = index;
	}

	/**
	 * CONSTRUCTOR: FIRST THING THE OBJECT DOES WHEN IT'S CREATED 
	 */
	public Market() 
	{
		//initializeAllStocksInSimulation();		//set up the market
		ArrayList<Stock> l = new ArrayList<Stock>();
		l = initializeAllStocksInSimulation();
		setIndex(l);
	}

	private ArrayList<Stock> initializeAllStocksInSimulation() 
	{
		ArrayList<Stock> ind = new ArrayList<Stock>();
		
		for(int i = 0 ; i <= 6000; i++)
		{
			Stock s = new Stock();//creates one stock
//			System.out.println("the new price of stock " + s.getSymbol() + " is " + s.getPrice());
//			System.out.println("the ipo float was " + s.getIpoQty());
//			System.out.println();
			ind.add(s); //!
		}
		return ind; 
	}

}

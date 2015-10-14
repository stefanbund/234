import java.util.ArrayList;

/**
 * 
 */

/**
 * @author stefanbund
 *
 */
public class Market {
	
	private ArrayList<Stock> index = new ArrayList<Stock>();//generic syntax for creating al's

	/**
	 * ANYTIME I WANT TO ADD A NEW STOCK TO THE MARKET (FOR SALE), I CALL THIS:
	 * @param stock
	 */
	public void addAStockToTheIndex(Stock stock)
	{
		index.add(stock);
	}
	
	/**
	 * PRINT OUT ALL THE STOCKS IN THE INDEX
	 */
	public void printTheIndex()
	{
		for(Stock s : index)//exemplifies how to iterate an array of objects successfully
		{
			System.out.println("stock symbol: " + s.getSymbol() + ", price: "+ s.getPrice());
		}
	}
	
	//private Stock l = new Stock();
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
		initializeAllStocksInSimulation(); //creates the stock market in one fell swoop
		printTheIndex();
	}

	private void initializeAllStocksInSimulation() 
	{
		
		for(int i = 0 ; i <= 6000; i++)
		{
			Stock s = new Stock();//creates one stock
			index.add(s); //6,000 x
		}
	}

}

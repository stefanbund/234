import java.util.Random;

/**
 * A STOCK REPRESENTS ONE SECURITY ON AN STOCK EXCHANGE, IN OUR SIMULATION
 * @author stefanbund
 *
 */
public class Stock //hopefully, we'll have thousand of stocks
{	
	public String symbol; 		//a public variable is visible outside the class, by other classes
	public double price;  		//55.89
	public int ipoQty;		 //initial number of stock on sale
	public String industry; 
	
							//constructor, first thing that happens, when an instance of this object
	public Stock()       	// POPULATE THIS STOCK WITH SOME INFORMAITON: 
	{
		industry = "defense contracting"; //string, or word, which is a string of characters
		
		// TWO DIFFERENT WAYS OF INITIALIZING YOUR MEMBER VARIABLES
		setStockPrice();
		ipoQty = setIpoQty(); //this is the rv value from setIpoQty()
		
		symbol = "GEL"; //for our sim, we'll assign randomly determined symbol names
		
	}
	
	public void printPriceAndIPOQTY()
	{
		System.out.println("price is now " + price);
		System.out.println();
		System.out.println("IPO Quantity is now " + ipoQty);
	}
	
	private int setIpoQty()
	{
		int rv = 0;
		Random r = new Random();
		rv = r.nextInt(15000000); //ipo is a large number of stocks, initially sold by a bank
		//System.out.println("my ipo quantity is set to " + rv);
		if(rv < 0)
		{
			rv = rv * -1;
		}
		
		return rv; 
	}
	
	
	
	private void setStockPrice() //void returns nothing
	{
		Random p = new Random();
		price = p.nextDouble() * 100; 
		//System.out.println("stock price is " + price);//proof of working randoms
	}

}

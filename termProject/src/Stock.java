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
		System.out.println("I just called the constructor....");
		industry = "defense contracting"; //string, or word, which is a string of characters
		
		/*
		 * EXERCISE FOR TODAY: 
		 * 1. DEFINE THE PRICE RANDOMLY
		 * 2. DEFINE THE IPO QTY RANDOMLY
		 * 
		 * 
		 * 
		 */
		
		
		price = 55.67; //price is a double, is a number, with decimals
		ipoQty = 50000001; //an integer, no decimals!
		symbol = "GEL"; //for our sim, we'll assign randomly determined symbol names
	}

}

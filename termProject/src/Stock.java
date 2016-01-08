/**
 * A STOCK REPRESENTS ONE SECURITY ON AN STOCK EXCHANGE, IN OUR SIMULATION
 * @author stefanbund
 *
 */
public class Stock 
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
		price = 55.67; //price is a double, is a number, with decimals
		ipoQty = 50000001; //an integer, no decimals!
		symbol = "GEL"; //for our sim, we'll assign randomly determined symbol names
	}

}

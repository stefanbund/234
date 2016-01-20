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
	private String industry; 	//defined randomly
	
							//constructor, first thing that happens, when an instance of this object
	public Stock()       	// POPULATE THIS STOCK WITH SOME INFORMAITON: 
	{
		//industry = ; //string, or word, which is a string of characters
		
		// TWO DIFFERENT WAYS OF INITIALIZING YOUR MEMBER VARIABLES
		setStockPrice();
		setIndustry();
	
		ipoQty = setIpoQty(); //this is the rv value from setIpoQty()
		
		symbol = setSymbol();  //for our sim, we'll assign randomly determined symbol names
		
	}
	
private String setSymbol() 
{		
	String returnValue = ""; //what we'll return to the calling function

	for(int i= 0; i < 4; i++)	//start at 0, move up to 4, one increment at a time
	{
		String  l = getRandomLetter();
		returnValue = returnValue + l;
		//System.out.println("SS: symbol is now " + returnValue);
	}
	
	return returnValue;
}

private String getRandomLetter() 
{
	String result = "";
	Random r = new Random();
	int characterResult = r.nextInt() * 1000000;
	//System.out.println("random int was " + characterResult);
	
	if(characterResult <= 10000000)
	{
		result = "A";	//return a particular character
	}else
	{
		result = "B"; //26 characters possible A - Z, 26 different return values possible
	}
	//System.out.println("GRL: my result is " + result); //clean
	return result;
}

//	public Stock(String industry, double price, int ipoQty)
//	{
//		
//	}
	
	public Stock(String industry2, double price2, int ipoQty2) 
	{
		setStockPrice();
		setIndustry();
	
		ipoQty = setIpoQty(); //this is the rv value from setIpoQty()
		
		symbol = "GEL"; //for our sim, we'll assign randomly determined symbol names	
	}

	public void printPriceAndIPOQTY()
	{
		System.out.println("price is now " + price);
		System.out.println("IPO Quantity is now " + ipoQty);
		System.out.println("industry is " + industry);
	}
	
	private int setIpoQty()
	{
		int rv = 0;
		Random r = new Random();
		rv = r.nextInt(15000000); //ipo is a large number of stocks, initially sold by a bank
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
	}

	/**
	 * @return the industry
	 */
	public String getIndustry() 
	{
		return industry;
	}

	/**
	 * @param industry the industry to set
	 */
	public void setIndustry() 
	{
		Random r = new Random();
		int l = r.nextInt(100); //use the value of l to determine which industry the stock blgs 2

		if(l < 10)		//a good project will represent 20 different industries
		{
			this.industry = "fishing";
		}
		else if( l < 20 && l > 10)
		{
			this.industry = "telecom";
		}
		else
		{
			this.industry = "education";
		}
		
		//this.industry = industry;
	}

}

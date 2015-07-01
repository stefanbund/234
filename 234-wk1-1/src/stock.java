/**
 * the stock class represents the capacity of one market-listed security
 * 
 * @author stefanbund
 *
 */
import java.util.Random;


public class stock {
	
	private double price;
	private String symbol; //a few letters, within the limit of the exchange (4-5)
	
	/**
	 * constructor: the first method thrown by the object when it's created
	 */
	public stock()
	{
		this.price = getInitialPrice();//should initialize a stock's price
		this.symbol = getIntialSymbol();
//		
		System.out.println("price of initial equity is " + this.price 
				+ " and the symbol is " + this.symbol);//prove correct init
		
	}
	/**
	 * this function declares the symbol's name, per random numbers
	 * 
	 * @return
	 */
	private String getIntialSymbol() 
	{
		String randomSymbol = "";
		randomSymbol = "DDDA";
//		Random r1 = new Random();
//		Random r2 = new Random();//create a random # generator
//		Random r3 = new Random();
//		Random r4 = new Random();
		
//		double ra1 = r1.nextDouble(); //generate a number between 0 and 1 
//		double ra2 = r2.nextDouble();
//		double ra3 = r3.nextDouble();
//		double ra4 = r4.nextDouble();
//
//		//for each variable, get a random number, then based on that number, generate a new letter
//		String symbolLetter1 = generateLetter(ra1);
//		String symbolLetter2 = generateLetter(ra2);
//		String symbolLetter3 = generateLetter(ra3);
//		String symbolLetter4 = generateLetter(ra4);

		
//		String symbol = symbolLetter1 + symbolLetter2 + symbolLetter3 + symbolLetter4 ;
//		System.out.println("symbol " +"x is "+ symbol);
		return randomSymbol; //please randomly assign a symbol here... per your wk 2 code
	}
/**
 * has the purpose of initializing a price to a stock, to simulate an active market
 * with many equities on sale
 * 
 * @return a randomly determined stock price
 */
	private static double getInitialPrice() 
	{
		double priceToReturn = 8.0;
		
		//increase the price to a randomly set number
		Random p = new Random();
		
		priceToReturn = p.nextDouble() * 100; //price + some cents
		
		return priceToReturn;
	}
	
	public double getPrice()
	{
		return this.price; 
	}
	
	public void setPrice(double p)
	{
		this.price = p;
	}
	
	public static String generateLetter(double n)
	{
		
		String l = "";//empty, or null, to begin
		if(n <= 0.025 && n <= .05)
		{
			l = "A";
		}
		else if(n <= .05 && n <=.075)
		{
			l = "B";
		}
		else if(n <= .1 && n <=.125)
		{
			l = "C";
		}
		else if(n <=.125 && n<=.15)
		{
			l = "D";
		}
		System.out.println("value of n, random is " + n + ", hence my letter is " + l);
		return l;
	}

}

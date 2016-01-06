
public class brainCenter {

	public static void main(String[] args) 
	{ 										//main compilation unit, runs first
		
		//System.out.println("hi, this just happened.");
		
		Stock l = new Stock();
		
		// POPULATE THIS STOCK WITH SOME INFORMAITON: 
		
		l.industry = "locomotive"; //string, or word, which is a string of characters
		
		l.price = 55.0; //price is a double, is a number, with decimals
		
		l.ipoQty = 50000000; //an integer, no decimals!
		
		l.symbol = "GEL"; //for our sim, we'll assign randomly determined symbol names
		
		System.out.println("stock nameed " + l.symbol + " is priced at $" + l.price);

	}
	
	

}

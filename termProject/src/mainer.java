//import java.util.Random;

public class mainer 
{
	public static void main(String[] args) 
	{ 											//main compilation unit, runs first
		Market market = new Market(6000);
												//what shape should the market take? 
												// what data structure should house all my stocks? 
		market.printMarket(); //market exists
		
		Buyer b = new Buyer(); //print numTransactions, apt, budget
	
		b.buildRandomPortfolio(market);
		
				
	}
}	



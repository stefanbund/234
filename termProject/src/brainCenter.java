//import java.util.Random;

public class brainCenter 
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
//		System.out.println("random number is " + r.nextInt(12000000));
//		
//		int limit = 5000000; 		//initializing,defining variables
//		int randomOutput = r.nextInt();
//		
//		if(randomOutput > limit) //conditional testing, if-else, flow control
//		{
//			System.out.println("random exceeds" + limit);
//		}
//		else
//		{
//			System.out.println("random, " + randomOutput +"is under the limit, " + limit);
//		}

		/*
		Stock st = new Stock(); 				
		String ind = "telecom"; 				//test this below: 
		
			if(st.industry.equalsIgnoreCase(ind))
			{
				System.out.println("the industry of this stock is telecom");
			}
			else
			{
				System.out.println("the industry of this stock is not telecom,");
				System.out.println("the industry of this stock is: " + st.industry);
			}
			
			int limit = 1000; 				//INTEGER TESTING
			if(st.ipoQty < limit)
			{
				System.out.println("IPO QTY EXCEEDS LIMIT OF " + limit);
			}
			else if(st.ipoQty <= limit)
			{
				System.out.println("IPO QTY FALLS WITHIN THE LIMIT " + limit);
			}
			else if(st.ipoQty <= 50000000)
			{
				System.out.println("YOUR IPO QTY IS == 50000000");
			}
			else
			{
				System.out.println("SORRY, NOTHING MATCHED......");
			}*/


import java.util.Random;

public class brainCenter 
{
	public static void main(String[] args) 
	{ 											//main compilation unit, runs first

		Stock l = new Stock();
		System.out.println("industry of stock is " + l.getIndustry());
		System.out.println("price of stock : "+ l.price);
		System.out.println("ipo quantity : " + l.ipoQty);
		
		Stock j = new Stock("fishing", 77.99, 65383);
		System.out.println("industry of stock is " + j.getIndustry());
		System.out.println("price of stock : "+ j.price);
		System.out.println("ipo quantity : " + j.ipoQty);
		
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


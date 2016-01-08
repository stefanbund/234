
public class brainCenter 
{

	public static void main(String[] args) 
	{ 											//main compilation unit, runs first
		System.out.println("MAIN BEGINNING NOW......");
		
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
			}
	}
}

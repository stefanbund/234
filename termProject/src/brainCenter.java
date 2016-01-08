
public class brainCenter {

	public static void main(String[] args) 
	{ 										//main compilation unit, runs first
		
		System.out.println("MAIN BEGINNING NOW......");
		
		Stock st = new Stock(); //your innovation
		
		
		String ind = "telecom"; //test this below: 
		
		if(st.industry.equalsIgnoreCase(ind))
		{
			System.out.println("the industry of this stock is telecom");

		}
		else
		{
			System.out.println("the industry of this stock is not telecom,");
			System.out.println("the industry of this stock is: " + st.industry);


		}
		

	}
	
	

}

import java.util.ArrayList;
import java.util.Random;

public class mainX {

	public static void main(String[] args) 
	{
		ArrayList<stock> market = new ArrayList<stock>();
		
		for(int x = 1; x <= 9000; x++) 
		{
			stock s = new stock();
			
			market.add(s);//should have a market of 9,000 stocks...
			double p =   s.getPrice();
			System.out.println("price of that is " + p);
		}
		
		System.out.println("current size of market is " + market.size() + " stocks");
	}

	

}

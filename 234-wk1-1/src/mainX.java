import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("name a stock to study and maybe buy: ");
		String stockToInvestigate = sc.next();
		
		for(stock thisStock : market) //enhanced for-loop; iterate, traverse the entire breadth of the market
		{
			if(thisStock.getSymbol().equalsIgnoreCase(stockToInvestigate))
			{
				System.out.println("confirmed I just located stock by symbol: " + thisStock.getSymbol());
				
				System.out.println("the price for symbol " + thisStock.getSymbol() + " is " + thisStock.getPrice());
				System.out.println("Would you like to study or buy that stock?(study / buy) ");
				String tuiChoice = sc.next();
				
				if(tuiChoice.equalsIgnoreCase("study"))
				{
					System.out.println("current price is " + thisStock.getPrice());
					System.out.println("with shares sold, historically: "  + thisStock.numberOfStock);
					System.out.println("with oustanding shares available at: " +thisStock.numberOfStockAvailable);
				}else
				{
					System.out.println("how many shares to buy: ");
					int toBuy = sc.nextInt();
					if(toBuy < thisStock.numberOfStockAvailable)
					{
						thisStock.numberOfStockAvailable -= toBuy;
						System.out.println("just executed your buy, for ");
						System.out.println(" " + toBuy + " shares at $" + thisStock.getPrice());
					}
				}
			}
		}
		
		
	}

	

}

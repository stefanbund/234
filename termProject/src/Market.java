
public class Market {

	public Market(int sizeOfMarket) 
	{
		for(int i = 0; i <= sizeOfMarket; i++)
		{
			Stock l = new Stock();
			System.out.println("industry of stock is " + l.getIndustry());
			System.out.println("price of stock : "+ l.price);
			System.out.println("ipo quantity : " + l.ipoQty);
		}
		
	}

}

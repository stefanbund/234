import java.util.ArrayList;


public class Market {
	
	public ArrayList<Stock> m = new ArrayList<Stock>(); //arrays store large volumes of data
														// in continguous memory blocks

	public Market(int sizeOfMarket) 		//ie, 6,000
	{
		for(int i = 0; i <= sizeOfMarket; i++)	//regular for loop, emphasis on the index, i
		{
			Stock l = new Stock();
			
			m.add(l);
		}
		
	}
	
	public void printMarket()
	{
		for(Stock st : m) //enhanced for loop, emphasizes array traversal
		{
			System.out.println("stock symbol: " + st.symbol + " @ price, $" + st.price);
		}
	}

}

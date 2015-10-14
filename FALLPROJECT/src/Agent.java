import java.util.Random;


public class Agent {
	public String agentID = "";
	Porfolio p = new Portfolio();//what do we need for the portfolio?
	/**
	 * first step, create an agent id for the agent
	 */
	public Agent()
	{
		establishAgentID(); //randomly create a identifier, to uniquely distinguish the agent
	}

	private void establishAgentID() 
	{
		//make the random identifier 6 characters long	
		for(int i = 0; i<=6; i++)
		{
			//1. make a random #
			Random r = new Random();
			int l = r.nextInt() / 100000000;
			System.out.println(l);
			
			if(l <= 250 && l > 226)
			{
				agentID = agentID + "A";
			}
			else if( l < 225 && l > 200)
			{
				agentID = agentID + "B";//gradually, incrementally create a random string
			}
			//do 26 more variations until you can generate all letters A-Z
			
			//2. based upon the random number in (1), establish strings
		}
	}
	
	public void lookupSymbol(String symbol)
	{
		
	}
	
	public void putInABuyOrder(Stock stockToBuy)
	{
		
		//BuyOrder b = new BuyOrder();
	}
	
	public void sellAStockInMyPortfolio(Stock s)
	{
		
	}
	
	public void addAStocktoMyPortfolio(Stock s)
	{
		
	}
}

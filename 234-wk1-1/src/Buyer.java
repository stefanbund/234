import java.util.ArrayList;
import java.util.Random;


public class Buyer {

	
	int portfolioDepth; // first, determine how many stocks the buyer buys
	double portfolioValue; //how much $ 
	
	
	private double budget; 
	private ArrayList<stock> portfolio;
	
	public Buyer() {
		//initialize budget and portfolio
		
	}
	
	private double createRandomBudget()
	{
		Random r = new Random();
		
		return this.budget = r.nextDouble();
	}
	
	private ArrayList<stock> generatePortfolio()
	{
		//get the number of permissible stocks to buy (portfolioDepth)
		
		//divide the portfolio equally, to start:
		//determine how much we can spend per symbol
		
		//for each number in the portfolioDepth
		//generate a random double, .8768768, multiply by 1000
		//so long as this is < the size of the market (market.size)
		// grab the stock at market.indexAt(number)
		Random r = new Random();
		double factor = r.nextDouble() * 1000.0; //9879.8789
		if(factor > 9000.0)
		{
			double difference = factor - 9000.0;
			factor = factor - difference; //drop it to some number
		}
		//choose the stock located at portfolio.itemAt(factor)
		stock s = new stock();
		this.portfolio.add(s);
		//this.portfolio.get(factor);
		
		return portfolio;
	}

}

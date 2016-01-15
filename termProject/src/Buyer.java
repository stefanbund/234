import java.util.Random;


public class Buyer {
	
	public double budget; //in currency
	public int name; //identifier
	Portfolio p; 

	public Buyer() 						//resp setup
	{
		establishBudget();
		establishBuyerName();
		proveEstablishment();
		buildRandomPortfolio();
	}

	private void buildRandomPortfolio() 
	{
		
	}

	private void proveEstablishment() 
	{
		System.out.println("buyer " + name + " has a budget of $" + budget);
	}

	private void establishBuyerName() 
	{
		Random r = new Random();
		name = r.nextInt(1000000); //long and semi-unique
	}

	private void establishBudget() 
	{
		Random r = new Random();
		budget = r.nextInt() / 100;
	}
	
	

}

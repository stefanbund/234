import java.util.Random;
/**
 * @author stefanbund
 *
 */
public class Stock {
	private double lastSalePrice; 
	private double price; 
	private String symbol; //string is a word, or collectoin of letters/characters
	private int ipoQty; //the # of stocks initially sold by their first owner/bank
	private double lastSaleVolume; 
	private String industry; //the industry the stock is in
	
	/**
	 * set up the symbol, price ipoQty
	 */
	public Stock() 
	{	
		String s = setRandomStockName(); //@TODO define what the stock needs to know when it's created
		setSymbol(s);
		
		double x = setUpRandomPrice();
		setPrice(x);
		
		int l = setRandomIPOQTY(); //get an integer back
		setIpoQty(l); //use that result to set the IPO QTY
	}

	/**
	 * establish a random number, which will represent the intial stock float
	 * @return
	 */
	private int setRandomIPOQTY() 
	{
		Random r = new Random();
		int l = r.nextInt() / 100;
		if (l < 0)  //correct for negative values
		{
			l = l * -1; //turn it positive
		}
		
		return l;
	}

	/**
	 * first, generate a random number, then assign to the price variable
	 * this will be the initial price for the stock
	 * @return
	 */
	private double setUpRandomPrice() 
	{
		Random r = new Random();
		double price = r.nextDouble() * 10.0; //shoudl resemble a retail stock price
		return price;
	}


	private String setRandomStockName() {
		String s = "MEME";//not really random
		
		return s;
	}


	/**
	 * @return the lastSalePrice
	 */
	public double getLastSalePrice() {
		return lastSalePrice;
	}


	/**
	 * @param lastSalePrice the lastSalePrice to set
	 */
	public void setLastSalePrice(double lastSalePrice) {
		this.lastSalePrice = lastSalePrice;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}


	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}


	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	/**
	 * @return the ipoQty
	 */
	public int getIpoQty() {
		return ipoQty;
	}


	/**
	 * @param ipoQty the ipoQty to set
	 */
	public void setIpoQty(int ipoQty) {
		this.ipoQty = ipoQty;
	}


	/**
	 * @return the lastSaleVolume
	 */
	public double getLastSaleVolume() {
		return lastSaleVolume;
	}


	/**
	 * @param lastSaleVolume the lastSaleVolume to set
	 */
	public void setLastSaleVolume(double lastSaleVolume) {
		this.lastSaleVolume = lastSaleVolume;
	}

	/**
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}

	/**
	 * @param industry the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}

}
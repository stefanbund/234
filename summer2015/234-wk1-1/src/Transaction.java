/**
 * 
 * captures the details of a stock purchase
 * @author stefanbund
 *
 */
public class Transaction {

	private double price;
	private int volume; 
	
	/**
	 * constructor
	 * @param t_volume 
	 * @param t_price 
	 * 
	 */
	public Transaction(double t_price, int t_volume) 
	{
		this.price = t_price; 
		this.volume = t_volume; 
		System.out.println("transaction just made with vars: " + this.price + " and " + this.volume);
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
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}

}

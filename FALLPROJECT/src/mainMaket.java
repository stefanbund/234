import java.util.ArrayList;

/**
 * 
 */

/**
 * @author stefanbund
 *
 */
public class mainMaket {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Market m = new Market();
//		Agent a = new Agent();
//		Transaction t = new Transaction();
//		Portfolio p = new Portfolio();
		
		
		//put the comments at the end of the line, not above
        ArrayList<Stock> l =  m.getIndex();
		
        for (Stock s : l)
        {
        	System.out.println("stock name is " +s.getSymbol());
        	System.out.println("stock price is " + s.getPrice());
        	System.out.println();
        }
	}

}

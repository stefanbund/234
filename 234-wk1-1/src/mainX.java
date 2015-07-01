import java.util.Random;

public class mainX {

	public static void main(String[] args) 
	{
		for(int x = 0; x <= 9000; x++) 
		{
			stock s = new stock();
			
			System.out.println("get price of stock " + x +" from main:  " +  s.getPrice() );
			
			s.setPrice(45.00);
			System.out.println("now the price of stock is " + s.getPrice());
		}
	}

	

}

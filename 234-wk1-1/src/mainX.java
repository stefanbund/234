import java.util.Random;

public class mainX {

	public static void main(String[] args)  //main is a method or function
	{
		Random r1 = new Random();
		Random r2 = new Random();//create a random # generator
		Random r3 = new Random();
		Random r4 = new Random();

		for(int x = 0; x <= 6000; x++) //repeats
		{
			//for each stock, determine its ticker symbol, NASDAC style, four letters	
			double ra1 = r1.nextDouble(); //generate a number between 0 and 1 
			double ra2 = r2.nextDouble();
			double ra3 = r3.nextDouble();
			double ra4 = r4.nextDouble();
//			System.out.println("tell me the value of the random 1... "+ ra1);
//			System.out.println("tell me the value of the random 2... "+ ra2);
//			System.out.println("tell me the value of the random 3... "+ ra3);
//			System.out.println("tell me the value of the random 4... "+ ra4);

			//for each variable, get a random number, then based on that number, generate a new letter
			String symbolLetter1 = generateLetter(ra1);
			String symbolLetter2 = generateLetter(ra2);
			String symbolLetter3 = generateLetter(ra3);
			String symbolLetter4 = generateLetter(ra4);

			
			String symbol = symbolLetter1 + symbolLetter2 + symbolLetter3 + symbolLetter4 ;
			System.out.println("symbol is live: " + symbol);
		}//for loop bracket
	}//main bracket

/**
 * @param n, a randomly generated number
 * @return l, a string representing a letter
 */
	public static String generateLetter(double n)
	{
		String l = "";//empty, or null, to begin
		if(n > 0 && n <= .1)
		{
			l = "A";
		}
		else if(n >= .1 && n <=.2)
		{
			l = "B";
		}
		else if(n >= .2 && n <=.3)
		{
			l = "C";
		}

		return l;
	}

}

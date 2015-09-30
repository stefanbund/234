import java.util.Random;


public class mainClass {

	public static void main(String[] args) {
		
		//how many times do we exceed one billion? 
		int trueCounter = 0; //count the true values, times that the # is under 1 bil
		
		int falseCounter = 0;
		
		for(int i = 0 ; i < 1000000; i++)
		{
			int l = createSituationOne(); 		//initialize this variable, based on this function
			
			System.out.println("l is now " + l );			//verify assignment
			
			boolean x = evaluatel(l);
			System.out.println("x is now ..." + x);
			if(x == true) //less than 1 bil
			{
				trueCounter++; //trueCounter = trueCounter + 1;
			}
			if (x != true)
			{
				falseCounter++;//
			}
		}
		System.out.println("we got " + trueCounter + " trues and " + falseCounter + " falses.");

	}
	
	private static boolean evaluatel(int l) {
		
		boolean returnValue = false; 
		
		if(l < 1000000000) 					//condition one
		{
			System.out.println("l is less than one billion");
			returnValue = true; 
		}
		else 								//condition three, if nothing else is true
		{
			System.out.println("l is greater than one billion");
			returnValue = false; 
		}
		
		return returnValue;
	}

	//create a situation that delivers an outcome, based in a number
	public static int createSituationOne()
	{
		int x = 0;
		
		Random r = new Random();//makes a new random number
		x = r.nextInt();
		System.out.println("random is set to " + x); //log the value to the console/screen
		
		return x; 
	}

}
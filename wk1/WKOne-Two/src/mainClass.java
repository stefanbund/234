


public class mainClass {
/**
 * 
 * PURPOSE: MEASURE THE RANDOMNESS OF THE RANDOM NUMBER GENERATOR
 * WHAT RESULTS DOES IT PROVIDE?
 * @param args
 */
	public static void main(String[] args) 
	{	
		//construct a method to study the results of these situations, how
		//many true/false ratios we get after 2,000 repetitions
		
		for(int i = 0; i <= 2000; i++)
		{
			Situation s = new Situation();
			s.runSimulation();
			
			int fc = s.falseCounter ;//where do we get this result?
			
			int tc = s.trueCounter;//where do we get this result?
			
			System.out.println("we got " + tc + " trues and " + fc + " falses.");
		}
	}
	
	
	
	
	
	
		//how many times do we exceed one billion? 
//		int trueCounter = 0; //count the true values, times that the # is under 1 bil
//		
//		int falseCounter = 0;
//	for(int y = 0; y < 4; y++)
//	{
//		for(int i = 0 ; i < 1000000; i++)
//		{
//			int l = createSituationOne(); 		//initialize this variable, based on this function
//			
//			System.out.println("l is now " + l );			//verify assignment
//			
//			boolean x = evaluatel(l);
//			System.out.println("x is now ..." + x);
//			if(x == true) //less than 1 bil
//			{
//				trueCounter++; //trueCounter = trueCounter + 1;
//			}
//			if (x != true)
//			{
//				falseCounter++;//
//			}
//		}
	//}

	//}
	
//	private static boolean evaluatel(int l) {
//		
//		boolean returnValue = false; 
//		
//		if(l < 1000000000) 					//condition one
//		{
//			System.out.println("l is less than one billion");
//			returnValue = true; 
//		}
//		else 								//condition three, if nothing else is true
//		{
//			System.out.println("l is greater than one billion");
//			returnValue = false; 
//		}
//		
//		return returnValue;
//	}
//
//	//create a situation that delivers an outcome, based in a number
//	public static int createSituationOne()
//	{
//		int x = 0;
//		
//		Random r = new Random();//makes a new random number
//		x = r.nextInt();
//		System.out.println("random is set to " + x); //log the value to the console/screen
//		return x; 
//	}

}

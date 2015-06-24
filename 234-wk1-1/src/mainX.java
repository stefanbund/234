
public class mainX {

	public static void main(String[] args)  //main is a method or function
	{
		int numberOfReps = 0; //declare this variable then initialize it, with a 0 number 
		
		System.out.println("here's the part before the for loop...");
		
		for(int x = 0; x <= 1500; x++) //increment, states by how much my number increases
		{
			System.out.println("currently I am in the " + x + "th repetition.");
			numberOfReps = x; 
			x = x * 2; //would me doing this cause the loop to stop
			
		}
		
		System.out.println("the number of times this algorithm repeated was " + numberOfReps);

	}

}

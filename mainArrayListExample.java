package arrayListDemonstration;

import java.util.ArrayList;

public class mainArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>(); //begin with  anew array list
//
//		for(int i = 0; i <= 6000; i++)
//		{
//			String stock = "UVDF";
//			al.add(stock);
//		}
		System.out.println("the initial size of your array is " + al.size() + " items");
		String stock = "UVDF"; //initial demo symbol name
		String stock1 = "SSDD"; //initial demo symbol name
		String stock2 = "AADD"; //initial demo symbol name
		String stock3 = "FFGG"; //initial demo symbol name
		
		int x = 1; 

		al.add(stock);
		al.add(stock1);
		al.add(stock2);
		al.add(stock3);		
		//al.add(x);

		//System.out.println("now we've added the string: " + stock);//test string's value
		System.out.println("the new size of your array is " + al.size() + " items");
		
		System.out.println("the contents of al, array list are: " + al);//demonstrate the new contents
		
		//al.remove("UVDF");
		al.remove(2000);//remove the 3rd item....
		//System.out.println("the contents of al, after removal are: " + al);//demonstrate the new contents
		System.out.println("the new size of your array is " + al.size() + " items");

	}

}

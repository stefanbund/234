package arrayListDemonstration;

import java.util.ArrayList;
import java.util.Scanner;

public class mainArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>(); //begin with  anew array list

		System.out.println("the initial size of your array is " + al.size() + " items");
		String stock = "UVDF"; //initial demo symbol name
		String stock1 = "SSDD"; //initial demo symbol name
		al.add(stock);
		al.add(stock1);
		System.out.println("the contents of al, array list are: " + al);//demonstrate the new contents

		Scanner sc = new Scanner(System.in); //the scanner reads text you type while it's running
		
		System.out.println("please enter the name of a stock to get :");
		String response = sc.nextLine(); //the user should be able to type in a symbol
		
		for(String s : al)  //studies each symbol inside the market
		{	
			if(s.equalsIgnoreCase(response)) //if the stock in the market matches the incoming symbol, 
			{
				System.out.println("the stock is present"); //say this
			}
		}

		

		//System.out.println("now we've added the string: " + stock);//test string's value
		System.out.println("the new size of your array is " + al.size() + " items");
		
		System.out.println("the contents of al, array list are: " + al);//demonstrate the new contents
		
		//al.remove("UVDF");
		//al.remove(2000);//remove the 3rd item....
		//System.out.println("the contents of al, after removal are: " + al);//demonstrate the new contents
		System.out.println("the new size of your array is " + al.size() + " items");

	}

}

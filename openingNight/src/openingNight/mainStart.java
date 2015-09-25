package openingNight;

public class mainStart {
    
    public static void main(String[] args)
    {
        System.out.println("now you're seeing main");
        //how can I make tellMeThis function show up?
        
        boolean w = tellMeThis(); //is w being assigned something?
        
        System.out.println("w is now "  + w);
        
        if(!w)
        {
        	System.out.println("w is false");
        }
        else
        {
        	System.out.println("w is true");
        }
        
    }
    
    public static boolean tellMeThis()
    {
    	boolean x = false; // = is an assignment operator
        System.out.println("now you're seeing something outside main");
        return x;
    }
    
}

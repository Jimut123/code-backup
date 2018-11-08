public class Test {
    // Called function
    void print_message( )
    {
        System.out.println("This is the first called print_message method/function.");
    }
    public static void main(String args[])  {

        		// Here fr is the object of class first
    		Test Msg = new Test();   
    		Msg.print_message();   // Method is called here
        }
	}
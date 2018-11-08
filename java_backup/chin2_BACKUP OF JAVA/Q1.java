import java.io.* ;
	public class Q1
	{
		public void output( ) throws IOException
		{
			double n ;
			InputStreamReader isr = new InputStreamReader(System.in) ;
			BufferedReader stdin = new BufferedReader(isr) ;
			System.out.println("Enter the number :") ;
			n = Double.parseDouble(stdin.readLine()) ;
			System.out.println("Natural logarithm of the number :"+Math.log(n)) ;
			System.out.println("Absolute value of the number :"+Math.abs(n)) ;
			System.out.println("Square root of the number:"+Math.sqrt(n)) ;
			System.out.println("Random number :"+Math.random()) ;
		}
	}

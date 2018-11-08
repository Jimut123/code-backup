
public class primefactors
{
	public static boolean isprime(int n)
	{
	 for(int i=2;i<n;i++)
	 {
	  if(n%i==0)
	  return false;
	 }
	 return true;
	}
	
	public static void printprime(int n)
	{
	 int n1=n;int c=2;
	 while(n1>1)
	 {
	  if((isprime(c)==true) && (n1%c==0))
	  {
	     System.out.println();
	     while(n1%c==0)
	     {
	      System.out.print(c);
	      n1=n1/c;
	     }
	   }
	  c=c+1;
	  }
	}
	
}

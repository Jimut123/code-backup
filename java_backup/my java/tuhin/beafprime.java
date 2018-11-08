
public class beafprime
{
	public static boolean isprime(int a)
	{
	 for(int i=2;i<a;i++)
	 {
	  if(a%i==0)
	  return false;
	  }
	  return true;
	}
	  
    public static void main(int n)
    {
     if (isprime(n)==true)
     {
      int l=n-1;
      int g=n+1;
      while(l>0 && isprime(l)!= true)
      {
      l=l-1;
      }
      while(g>0 && isprime(g)!= true)
      {
      g=g+1;
      }
      
      System.out.println(l);
      System.out.println(g);
      }
      }
      }
    
      

public class pattern
{
	
	public static void main(String s)
	{
	s=s+ "";
	  int l=s.length();
	  
	  
	  for(int i=0;i<l;i++)
	  {
	  if(s.charAt(i)==' ')
	  {
	  System.out.println();
	  for(int j=0;j<=i;j++)
	  System.out.print(s.charAt(j));
	  }
	  }
	
	  }

	
    
}

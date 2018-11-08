
public class aabbc
{
	public static void main(String s)
	{
	 int c=65;
	 while(c<=90)
	 {
	  for(int i=0;i<s.length();i++)
	  {
	   if(s.charAt(i)==c|| s.charAt(i)==(c+32) )
	   System.out.print(s.charAt(i));
	   }
	   c++;
	   }
	   }
}

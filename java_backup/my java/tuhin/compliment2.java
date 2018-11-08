
public class compliment2
{
	
	public static void  compliment2(String s)
	{
		int l=s.length();
		int flag=0;
		 System.out.println(s);
		String s1="";
		for(int i=l-1;i>=0;i--)
		{
		 if (flag==1)
		 {
		  if(s.charAt(i)=='1')
		  s1="0"+s1;
		  else
		  s1="1"+s1;
		  }
		  if (flag==0)
		 { 
		  if(s.charAt(i)=='1')
		  flag=1;
		  s1=s.charAt(i)+s1;
		 }
		}
		 System.out.println(s1);
		 
		 }}
		  
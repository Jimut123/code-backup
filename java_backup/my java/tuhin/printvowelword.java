

public class printvowelword
{
	
	public static void printvowel(String s)
	{
	 s=s+" ";
	 double n;
	 n=0;
	 int l=s.length();
	 String nstr=" ";String str=" ";double c;
	 c=0;
	 for(int i=0;i<l;i++)
	 {
	  if (s.charAt(i)!=' ')
	  str=str+s.charAt(i);
	 else if (s.charAt(i)==' ')
	  {n=countvowelper(str);
	  if(n>c)
	  {
	   nstr=str;
	   c=n;
	   }
	   str="";
	   }
	   }
	   System.out.println(nstr);
	}

	
	public static double countvowelper(String  str)
	{
	  double v;
	  v=0;
	  for(int j=0;j<str.length();j++)
	  {
	  if(str.charAt(j)=='a' ||str.charAt(j)=='e' ||str.charAt(j)=='i' ||str.charAt(j)=='o' ||str.charAt(j)=='u')
	  v=v+1;
	  if(str.charAt(j)=='A' ||str.charAt(j)=='E' ||str.charAt(j)=='I' ||str.charAt(j)=='O' ||str.charAt(j)=='U')
	  v=v+1;
	  
	   }
	   double c=(v/str.length())*100;
	   return c;
	   }
		
		
	
}

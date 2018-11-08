
public class truth1
{
	public static  void printtruthtable(int n)
	{
	double x=Math.pow(2,n);
	int l=(int)x;
	String s=""; 
	for(int i=0;i<=l;i++)
	{
	 while (i>0)
     {
      if(i%2==0)
      s="0"+s;
      else if(i%2==1)
      s="1"+s;
      i=i/2;
      }
      int l1=s.length();
      if(l1<2)
      {
      for(int j=0;j<=(l1-n);i++)
      s="0"+s;
       System.out.println(s);
       s="";
	 
	 }
	 }}}
	
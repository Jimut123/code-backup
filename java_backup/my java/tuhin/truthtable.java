
public class truthtable
{
	public static  void printtruthtable(int n)
	{
	double x=Math.pow(2,n);
	int l=(int)x;
	String s=""; 
	for(int i=0;i<l;i++)
	{
	int i1=i;
	 while (i1>0)
     {
      if(i1%2==0)
      s="0"+s;
      else if(i1%2==1)
      s="1"+s;
      i1=i1/2;
      }
      int k=s.length();
      if(k<n)
      {
      for(int j=1;j<=(n-k);j++)
      s="0"+s;
      }
       System.out.println(s);
       s="";
	 
	 
	 }}}
	
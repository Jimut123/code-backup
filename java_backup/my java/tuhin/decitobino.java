

public class decitobino
{
	public static void calc(double n)
    {
     int n1=(int)n;
     int p=n1;
     double d;
     String s="";
     while (n1>0)
     {
      if(n1%2==0)
      s="0"+s;
      else if(n1%2==1)
      s="1"+s;
      n1=n1/2;
      }
      s=s+".";
      n1=p;
      double b=n-(double)n1;
      int c=0;
      while(c<3)
      {
       d=b*2;
       if(d>=1)
       {
       s=s+"1";
       b=d-1;
       }
       else
       {
       s=s+"0";
       b=d;
       }
       c++;
       }
       System.out.println(s);
}}

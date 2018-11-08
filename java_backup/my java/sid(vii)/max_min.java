 
//Accept 5 inticer and print the maxcimum and minimum numder.\\
class max_min
{
  public static void main(int a,int b,int c,int d,int e)
  {
      int max,min;
      max=0;
      if(a>max)
      max=a;
      if(b>max)
      max=b;
      if(c>max)
      max=c;
if(d>max)
      max=d;

if(e>max)
      max=e;
      min=max;
     if(a<min)
      min=a;
      if(b<min)
      min=b;
      if(c<min)
      min=c;
if(d<min)
      min=d;

if(e<min)
      min=e; 
      System.out.println(max);
      System.out.println(min);
    }
}
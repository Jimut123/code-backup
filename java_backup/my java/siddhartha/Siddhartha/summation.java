class summation
{
public static void main(int n)
{
  int a,b,g,s=0,i,j;
  s=0;
  i=n;
  while(i>0)
  {   
      a=i%10;
      s=s+a;
      i=i/10;
    }
      
    System.out.println(s);
    }
}
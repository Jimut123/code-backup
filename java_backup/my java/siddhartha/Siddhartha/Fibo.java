class Fibo
{
  public static void main(int n)
{
  int a=0,b=1,i=0,c=0;
 System.out.println(c);
i=1;
while(i<n)
{
  a=b;
   b=c;
   c=a+b;
   i++;

   System.out.println(c);
}
   }
}

class t13
{
 public static void main(String args[])
 {
  int i,j,c=0;
  for (i=1;i<=10;i++)
  {
   for (j=2;j<i;j++)
   {
    if (i%j==0)
    c=c=1;
   }
    if (c==0)
    System.out.println(i);
    c=0;
  }
 }
}









































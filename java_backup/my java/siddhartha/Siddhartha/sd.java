class sd
{
public static void main(int n)
{
  int i,j,m,k,l;
  m=15 ;
for ( i=1;i<=5;i++)
{
  for(k=1;k<=i;k++)
  {
      for(l=1;l<=i;l++)
System.out.print(" ");
}
for ( j=i;j>=1;j--)       
{        if((j==1)||(j%2!=0))
        System.out.print("*");
        else
        System.out.print("#");
        m=m-2;
    }
        System.out.println();
    }
}}


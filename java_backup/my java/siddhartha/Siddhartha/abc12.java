class abc12
{
public static void main(int n)
{
int a=65,l=69,m=0,i,j,k;
for(i=1;i<=n;i++)
{
 for(j=a;j<=l;j++)
{
 System.out.print((char)j);
}
 for(k=2;k<=m;k++)
  System.out.print(" ");
  if((i==l)||(j==70))
  j=j-2;
  else
  j=j-1;
  while(j>=a)
  {
       System.out.print((char)j);
       j--;
    }
     System.out.println();
     l=l-1;
     m=m+2;
    }
}
}
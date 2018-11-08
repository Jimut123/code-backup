class num
{
public static void main()
{
int l=5,m=0,i,j,k,n=5;
l=n;
for(i=1;i<=n;i++)
{
 for(j=1;j<=l;j++)
{
 System.out.print(j);
}
 for(k=2;k<=m;k++)
 {
     System.out.print(" ");
    }
     if((i==l)||(j==6))
  {
      j=j-2;
    }
      else
  {
      j=j-1;
    }
      while(j>=1)
  {
       System.out.print(j);
       j--;
    }
     System.out.println();
     l=l-1;
     m=m+2;
    }
}
}
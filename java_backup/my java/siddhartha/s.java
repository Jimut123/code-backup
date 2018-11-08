class s
{
public static void main(int n)
{
int i,j,k,d,s=0;
for(i=1;i<=n;i++)
{
  for(j=i;j<=n;j++)
  {
      s=s+j;
      if(s==n)
      {
          for(k=i;k<=j;k++)
          System.out.print(k+" ");
          System.out.println();
          break;
        }
        else if(s>n)
        {
            break;
        }
    }
}
}
}

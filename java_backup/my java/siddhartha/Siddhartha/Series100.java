class Series100
{
public static void main(int n)
{
  int l=n;int i,j,k=0;
  for(i=1;i<=n;i++)
  {
      for(j=1;j<=l;j++)
      System.out.print(j);
      for(int m=1;m<=k;m++)
      System.out.print(" ");
      if(i==1)
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
                l=l-1;
                k=k+2;
                  System.out.print(i);
                  
                  System.out.println();
                }}
            }

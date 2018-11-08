class sdfg
{
public static void main(int n)
{
 int i,j,k,m;
 m=1;
 for(i=n;i>=1;i--)
 {
     for(k=1;k<=m;k++)
     {
         System.out.print(" ");
        }
        for(j=i;j>=1;j--)
        {
            if((j==1)||(j%2==0))
              System.out.print("*"+" "+" "+ " ");
              else
                System.out.print("#"+" "+" "+" ");
            }
              System.out.println();
            m=m+2;
        }
    }
}
import java.io.*;
class number
{
    public static void main(String args[])throws IOException
    {
     InputStreamReader ab = new InputStreamReader(System.in);
     BufferedReader cd = new BufferedReader(ab);
     int i,j,s=0,n,k;
     System.out.println("Enter a number:");
     n = Integer.parseInt(cd.readLine());
     for(i=1;i<n;i++)
     {
         s=0;
         for(j=i;j<n;j++)
         {
             s=s+j;
             if(s==n)
             {
                 for(k=i;k<=j;k++)
                 {
                    System.out.print(k+"+");
                }
                 System.out.println();
                }
            }
        }
    }
}
import java.io.*;
public class first_and_last_column
{
    public static void main()throws IOException
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,n;
System.out.println("Enter The Limit");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
System.out.println("Enter The Matrix Elements");
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
       a[i][j]=Integer.parseInt(br.readLine());
    }}
for(i=0;i<n;i++)
    { 
        
            for(j=0;j<n;j++)
              {
                  if(j==0 || j==(n-1))
                  System.out.print(a[i][j]+",");
                  else
                  System.out.print(" ");
              
            }
            System.out.println("");
        }
      
        
    }
}

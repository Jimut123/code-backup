import java.io.*;
public class first_and_last_row
{
    public static void main()throws IOException
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,n;
System.out.println("Enter The Limit");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        System.out.println("Enter The Matrix Elements");
        a[i][j]=Integer.parseInt(br.readLine());
    }}
for(i=0;i<n;i++)
    { 
        if(i==0 || i==(n-1))
        {
            for(j=0;j<n;j++)
              {System.out.print(a[i][j]+",");
              
            }
        }
       // else if(i==n-1)
        //{
           // for(j=0;j<n;j++)
            //System.out.println(a[i][j]);
        //}
        System.out.println("");
    }
}
}
                   
    


            
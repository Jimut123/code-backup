import java.io.*;
import java.lang.*;
class bustickit
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter The No.of Seats Both");
int n=Integer.parseInt(Input.readLine());
int A[][]=new int[n][n];
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
A[i][j]=0;
}
}
i=1;
while(i<=(n*n))
{
System.out.println("Enter The Seat No. Both Row &Column");
int m=Integer.parseInt(Input.readLine());
int w=Integer.parseInt(Input.readLine());
if(A[m-1][w-1]==0)
{
System.out.println("Booking Is Done");
A[m-1][w-1]=1;
}
else
{
System.out.println("Sorry The Seat is already Booked");
}
i++;
}
}
}



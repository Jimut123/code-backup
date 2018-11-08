import java.io.*;
import java.lang.*;
class multiply
{
public static void main (String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,j,N;

int A[][]=new int[2][5];

for(i=0;i<2;i++)
{
for(j=0;j<5;j++)
{
System.out.println("ENTER THE NUMBER");
A[i][j]=Integer.parseInt(Input.readLine());
}
}
int t=1;
for(i=0;i<2;i++)
{
for(j=0;j<5;j++)
{
t=t*A[i][j];
}
}
System.out.println("THE PRODUCT VALUE"+t);
}
}
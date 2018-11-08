import java.io.*;
class money
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int ar[]={1000,500,100,50,20,10,5,2,1};
int n;
int i,k;
System.out.println("Enter the amount:");
n=Integer.parseInt(input.readLine());
for(i=0;i<9;i++)
{
k=n%ar[i];
int k1=n/ar[i];
if((i+1)==9)
System.out.println("The no of" +ar[i]+ "rupee notes needed is" +k1);
else
{
if(k/ar[i+1]>0)
{
System.out.println("The no of" +ar[i]+ "rupee notes needed is" +k1);
}
else
{
System.out.println("The no of" +ar[i]+ "rupee notes needed is" +(k1-1));
k=k+ar[i];
}
}
n=k;
}
}
}


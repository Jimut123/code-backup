import java.io.*;
class rearrange
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter The Length");
int n=Integer.parseInt(Input.readLine());
int S[]=new int[n];
int A[]=new int[n];
int i,k=0,x;
for(i=0;i<n;i++)
{
System.out.println("Enter The No.");
S[i]=Integer.parseInt(Input.readLine());
}
k=0;
for(i=0;i<n;i++)
{
if(S[i]%2!=0)
{
A[k]=S[i];
k++;
}
}
for(i=0;i<n;i++)
{
if(S[i]%2==0)
{
A[k]=S[i];
k++;
}
}
for(i=0;i<n;i++)
{
S[i]=A[i];
}
for(i=0;i<n;i++)
{
System.out.println("The arranged array"+S[i]);
}
}
}
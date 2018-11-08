import java.io.*;
class Lucky_number
{
public static void main (String args [])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i;

System.out.println("Enter a number:");
n=Integer.parseInt(cd.readLine());
int a[] = new int[n];
for(i=1;i<=n;i++)
{
    a[i-1]=i;
}
for(i=0;i<n;i++)
{
    
 

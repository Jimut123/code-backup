import java.io.*;
class pascaltrio
{
public static void main(String args[])throws IOException
{
int n,i=0,j;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());

j=1;
while(i<n)
{
System.out.println(j);
j=j*11;
i++;
}
}
}
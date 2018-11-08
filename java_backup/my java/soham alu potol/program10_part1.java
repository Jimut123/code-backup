import java.io.*;
class program10_part1
{
public static void main(String args[])throws IOException
{
int j=2,k=1,s=0,x,n;
int i=1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter n:");
n=Integer.parseInt(br.readLine());
System.out.println("Enter x:");
x=Integer.parseInt(br.readLine());
while(i<=n)
{
s=s+(x+j)/k;
j=j+3;
k=k+2;
i++;
}
System.out.println("Sum of series = "+s);
}
}
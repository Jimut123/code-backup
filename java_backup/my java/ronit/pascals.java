import java.io.*;
class pascals
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i,j,n;
int m[]=new int[20];
System.out.println("ENTER THE SIZE OF PASCALS TRINANGLE:");
n=Integer.parseInt(br.readLine());
m[0]=1;
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
System.out.print(m[j]+" ");
System.out.println();
for(j=i+1;j>0;j--);
{
System.out.println(j);
m[j]=m[j]+m[j-1];
}
}

}
}
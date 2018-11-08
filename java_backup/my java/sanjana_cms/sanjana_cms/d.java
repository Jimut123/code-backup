import java.io.*;
class d
{
public static void main () throws IOException
{
int i, j, p;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a number");
p=0;
for(i=5;i>=1;i--)
{
for (j=1; j<=i; j++)
System.out.print(j);
for (j=1; j<=p; j++)
System.out.print(" ");
for (j=i; j>=1; j--)
System.out.print(j);
p=p+2;
System.out.println(" ");
}
}
}



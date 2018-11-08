import java.io.*;
class c
{
public static void main () throws IOException
{
int i, j, k, m, Sp;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a number");
m=1;
Sp=0;
for(i=1;i<=5;i++)
{
for (j=5; j>=m; j--)
System.out.print(j);
for (k=1; k<=Sp; k++)
System.out.print(" ");
j=j+1;
while (j<=5)
{
System.out.print(j);
j++;
}
m=m+1;
Sp=Sp+2;
System.out.println(" ");
}
}
}
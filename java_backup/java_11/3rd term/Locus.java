import java.io.*;
class Locus
{
public static void main (String args [])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader x = new BufferedReader(read);
int n,s,i = 0,j = 0,c = 0;
System.out.println("ENTER A NUMBER:");
n = Integer.parseInt(x.readLine());
s = n + 1;
for(i = 1;i < s;i++)
{
if((s % i) == 0)
{
int f = 0;
for(j = 1;j <= i;j++)
{
if((i % j) == 0)
{
f++;
 }
}
if(f == 2)
{
c++;
 }
}
else
{
continue;
 }
}
if(c != 0)
{
System.out.println(n+" IS A LOCUS NUMBER");
}
else
{
System.out.println(n+" IS NOT A LOCUS NUMBER");
  }
 }
}




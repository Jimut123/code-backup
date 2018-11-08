import java.io.*;
class Twisted_Prime
{
public static void main (String args [])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader x = new BufferedReader(read);
int a,b,i = 0,f = 0;
System.out.println("ENTER TWO NUMBERS:");
a = Integer.parseInt(x.readLine());
b = Integer.parseInt(x.readLine());
System.out.println("TWISTED PRIME NUMBERS:");
for(i = a;i <= b;i++)
{
int c = 0,j = 0;
for(j = 1;j <= i;j++)
{
if((i % j) == 0)
{
c++;
 }
}
if(c == 2)
{
int d,k = 0;
d = i;
while(d != 0)
{
k = (k * 10)+(d % 10);
d = d / 10;
}
int h = 0;
for(j = 1;j <= k;j++)
{
if((k % j) == 0)
{
h++;
 }
}
if(h == 2)
{
System.out.print(i+" ");
f++;
  }
 }
}
System.out.println();
System.out.print("FREQUENCY OF TWISTED PRIME NUMBERS: "+f);
 }
}


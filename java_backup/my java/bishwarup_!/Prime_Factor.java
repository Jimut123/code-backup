import java.io.*;
class Prime_Factor
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num[]=new int [200];
int size;
void readsize()throws IOException
{
System.out.println("give the size");
size=Integer.parseInt(br.readLine());
get_numbers();
}
void get_numbers()throws IOException
{
System.out.println("give the numbers");
for(int i=0;i<size;i++)
num[i]=Integer.parseInt(br.readLine());
show_prime_fact();
}
void show_prime_fact()
{
int n,k;
k=0;
for(int i=0;i<size;i++)
{
System.out.println(num[i]+"'s prime factors are:");
n=num[i];
while(n>1)
{
//k=0;
//System.out.println(n);
for(int l=2;l<=n;l++)
if(n%l==0)
{
k=l;
break;
}
int f=0;
for(int j=2;j<k;j++)
{
if(k%j==0)
{
f=1;
break;
}
}
if(f==0)
System.out.print(k+", ");
System.out.println("");
n=n/k;
}
}
}
}

import java.io.*;
class pattran
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
int i,n;
System.out.println("givevalue"); 
n=Integer.parseInt(br.readLine());
print(n);
}
void print(int n)
{
int i,j;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
System.out.print("*");
System.out.println("");
}
}
}
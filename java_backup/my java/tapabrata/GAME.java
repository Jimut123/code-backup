import java.io.*;
class GAME
{
int i,j;
String n,n1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Give name :");
n=br.readLine();
n1=br.readLine();
i=gm();
j=gm();
if(i>j)
System.out.println(n+"wins.........");
else
if(j>i)
System.out.println(n1+"wins.........");
else
System.out.println("Match Draw");
}
int gm()throws IOException
{
int s,k,c;
c=0;
s=0;
while(s<20)
{
System.out.println("Give number:");
k=Integer.parseInt(br.readLine());
s=s+k;
c++;
}
return c;
}
}
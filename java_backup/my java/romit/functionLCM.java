import java.io.*;
import java.lang.*;
class functionLCM
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
int c,n,m;
System.out.println("Enter The No.");
n=Integer.parseInt(Input.readLine());
System.out.println("Enter 2nd No:");
m=Integer.parseInt(Input.readLine());
c=check(n,m);

System.out.println("The L.C.M. Value:"+c);
}

int check(int x,int y)
{
int i,k;
i=1;
while((x*i)%y!=0)
{
i++;
}
k=x*i;
return k;
}
}
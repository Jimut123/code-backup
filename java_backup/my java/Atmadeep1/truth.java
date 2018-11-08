import java.io.*;
class truth
{
int i,x,t=0,n;
double m;
int b[]=new int[100];
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
void input()throws IOException
{
System.out.println(":-------ENTER THE LAST LIMIT-------:");
n=Integer.parseInt(input.readLine());
x=0;
for(i=0;i<100;i++)
{
b[i]=0;
    }
    while(x>0)
    {
b[t++]=x%2;
    }
    x=x/2;
for(i=n-1;i>=0;i--)
{
System.out.println(b[i]);
    }
m=Math.pow(2,n);
int m1=(int)m;
System.out.println("-------THE TRUTH TABLE IS:-------");  
for(i=0;i<m1;i++)
{    
System.out.println(b[m1]);
    }
}
    }
    
class truthtable
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
System.out.println(":-------ENTER THE LAST LIMIT-------:");
n=Integer.parseInt(input.readLine());
m=Math.pow(2,n);
int m1=(int)m;
System.out.println("-------THE TRUTH TABLE IS:-------");  
for(i=0;i<m1;i++)
{    
System.out.println(b[m1]);
    }
}
    }

import java.io.*;
class factorial
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n,f;
int i,j,k;
for(i=1;i<=10000;i++)
{
f=0;
k=i;
j=1;
while(k>1)
{
if(k%j!=0)
{
f=1;
break;
}
k=k/j;
j++;
}
if(j>1)
j=j-1;
if(f==0)
{
System.out.println("Number" +j+"factorial" +i);
}
}
}
}


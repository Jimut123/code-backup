import java.io.*;
class banking
{
public static void main(String args[])throws IOException
{
int y,m,m1,m2,i;
double p,si,a,e;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter amount of loan");
p=Double.parseDouble(input.readLine());
System.out.println("Enter years of loan");
y=Integer.parseInt(input.readLine());
m=y*12;
System.out.println("Enter no. of months");
m1=Integer.parseInt(input.readLine());
m=m+m1;
m2=0;
i=m;
si=((p*10*i)/(100*12));
a=p+si;
for(i=m;i>0;i--)
{
m2++;
e=a/i;
System.out.println("Amount payable for months "+m2+" is "+e);
a=a-e;
}
}
}


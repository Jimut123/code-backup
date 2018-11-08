import java.io.*;
class digits
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,s=0,n,p=0,nodd=0;
System.out.println("Enter a number");
n=Integer.parseInt(br.readLine());
while(n>0)
{a=n/10;
b=a*10;
c=n-b;
s=s+c;
p=p+1;
n=a;
}
if(p%2==0)
nodd=p/2;
else
nodd=(p/2)+1;
System.out.println("Sum of the digits = " +s);
System.out.println("No of digits present at odd positions " +nodd);
}
}
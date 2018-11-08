import java.io.*;
class twinprime
{public static void main(String args[])
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,a=0,b=0;
try
{System.out.println("Enter 1st no");
a=Integer.parseInt(br.readLine());
System.out.println("Enter 2nd no");
b=Integer.parseInt(br.readLine());
}
catch(IOException e1)
{System.out.println("Wrong operation");
}
catch(NumberFormatException e2)
{System.out.println("Wrong format");
}
catch(ArithmeticException e3)
{System.out.println("Error in programming");
}
for(i=0;i<a;i++)
{if(i%2==0)
i=a;
}
for(j=0;j<b;j++)
{if(j%2==0)
j=b;
}
if(a-b==2||b-a==2)
System.out.println("Twin prime");
else
System.out.println("Not twinprime");
}
}
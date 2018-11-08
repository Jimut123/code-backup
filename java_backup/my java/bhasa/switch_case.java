import java.io.*;
class switch_case
{
public static void main(String args[])throws IOException
{
int n,i,a,b,c,x,max;
a=b=c=0;
x=0;
max=0;
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
n=Integer.parseInt(input.readLine());
for(i=1;;i++)
{
System.out.println("press 1 to vote CPM");
System.out.println("press 2 to vote TMC");
System.out.println("press 3 to vote MAO");
System.out.println("press 4 to view results");
System.out.println("press 5 to exit");
System.out.println("enter choice");
switch(n)
{
case 1:
a++;
break;
case 2:
b++;
break;
case 3:
c++;
break;
case 4:
System.out.println("results :-");
System.out.println("A has got "+a+" votes");
System.out.println("B has got "+b+" votes");
System.out.println("C has got "+c+" votes");
if(a>max)
{
max=a;
x=1;
}
if(b>max)
{
max=b;
x=2;
}
if(c>max)
{
max=c;
x=3;
}
if(x==1)
{
System.out.println("the winner is A with "+max+" votes");
}
if(x==2)
{
System.out.println("the winner is B with "+max+" votes");
}
if(x==3)
{
System.out.println("the winner is C with "+max+" votes");
}
break;
case 5:
System.exit(0);
break;
default:
System.out.println("!!!!!!!!!!!!!!!!!ERROR!!!!!!!!!!!!!!!!!");
}
}
}
}



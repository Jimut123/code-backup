import java.io.*;
import java.lang.*;
class functionvote
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,d;
void input()throws IOException
{
a=b=c=d=0;
do
{
System.out.println("ENTER 1 FOR TO VOTE A");
System.out.println("ENTER 2 FOR TO VOTE B");
System.out.println("ENTER 3 FOR TO VOTE C");
System.out.println("ENTER 4 FOR TO VOTE D");
System.out.println("ENTER 5 FOR TO VOTE EXIT");
System.out.println("ENTER 6 FOR TO VOTE DISPLAY");
System.out.println("ENTER YOUR CHOICE");
int ch=Integer.parseInt(Input.readLine());
switch(ch)
{
case 1:
{
voteA();
break;
}
case 2:
{
voteB();
break;
}
case 3:
{
voteC();
break;
}
case 4:
{
voteD();
break;
}
case 5:
{
System.exit(0);
break;
}
case 6:
{
Display();
break;
}
}
}while(true);
}
void voteA()
{
a++;
}
void voteB()
{
b++;
}
void voteC()
{
c++;
}
void voteD()
{
d++;
}
void Display()
{
System.out.println("VOTE A GETS"+a);
System.out.println("VOTE B GETS"+b);
System.out.println("VOTE C GETS"+c);
System.out.println("VOTE D GETS"+d);
}
}

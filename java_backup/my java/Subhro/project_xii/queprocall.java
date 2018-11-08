package project_xii;

import java.io.*;
class queprocall
{
public static void main(String args[])throws IOException
{
int front=0,back=0,i,n;
quepro a[]=new quepro[100];
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

do
{
System.out.println("Press 1 for input:");
System.out.println("Press 2 for product sell:");
System.out.println("Press 3 for displaying the list:");
System.out.println("Press 4 for displaying the list (only Product name, Price) :");
System.out.println("Press 5 to exit:");
n=Integer.parseInt(input.readLine());
switch(n)
{
case 1:if(front==0)
       {
       a[front]=new quepro();
       a[front].input();
       front++;
       back++;
       }
       else
       {
       System.out.println(back);
       a[back]=new quepro();
       a[back].input();
       back++;
       if(back>99)
       {
       System.out.println("Overflow.......");
       return ;
       }
       }
       break;
case 2:System.out.println("Item sold");
       a[front-1].disp1();
       front++;
       break;
case 3:for(i=front-1;i<back;i++)
       {
        a[i].disp1();
        }
        break;
case 4:for(i=front-1;i<back;i++)
       {
        a[i].disp2();
        }
        break;
case 5:System.exit(0);
default:System.out.println("Press 1/2/3/4/5 :");
}
}while(true);
}
}
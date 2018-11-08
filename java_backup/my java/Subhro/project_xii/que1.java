package project_xii;

import java.io.*;
 class que1
 {
 int q[]=new int[100];
 int x,i,n,Front,Rear;
 BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
 que1()
 {
 Front=-1;
 Rear=-1;
 }
 
 void input()throws IOException
 {
 if(Rear>=100)
 {
 System.out.println("Que flowover");
 return;
 }
 else
 if(Front<0)
 {
 System.out.println("Give value:");
 x=Integer.parseInt(input.readLine());
 q[++Front]=x;
 Rear++;
 }
 else
 {
 System.out.println("Give value:");
 x=Integer.parseInt(input.readLine());
 q[++Rear]=x;
 //Rear;
 }
 }
 void delete()
 {
 System.out.print(q[Front]);
 Front++;
 }
 void disp()
 {
 for(i=Front;i<=Rear;i++)
 System.out.print(q[i]);
 }
 void implement()throws IOException
{
int t;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("Press 1 for INSERT");
System.out.println("Press 2 for DELETE");
System.out.println("Press 3 for DISP");
System.out.println("Press 4 to EXIT");
System.out.println("Enter your choice");
t=Integer.parseInt(input.readLine());
switch(t)
{
case 1:
       input();
       break;
case 2:
       delete();
       break;
case 3:System.out.println("Your Queue : ");
       disp();
       break;
case 4:System.exit(0);
default:System.out.println("Press 1/2/3/4 only");       
}
}while(true);
 }
}
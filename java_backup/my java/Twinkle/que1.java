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
 for(i=0;i<=Rear;i++)
 System.out.print(q[i]);
 }
 }
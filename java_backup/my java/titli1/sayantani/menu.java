import java.io.*;
class menu
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 void input()throws IOException
 {
 int n1,n2,ch;
  System.out.println("enter a no.");
    n1=Integer.parseInt(br.readLine());
   System.out.println("enter another no.");
    n2=Integer.parseInt(br.readLine());
  do
  {
  System.out.println("press 1 for addition");
   System.out.println("press 2 for substraction");
   System.out.println("press 3 for multiplication");
   System.out.println("press 4 for division");
   System.out.println("press 5 for power");
   System.out.println("press 6 to exit");
   System.out.println("enter your choice");
    ch=Integer.parseInt(br.readLine());
   switch(ch)
   {
    case 1: add(n1,n2);
           break;
    case 2: substract(n1,n2);
           break;
    case 3: multiply(n1,n2);
           break;
    case 4: divide(n1,n2); 
           break;
    case 5: power(n1,n2);
           break;
    case 6: System.exit(0);
   }
  }
   while(true);
 }
  
  void add(int n1,int n2)
  {
   int s=n1+n2;
   System.out.println("result="+s);
  }
  
  void substract(int n1,int n2)
  {
   int s=n1-n2;
   System.out.println("result="+s);
  }
  
  void multiply(int n1,int n2)
  {
   int s=n1*n2;
   System.out.println("result="+s);
  }
  
  void divide(int n1,int n2)
  {
   int s=n1/n2;
   System.out.println("result="+s);
  }
  
  void power(int n1,int n2)
  {
   double s=Math.pow(n1,n2);
   System.out.println("result="+s);
  }
  
}  
  
import java.io.*;
class menu
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 void input()throws IOException
 {
 int n1,n2,ch,s;
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
    case 1: s=add(n1,n2);
            System.out.println("result="+s);
           break;
    case 2: s=substract(n1,n2);
            System.out.println("result="+s);            
           break;
    case 3: s=multiply(n1,n2);
            System.out.println("result="+s);           
           break;
    case 4: s=divide(n1,n2); 
            System.out.println("result="+s);
           break;
    case 5: double d=power(n1,n2);
            System.out.println("result="+d);
           break;
    case 6: System.exit(0);
   }
  }
   while(true);
 }
  
   int add(int n1,int n2)
  {
   int s=n1+n2;
   return s;
  }
  
  int substract(int n1,int n2)
  {
   int s=n1-n2;
   return s;
  }
  
  int multiply(int n1,int n2)
  {
   int s=n1*n2;
   return s;
  }
  
  int divide(int n1,int n2)
  {
   int s=n1/n2;
   return s;
  }
  double power(int n1,int n2)
  {
   double d=Math.pow(n1,n2);
   return d;
  }
  
}  
  
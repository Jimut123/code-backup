import java.io.*;
class vote
{
 public static void main(String args[])throws IOException
 {
  int ch,a=0,b=0,c=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  do
  {
   System.out.println("press 1 for selecting candidate A");
   System.out.println("press 2 for selecting candidate B");
   System.out.println("press 3 for selecting candidate C");
   System.out.println("press 4 to see result");
   System.out.println("press 5 to quit");
   ch=Integer.parseInt(br.readLine());
   
   switch(ch)
   {
    case 1:
           a=a+1;
           break;
    case 2:
           b=b+1;
           break;
    case 3:
           c=c+1;
           break;
    case 4:
           System.out.println("A :"+a);
           System.out.println("B :"+b);
           System.out.println("C :"+c);
           break;
    case 5:
           System.exit(0);
   }
  }
   while(true);
 }
} 
           
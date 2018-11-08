import java.io.*;
class Calculator
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 public void menu()throws IOException
 {
  int ch
  do
  {
   System.out.println("press 1 for addition"\n"press 2 for substraction"\n"press 3 for multiplication"
                      \n"press 4 for division"\n"press 5 for power"\n"press 6 to exit");
   System.out.println("enter your choice");
    ch=Integer.parseInt(br.readLine());
   System.out.println("enter 2 no.");
    n1=Integer.parseInt(br.readLine());
    n2=Integer.parseInt(br.readLine());
   switch(ch)
   {
    case 1:
           int r=addition(n1,n2)
           System.out.println("result="+r);
    case 2:
           int r=substraction(n1,n2)
           System.out.println("result="+r);
    case 3:
           int r=multiplication(n1,n2)
           System.out.println("result="+r);
    case 4:
           int r=division(n1,n2)
           System.out.println("result="+r);
    case       
           
                      
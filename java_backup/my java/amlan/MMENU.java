
import java.io.*;
class MMENU
{
int x;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
MMENU()throws IOException
{
do
{
System.out.println("Press 1 for Input Customers' Details");
System.out.println("Press 2 for Display Customers' Details");
System.out.println("Press 3 for Transaction");
//System.out.println("Press 4 for Display customer According to the Date");
System.out.println("Press 4 Exit the System");
System.out.println("Enter Your Choice:");
x=Integer.parseInt(br.readLine());
switch(x)
{
case 1:newac n=new newac();
       break;
case 2:disp_main d1=new disp_main();
       break;
case 3:tranmain d2=new tranmain();
       break; 
//case 4:dispac3 d3=new dispac3();
       //break; 
case 4: System.exit(1);
}
}while(true);
}
}       
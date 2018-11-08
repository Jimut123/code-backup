
import java.io.*;
class disp_main
{
int x;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
disp_main()throws IOException
{
do
{
System.out.println("Press 1 for Display All Customer");
System.out.println("Press 2 for Display Customer Accoring to the Account Number");
System.out.println("Press 3 for Display customer According to the Account Type");
System.out.println("Press 4 for Display customer According to the Date");
System.out.println("Press 5 for Returning to the Main Menu");
System.out.println("Press 6 to exit the Menu instantly");
System.out.println("Enter Your Choice:");
x=Integer.parseInt(br.readLine());
switch(x)
{
case 1:dispac d=new dispac();
       break;
case 2:dispac1 d1=new dispac1();
       break;
case 3:dispac2 d2=new dispac2();
       break; 
case 4:dispac3 d3=new dispac3();
       break; 
case 5:MMENU m=new MMENU();
case 6:System.exit(0);
}
}while(true);
}
}       
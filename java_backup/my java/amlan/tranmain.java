
import java.io.*;
class tranmain
{
int x;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
tranmain()throws IOException
{
do
{
System.out.println("Press 1 for Deposit/Withdraw from account");
System.out.println("Press 2 for Display Customer Accoring to the Account Number");
System.out.println("Press 3 for Returning to the Main Menu");
System.out.println("Enter Your Choice:");
x=Integer.parseInt(br.readLine());
switch(x)
{
case 1:tran1 d=new tran1();
       break;
case 2:trandis d1=new trandis();
       break;
case 3: MMENU m=new MMENU();
}
}while(true);
}
}       
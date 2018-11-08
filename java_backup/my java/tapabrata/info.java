import java.io.*;
class info extends bank
{
public  void mainm()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

do
{
System.out.println("\nPRESS 1 TO INPUT CUSTOMER DETAILS");
System.out.println("PRESS 2 TO DEPOSIT MONEY");
System.out.println("PRESS 3 TO WITHRAW MONEY");
System.out.println("PRESS 4 TO DISPLAY THE DETAILS");
System.out.println("PRESS 5 TO EXIT");
int n=Integer.parseInt(br.readLine());
switch(n)
{
case 1: input();
        break;
case 2: deposit();
        break;
case 3: withdraw();
        break;
case 4: details();
        break;
case 5: System.out.println("Thank You.Visit us again.");
        System.exit(0);
default: System.out.println("GIVE INPUT FROM AMONG THE MENU");
}
}while(true);
}
}

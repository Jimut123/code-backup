import java.io.*;
class bank_conc_developed

{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String name;
String acno;
String type;
double initial;
int i;
bank_conc_developed()throws IOException
{
System.out.print("Give Name:");
name=br.readLine();
System.out.print("Give AccountNo:");
acno=br.readLine();
System.out.print("Give AccountType:");
type=br.readLine();
System.out.print("Give Balance:");
initial=Double.parseDouble(br.readLine());
do
{
System.out.println("Press 1 for deposit:");
System.out.println("Press 2 for Withdraw:");
System.out.println("Press 3 for display:");
System.out.println("Press 4 for exit:");
System.out.println("Enter your choice:");
i=Integer.parseInt(br.readLine());
switch(i)
{
case 1: deposit();
        break;
case 2: withdrawl();
        break;
case 3: disp();
        break;
case 4: System.exit(0);
}
}while(true);        
}

void deposit()throws IOException
{
double amt;
System.out.print("GIVE VALUE");
amt=Double.parseDouble(br.readLine());
initial=initial+amt;
}

void withdrawl()throws IOException
{
double amt;
System.out.print("GIVE VALUE");
amt=Double.parseDouble(br.readLine());
if(amt>initial)
{
System.out.print("Not Available");
}
else
initial=initial-amt;
}

void disp()
{
System.out.println(name);
System.out.println(acno);
System.out.println(type);
System.out.println(initial);
}
}

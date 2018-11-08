import java.io.*;
class bank_conc

{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String name;
String acno;
String type;
double initial;
bank_conc()throws IOException
{
System.out.print("Give Name:");
name=br.readLine();
System.out.print("Give AccountNo:");
acno=br.readLine();
System.out.print("Give AccountType:");
type=br.readLine();
System.out.print("Give Balance:");
initial=Double.parseDouble(br.readLine());
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

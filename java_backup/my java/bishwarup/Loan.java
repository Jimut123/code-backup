import java.io.*;
class Loan
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int time;
double principle,rate,interest,amt;
void get_data()throws IOException
{
System.out.println("give the principle");
principle=Integer.parseInt(br.readLine());
System.out.println("give the time");
time=Integer.parseInt(br.readLine());
calculate();
}
void calculate()
{
if(time<=5)
{
interest=(principle*15*time)/100;
amt=principle+interest;
}
else
if(time>5 && time<=10)
{
interest=(principle*12*time)/100;
amt=principle+interest;
}
else
if(time>10)
{
interest=(principle*10*time)/100;
amt=principle+interest;
}
display();
}
void display()
{
System.out.println("Interest: "+interest);
System.out.println("Amount: "+amt);
}
}

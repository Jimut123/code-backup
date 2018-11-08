import java .io.*;
class sum
{
public static void main(String args[])throws IOException
{
int Si,p,r,t;
double Ci;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the principal");
p=Integer.parseInt(br.readLine());
System.out.print("Enter the rate");
r=Integer.parseInt(br.readLine());
System.out.print("Enter the time");
t=Integer.parseInt(br.readLine());
int opt;
System.out.println("press 1 for Si");
System.out.println("press 2 for Ci");
System.out.println("Enter your choice");
opt=Integer.parseInt(br.readLine());
switch(opt)
{
case 1:
Si=(p*r*t)/100;
System.out.print(Si);
break;
case 2:
Ci=p*Math.pow((1+r/100),t);
System.out.print(Ci);
break;
default:
System.out.print("Sorry!!!Wrong choice");
break;
}
}
}
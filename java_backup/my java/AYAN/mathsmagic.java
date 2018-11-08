import java.io.*;
class mathsmagic
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=0,a=0,n1=0,mathsmagic=0;
System.out.println("------------MATHS MAGIC------------");
System.out.println("PLEASE ENTER YOUR FIVE DIGIT NUMBER:");
n=Integer.parseInt(br.readLine());
if(n!=13837)
{
System.out.println("WRONG INPUT:");
System.exit(0);
}
System.out.println("PLEASE ENTER YOUR AGE:");
a=Integer.parseInt(br.readLine());
System.out.println("PLEASE ENTER YOUR TWO DIGIT NUMBER:");
n1=Integer.parseInt(br.readLine());
if(n1!=73)
{
System.out.println("WRONG INPUT");
System.exit(0);
}
mathsmagic=(n*a*n1);
System.out.println("WOW THE INTERESTING VALUE IS:"+mathsmagic);
System.out.println("------HOPE YOU ALL HAVE ENJOYED MY MATHS MAGIC------");
System.out.println("------THANK YOU------");
System.out.println("------BYE BYE------");
}
}

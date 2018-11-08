
import java.io.*;
class cricket
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
do
{
int ins,run,wick,avrun,avwick;
System.out.println("enter innings");
ins=Integer.parseInt(br.readLine());
System.out.println("enter runs");
 run=Integer.parseInt(br.readLine());
System.out.println("enter wickets");
wick=Integer.parseInt(br.readLine());
 avrun=run/ins;
 avwick=wick/ins;
System.out.println("enter choice");
String ch=br.readLine();
//while()
if(avrun>=40&&avwick>=3)
{
System.out.println("all rounder");
}
else
if(avrun>=50)
{
System.out.println("batsman");
}
else
if(avwick>=4)
{
System.out.println("bowler");
}
else
{
System.out.println("fielder");
}
if(ch.compareTo("N")==0 || ch.compareTo("n")==0)
{
break;
}
}while(true);
}
}

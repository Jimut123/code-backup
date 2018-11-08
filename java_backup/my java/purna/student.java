
import java.io.*;
class student
{
String s;
int roll,total,ave;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
void input()throws IOException
{
System.out.println("enter name");
s=br.readLine();
System.out.println("enter roll");
roll=Integer.parseInt(br.readLine());
}
void average()throws IOException
{
int i,m;
m=0;
for(i=0;i<10;i++)
{
System.out.println("enter marks");
m=Integer.parseInt(br.readLine());
}
total=total+m;
ave=total/10;
}
void print()
{
System.out.println(s+","+roll+","+ave);
}
}


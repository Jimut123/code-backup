import java.io.*;
class electricity
{
void charge(int u)
{
float c,a;c=0;a=0;
if(u<=100)
{
c=(u*80)/100;
a=(c+50);
}
if((u>100)&&(u<=200))
{
c=((100*80)+(u-100)*100)/100;
a=(c+50);
}
if(u>200)
{
c=((100*80)+(100*10)+(u-200)*125)/100;
a=(c+50);
}
System.out.println("The unit consumed="+u);
System.out.println("The charge=Rs."+c);
System.out.println("The additional charge=Rs.50");
System.out.println("The amount to be paid=Rs."+a);
}
public static void main(String args[])throws IOException
{
int un=0;
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
electricity ob=new electricity();
System.out.println("Enter the units comsumed");
un=Integer.parseInt(in.readLine());
ob.charge(un);
}
}
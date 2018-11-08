import java.io.*;
class function2
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int n,m;
int i,j,k,ch;
String A[]={"Surf","Egg","pulses","rice","wheat","ghee","butter","magge","coldrinks","book"};
String S[]={"P0001","p0002","p003","p004","p005","p006","p007","p008","p009","p0010"};
double G[]={100,122,166,122,80,25,45,25,35,99};
double val,t,qut,ds;
void display()throws IOException
{
for(j=0;j<10;j++)
{

System.out.println(A[j]);
System.out.println(S[j]);
System.out.println(G[j]);
System.out.println(' ');
}
}
void check()throws IOException
{
String s;
System.out.println("Enter the code");
s=Input.readLine();
for(i=0;i<n;i++)
{
if(s.compareTo(A[i])==0)
{
System.out.println(A[i]);
System.out.println(S[i]);
System.out.println(G[i]);
t=G[i];
System.out.println(' ');
}
break;
}
System.out.println("Enter quantity");
qut=Double.parseDouble(Input.readLine());
}
void cal()
{
val=0;
val= t*qut;
System.out.println("value"+val);
}
void dis()
{
ds=0;
ds=(val*10/100);
}
void bill()
{

System.out.println(ds);
}
void cse()throws IOException
{
do
{
System.out.println("1:Enter one 1 to see the list");
System.out.println("2:Enter one 2 to see the code");
System.out.println("3:Enter one 3 to see the prise");
System.out.println("4:Enter one 4 to see the discount");
System.out.println("5:Enter one 5 to see the bill");
System.out.println("6:Enter one 6 to Exit");
System.out.println("Enter the choise");
ch=Integer.parseInt(Input.readLine());
switch(ch)
{
case 1:
{
display();
break;
}
case 2:
{
check();
break;
}
case 3:
{
cal();
break;
}
case 4:
{
dis();
break;
}
case 5:
{
bill();
break;
}
case 6: System.exit(0);
}
}while(true);
}
}










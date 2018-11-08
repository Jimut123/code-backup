import java.io.*;
class project3
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,l,k,m,n,s,p;
String h;
String A[][]=new String[10][10];
int B[][]=new int[100][100];
project3()throws IOException
{
System.out.println("Enter The Strength Of The Two Class");
n=Integer.parseInt(Input.readLine());
String A[][]=new String[n][10];
int B[][]=new int[n][100];
}
//String A[][]=new String[100][100];

String C[]={"English-I","English-II","Bengali","Maths","Physics","Chemistry","Biology","History&Civic","Geography","Computer","E.V.S"};
void input()throws IOException
{
for(i=0;i<n;i++)
{
System.out.println("Enter Name,Class,Roll No.,Section,");
for(k=0;k<4;k++)
{
A[i][k]=Input.readLine();
}
m=0;
for(l=0;l<11;l++)
{
System.out.println("Enter Marks Of Subject "+C[m]);
B[i][l]=Integer.parseInt(Input.readLine());
m++;
}
}
}
void calculation1()
{
for(i=0;i<n;i++)
{
s=0; 
for(l=0;l<11;l++)
{
s=s+B[i][l];
p=(s*100)/1100;
}
B[i][11]=s;
B[i][12]=p;
if(p<35)
{
h="F";
}
if((p>=35)&&(p<40))
{
h="E";
}
if((p>=40)&&(p<50))
{
h="D";
}
if((p>=50)&&(p<60))
{
h="C";
}
if((p>=60)&&(p<70))
{
h="B";
}
if((p>=70)&&(p<80))
{
h="B";
}
if((p>=80)&&(p<90))
{
h="A";
}
if((p>=90)&&(p<=100))
{
h="A";
}
A[i][4]=h;
}
}
void display1()
{
for(i=0;i<n;i++)
{
System.out.println("Name,Class,Roll No.,Section");
for(k=0;k<4;k++)
{
System.out.println(A[i][k]);
}
m=0;
for(l=0;l<11;l++)
{
System.out.println(C[m]);
System.out.println(B[i][l]);
m++;
}
System.out.println("Total:"+B[i][11]);
System.out.println("Percentage:"+B[i][12]);
System.out.println("Grade:"+A[i][4]);
}
}
}


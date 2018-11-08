import java.io.*;
class project
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,l,k,m,n,s,p;
String h;
String A[][]=new String[10][10];
int B[][]=new int[10][12];
project()throws IOException
{
System.out.println("Enter The Strength Of The Two Class");
n=Integer.parseInt(Input.readLine());
String A[][]=new String[n][10];
int B[][]=new int[n][12];
}

String C[]={"English-I","English-II","Bengali","Maths","Science","History&Civic","Geography","Computer","E.V.S"};
void input1()throws IOException
{
for(i=0;i<n;i++)
{
System.out.println("Enter Name,Class,Roll No.,Section,");
for(k=0;k<4;k++)
{
A[i][k]=Input.readLine();
}
m=0;
for(l=0;l<9;l++)
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
for(l=0;l<9;l++)
{
s=s+B[i][l];
p=(s*100)/900;
}
B[i][9]=s;
B[i][10]=p;
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
for(l=0;l<9;l++)
{
System.out.println(C[m]);
System.out.println(B[i][l]);
m++;
}
System.out.println("Total:");
System.out.println(B[i][9]);
System.out.println("Percentage:");
System.out.println(B[i][10]);
System.out.println("Grade:");
System.out.println(A[i][4]);
}
}
}


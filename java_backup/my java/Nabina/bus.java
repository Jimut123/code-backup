import java.io.*;
class bus
{
public static void main(String args[])throws IOException
{
int a[][]=new int[10][5];
int b[][]=new int[10][5];
int i,j,p=1,r=0,c=0,h=0;
String s,s1="y",s2="n";
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
p=1;
for(i=0;i<10;i++)
{
for(j=0;j<5;j++)
{
a[i][j]=0;
b[i][j]=p;
p++;
}
}
do
{
System.out.println("Do you want to choose a sit no.? Print y/n");
s=input.readLine();
if(s.charAt(0)==s1.charAt(0))
h=1;
else
if(s.charAt(0)==s2.charAt(0))
h=2;
else
h=3;
switch(h)
{
case 1:{
         System.out.println("Choose your sit no. from the display:");
         for(i=0;i<10;i++)
         {
         for(j=0;j<5;j++)
         {
         if(b[i][j]<=9)
         System.out.print("0"+b[i][j]+"  ");
         else
         System.out.print(b[i][j]+"  ");
         }
         System.out.println(" ");
         }
         c=Integer.parseInt(input.readLine());
         for(i=0;i<10;i++)
         {
         for(j=0;j<5;j++)
         {
         if(b[i][j]==c)
         {
         r=i;
         c=j;
         }
         }
         }
         
         if(a[r][c]==0)
         {
         System.out.println("Seat is available");
         a[r][c]=1;
         }
         else
         {
         System.out.println("Seat is not available");
         System.out.println("Seats available in same row :  ");              
         for(j=0;j<5;j++)
         {
         if(a[r][j]==0)
         {
          System.out.print(b[r][j]+"  ");
         }
         }
         System.out.println("");
         r=0;
         c=0;
         }
         }
         break;
case 2: {
          System.out.println("Thank you for visiting. ");
          System.exit(0);
          }
          break;          
case 3:System.out.println("Press 'Y' or 'N' only");
       break;
}         
}while(true);
}
}
         
import java.io.*;
class bus
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int ar[][]=new int[10][5];
int i,j,k,k1,f,f1;
String s;
for(i=0;i<10;i++)
{
for(j=0;j<5;j++)
{
ar[i][j]=0;
}
}
f1=1;
do
{
f=0;
System.out.println("Give Row No:");
k=Integer.parseInt(input.readLine());
System.out.println("Give Seat No:");
k1=Integer.parseInt(input.readLine());
if((k-1)>=10)
 {
 System.out.println("Error in row........");
 System.exit(0);
 }
else
 if((k1-1)>=5)
 {
 System.out.println("Error in seat no........");
 System.exit(0);
 }
 if(ar[k-1][k1-1]==0)
 {
 System.out.println("Congratualations......");
 ar[k-1][k1-1]=1;
 f=1;
 }
else
 {
   System.out.println("Available seat in row no:"+k);
   for(j=0;j<5;j++)
   {
    if(ar[k-1][j]==0)
     System.out.print((j+1)+",");
   }
 } 
System.out.println(""); 
System.out.println("Want Another(Yes/No)");
s=input.readLine();
if(s.compareTo("n")==0||s.compareTo("N")==0||s.compareTo("NO")==0||s.compareTo("No")==0||s.compareTo("no")==0||s.compareTo("nO")==0)
 break;
}while(true);
}
}

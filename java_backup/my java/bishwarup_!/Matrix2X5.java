import java.io.*;
class Matrix2X5
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int [2][5];
int i,j,max,min,c;
c=1;
System.out.println("give numbers for your matrix:-");
for(i=0;i<2;i++)
{
for(j=0;j<5;j++)
{
System.out.print("("+c+") ");
a[i][j]=Integer.parseInt(br.readLine());
c++;
}
}
max=min=a[0][0];
System.out.println("");
System.out.println("your matrix:");
for(i=0;i<2;i++)
{
for(j=0;j<5;j++)
System.out.print(a[i][j]+" ");
System.out.println("");
}
for(i=0;i<2;i++)
{
for(j=0;j<5;j++)
{
if(a[i][j]>max)
max=a[i][j];
if(a[i][j]<min)
min=a[i][j];
}
}
System.out.println("");
System.out.println("max: "+max);
System.out.println("min: "+min);
}
}

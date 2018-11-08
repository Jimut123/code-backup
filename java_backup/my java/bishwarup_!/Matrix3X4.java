import java.io.*;
class Matrix3X4  
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int [3][4];
int i,j,s,c;
c=1;
s=0;

System.out.println("give numbers for your matrix:-");
for(i=0;i<3;i++)
{
for(j=0;j<4;j++)
{
System.out.print("("+c+") ");
a[i][j]=Integer.parseInt(br.readLine());
c++;
}
}
System.out.println("");

System.out.println("your matrix:");
for(i=0;i<3;i++)
{
for(j=0;j<4;j++)
System.out.print(a[i][j]+" ");
System.out.println("");
}

for(i=0;i<3;i++)
{
for(j=0;j<4;j++)
s=s+a[i][j];
}
System.out.println("sum: "+s);
}
}

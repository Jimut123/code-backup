import java.io.*;
class Matrix4X5
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int [4][5];
int i,j,s,c;
c=1;
s=0;

System.out.println("give numbers for your matrix:-");
for(i=0;i<4;i++)
{
for(j=0;j<5;j++)
{
System.out.print("("+c+") ");
a[i][j]=Integer.parseInt(br.readLine());
c++;
}
}
System.out.println("");

System.out.println("your matrix:");
for(i=0;i<4;i++)
{
for(j=0;j<5;j++)
System.out.print(a[i][j]+" ");
System.out.println("");
}

for(j=0;j<5;j++)
{
for(i=0;i<4;i++)
s=s+a[i][j];
}
System.out.println("sum: "+s);
}
}

import java.io.*;
public class abc
{
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(in);
int i,j,n;
int a[][]=new int[10][10];
void input()throws IOException
{

System.out.println("Give the numbers");
n=Integer.parseInt(br.readLine());
 a=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("Give value");
a[i][j]=Integer.parseInt(br.readLine());
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}
print();
}
void print()
{                                                                                                                                                                                                                                
for(i=0;i<n;i++)
{
if(i==0||i==n-1)
{                                                                                                                                                                                                                                                                                                                                      
for(j=0;j<n;j++)
System.out.print(a[i][j]+" ");
}
else
{
for(j=0;j<n;j++)
{
if(j==0||j==n-1)
System.out.print(a[i][j]+" ");
else
System.out.print(" ");
}
}
System.out.println("");

}
System.out.println(" ");
}
}


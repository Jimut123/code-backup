import java.io.*;
class arranging
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m[][]=new int[4][4];
int i,j,k,t;
System.out.println(" Enter elements ");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
m[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println(" The elements are ");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.print(m[i][j]+ "");
System.out.println();
}
for(i=0;i<4;i++)
{
for(j=0;j<3;j++)
{
for(k=0;k<3-j;k++)
{
if(m[i][k]>m[i][k+1])
{
t=m[i][k];
m[i][k]=m[i][k+1];
m[i][k+1]=t;
}
}
}
}
System.out.println("The elements after rearranging are ");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.print(m[i][j]+ "");
System.out.println();
}
}
}
}
}

import java.io.*;
class matirx
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int[5][5];
int i,j,k;
public void input()throws IOException
{
System.out.println("ENTER ELEMENTS INTO THE MATRIX:");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}
cal();
}
public void cal()
{
k=5-1;
for(i=1;i<5;i++)
{
for(j=k;j<5;j++)
{
System.out.print(a[i][j]+" ");
}
k--;
System.out.println("");
}
}
}


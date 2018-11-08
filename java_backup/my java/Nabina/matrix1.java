//Acc. to row of each matrix
import java.io.*;
class matrix1
{
public static void main(String args[])throws IOException
{
int a[][]=new int[3][3];
//int b[]=new int[9];
int i,j,k=0,temp=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 9 no.s:");
k=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println("Enter no.:");
a[i][j]=Integer.parseInt(input.readLine());
//b[k]=a[i][j];
//k++;
}
}
System.out.println("Your matrix: ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}

//Ascending order
temp=0;
for(i=0;i<3;i++)
{
for(j=0;j<3-1;j++)
 {
  for(k=j+1;k<3;k++)
  {
  if(a[i][j]>a[i][k])
  {
  temp=a[i][j];
  a[i][j]=a[i][k];
  a[i][k]=temp;
  }
  }
  }
  }
System.out.println("Your matrix is in Ascending Order: ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
//Descending order
temp=0;
for(i=0;i<3;i++)
{
for(j=0;j<3-1;j++)
 {
  for(k=j+1;k<3;k++)
  {
  if(a[i][j]<a[i][k])
  {
  temp=a[i][j];
  a[i][j]=a[i][k];
  a[i][k]=temp;
  }
  }
  }
  }
System.out.println("Your matrix is in Descending Order: ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
}
}
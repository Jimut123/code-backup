//Acc. to total values in the matrix
import java.io.*;
class matrix2
{
public static void main(String args[])throws IOException
{
int a[][]=new int[3][3];
int b[]=new int[9];
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
b[k]=a[i][j];
k++;
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

for(i=0;i<k-1;i++)
for(j=i+1;j<k;j++)
if(b[i]>b[j])
{
temp=b[i];
b[i]=b[j];
b[j]=temp;
}
//Ascending order
temp=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
 {
  a[i][j]=b[temp];
  temp++;
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
for(i=0;i<k-1;i++)
for(j=i+1;j<k;j++)
if(b[i]<b[j])
{
temp=b[i];
b[i]=b[j];
b[j]=temp;
}
//Descending order
temp=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
 {
  a[i][j]=b[temp];
  temp++;
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
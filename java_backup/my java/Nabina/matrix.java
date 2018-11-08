import java.io.*;
class matrix
{
public static void main(String args[])throws IOException
{
int i,j,k,k2,p,q,max,min,temp=0;
int a[][]=new int[3][3];
int b[]=new int[9];
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 16 no.s");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println("Enter no.:");
a[i][j]=Integer.parseInt(input.readLine());
}
}
//display of matrix
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
//max and min
max=a[0][0];
min=a[0][0];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
p=a[i][j];
if(p>max)
max=p;
else if(p<min)
min=p;
}
}
System.out.println("Maximum no.: "+max);
System.out.println("Minimum no.: "+min);

p=0;
q=0;
while(p<3)
{
k2=0;
//transferring values
for(i=0;i<4;i++)
{
b[k2]=a[q][i];
k2++;
}
//sorting row-wise
for(i=0;i<3;i++)
{
for(j=0;j<3-i-1;j++)
{
if(b[j+1]<b[j])
{
temp=b[j+1];
b[j+1]=b[j];
b[j]=temp;
}
}
}
//retransferring values
for(i=0;i<4;i++)
{
a[q][i]=b[i];
}
q++;
p++;
}
//display new matrix
for(i=0;i<43;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
}
}
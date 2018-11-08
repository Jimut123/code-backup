import java.io.*;
class Saddle_Point
{
public static void main(int n)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int [100][100];
int i,j,max,min,c,c1;
c=c1=0;
System.out.println("give the array elements:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
}

System.out.println("Matrix :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}

for(i=0;i<n;i++)
{
max=0;
for(j=0;j<n;j++)
{
if(a[i][j]>max)
{
max=a[i][j];
c=j;
}
}
min=a[i][c];
for(j=0;j<n;j++)
{
if(a[j][c]<min)
{
min=a[j][c];
c1=j;
}
}
if(max==min)
System.out.println("Saddle Point: found: "+i+","+c+'\n'+"Value of the point: "+max);

}
}
}

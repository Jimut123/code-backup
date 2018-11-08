import java.io.*;
class transpose_symmetric 
{
public static void main() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,t,f=0;
System.out.println("Enter the size");
int n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
int b[][]=new int[n][n];
System.out.print("Enter the elements");
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        a[i][j]=Integer.parseInt(br.readLine());
    }
}
t=0;
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        b[i][j]=a[j][i];
        
    }
}
System.out.println("The Original matrix is");
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        System.out.print(a[i][j]+",");
    }
    System.out.println();
}
System.out.println("Transpose Matrix...");
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        System.out.print(b[i][j]+",");
    }
    System.out.println();
}
//symmetric check
f=0;
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        if(a[i][j]!=b[i][j])
        {
        f=1;
        break;
    }
        
    }
}
if(f==0)
System.out.println("Symmetric");
else
System.out.println("Wrong");
}
}
/**
 * Enter the size
3
Enter the elements1
2
3
2
4
5
3
5
6
The Original matrix is
1,2,3,
2,4,5,
3,5,6,
Transpose Matrix...
1,2,3,
2,4,5,
3,5,6,
Symmetric

 */
/**
 * Enter the size
3
Enter the elements1
23
4
4
5
6
7
8
9
The Original matrix is
1,23,4,
4,5,6,
7,8,9,
Transpose Matrix...
1,4,7,
23,5,8,
4,6,9,
Wrong

 */
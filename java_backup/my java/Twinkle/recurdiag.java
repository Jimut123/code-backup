import java.io.*;
class recurdiag
{
int a[][]=new int[100][100];
int n,i=0,j,k,g=1,s1=0,s2=0;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
i=0;
System.out.println("Enter no.s into ("+n+" * "+n+") matrix");
g=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print("("+g+")");
a[i][j]=Integer.parseInt(input.readLine());
System.out.println("");
g++;
}
}
i=0;
k=n-1;
diag();
}

void diag()
{

if(i<n)
{
s1=s1+a[i][i];
s2=s2+a[i][k];
k--;
i++;
diag();
}
else
{
return;
}
}

void disp()
{

System.out.println("Your ("+n+" * "+n+") matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}

System.out.println("Sum of the left diagonals :"+s1);
System.out.println("Sum of the right diagonals :"+s2);
}
}
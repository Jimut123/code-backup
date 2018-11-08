import java.io.*;
class sqcubematrix
{
public static void main(String args[])throws IOException
{
int a[][]=new int[100][100];
int b[]=new int[100];
int i,j,n,g=1,k=0,t=0,h=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter length of matrix:");
n=Integer.parseInt(input.readLine());

g=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print("("+g+")");
a[i][j]=Integer.parseInt(input.readLine());
g++;
System.out.println();
}
}

//display
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

//lower diagonals
for(i=0;i<n;i++)
{
for(j=0;j<i;j++)
{
b[t]=a[i][j];
t++;
}
}

System.out.println(" Lower diagonals:");
for(i=0;i<t;i++)
{
System.out.print(b[i]+" ");
}
System.out.println(" ");
//upper diagonals
//k=n-1;
h=0;
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
a[i][j]=b[h]*b[h];
h++;
}
//k--;
if(h>=t)
break;
}

//main diagonal
h=0;
for(i=0;i<n;i++)
{
a[i][i]=b[h]*b[h]*b[h];
h++;
if(h>=t)
break;
}

//display
System.out.println(" Your new matrix:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

}
}
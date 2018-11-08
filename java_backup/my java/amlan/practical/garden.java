package practical;


import java.io.*;
class garden
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int arr[][]=new int[100][100];
int n,k,r,c,m,q;
void get()throws IOException
{
System.out.println("Enter no. of rows:");
r=Integer.parseInt(br.readLine());
System.out.println("Enter no. of columns:");
c=Integer.parseInt(br.readLine());
for( m=0;m<r;m++)
{
for(q=0;q<c;q++)
{
arr[m][q]=0;
}
}
show();
System.out.println("Enter no. of rows and  columns to be inserted(0/1):");
for( m=0;m<r;m++)
{
for(q=0;q<c;q++)
{
arr[m][q]=Integer.parseInt(br.readLine());
}
}
show();
calc();
}
void calc()throws IOException
{
System.out.println("Enter no. of rows and columns to be burned :");
n=Integer.parseInt(br.readLine());
k=Integer.parseInt(br.readLine());
recur(n,k);
show();
}
void recur(int i, int j)
{
if(i>=r)
return;
else
if(i<0)
return;
else
if(j>=c)
return;
else
if(j<0)
return;
else
if(arr[i][j]==0)
return;
else
if(arr[i][j]==1)
{
arr[i][j]=2;
recur(i-1,j);
recur(i+1,j);
recur(i,j-1);
recur(i,j+1);
recur(i-1,j-1);
recur(i-1,j+1);
recur(i+1,j+1);
recur(i+1,j-1);
}
}
void show()
{
for(int m=0;m<r;m++)
{
for(int q=0;q<c;q++)
{
System.out.print(arr[m][q]+"'");
}
System.out.println("");
}
}
}




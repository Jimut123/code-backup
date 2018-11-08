public class abc
{
void input()throws IOException
{
InputStreamReader in=new InputStreamReader(System.in());
BufferedReader br =new BufferedReader(in.readline());
int i,j,n;
System.out.println("Give the numbers");
n=Integer.parseInt(br.readline());
int a[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("Give value");
a[i][j]=Integer.parseInt(br.readLine());
}
}
print();
}
void print()
{                                                                                                                                                                                                                                
for(i=0;i<n;i++)
{
if(i==0||i=n-1)
{                                                                                                                                                                                                                                                                                                                                      
for(j=0;j<n;lj++)
System.out.println(a[i][j]);
}
else
for(j=0;j<n;j++)
{
if(j==1||j==n-1)
System.out.println(a[i][j]);
else
System.out.println(" ");
}
}
System.out.println(" ");
}
}


import java.io.*;
class sort2 {
int i,n,j,t;
int a[]=new int[100];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter term:");
n=Integer.parseInt(br.readLine()); 
for(i=0;i<n;i++)
 {
  a[i]=Integer.parseInt(br.readLine());
 }
}
void Bub()
{
 for(i=0;i<n;i++)
 {
     for(j=0;j<(n-i-1);j++)
     {
         if(a[j]>a[j+1])
         {
         t=a[j];
         a[j]=a[j+1];
         a[j+1]=t;
        }
     }
 }

 for(i=0;i<n;i++)
 {
     System.out.println(a[i]);
 }
}
}
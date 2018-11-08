
import java.io.*;
 class determinent
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
int a[][]=new int[100][100];
   int a1[][]=new int[100][100];
   int i,j,n,k,s,s1,s2,p,p1;
   determinent()
   {
       s=s1=s2=0;
    }
    void input()throws IOException
    {
       System.out.println("Give Row & Column:");
       n=Integer.parseInt(br.readLine());
       for(i=0;i<n;i++)
       for(j=0;j<n;j++)
       {
           System.out.println("Give values:");
           a[i][j]=Integer.parseInt(br.readLine());
        }
       calc();
}
void calc()
{
if(n<3)
{
s=a[0][0]*a[1][1]-a[0][1]*a[1][0];
}
else
{
for(k=0;k<n;k++)
for(j=0;j<n;j++)
a1[k][j]=a[k][j];
for(k=0;k<n;k++)
for(j=n;j<(2*n-1);j++)
a1[k][j]=a1[k][j-n];
for(k=0;k<n;k++)
{
p=1;
for(j=0;j<n;j++)
p=p*a1[j][j+k];

s1=s1+p;
}
for(k=n-1;k<(2*n-1);k++)
{
p1=1;
for(j=0;j<n;j++)
p1=p1*a1[j][k-j];

s2=s2+p1;
}
s=s1-s2;
}
//System.out.println(p);
//System.out.println(p1);
System.out.println("Determinent:"+s);
}
}
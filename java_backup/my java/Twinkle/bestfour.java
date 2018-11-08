import java.io.*;
class bestfour extends Iscscores
{
int i,j,t,t1;
int ar[]=new int[100];
int br[]=new int[100];
bestfour()throws IOException
{
super();
bestsubjects();
}
void bestsubjects()
{
t=0;
for(i=0;i<6;i++)
{
super.p=super.number[i][0];
br[t]=super.number[i][0];
ar[t]=super.point();
t++;
}
for(i=0;i<t-1;i++)
for(j=i+1;j<t;j++)
if(ar[i]>ar[j])
{
int k=ar[i];
ar[i]=ar[j];
ar[j]=k;
}
for(i=0;i<t-1;i++)
for(j=i+1;j<t;j++)
if(br[i]<br[j])
{
int k=br[i];
br[i]=br[j];
br[j]=k;
}
//for(i=0;i<t;i++)
//System.out.println(ar[i]);
//for(i=0;i<t;i++)
//System.out.println(br[i]);
t1=0;
while(t1<5)
{
for(i=0;i<t;i++)
{
for(j=0;j<6;j++)
{
if(super.number[j][0]==br[i])
{
System.out.println("Marks:"+super.number[j][0]+" "+"Point:"+ar[t1]+" "+"Subject No:"+super.number[j][1]);
t1++;
break;
}
}
}
t1++;
}
}
}

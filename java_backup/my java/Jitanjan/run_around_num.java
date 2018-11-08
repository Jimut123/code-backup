class run_around_num
{
public static void main(int n)
{
System.out.println("inputed number : \n"+n);
int i,t,k,j;
t=0;
int num[]=new int [100];
while(n>0)
{
num[t++]=n%10;
n=n/10;
}
int m[]=new int [t];
k=0;
for(i=0;i<t;i++)
{
j=i+num[i];
if(j>=t)
j=j-t;
m[k++]=num[j];
}
System.out.println("run-around number : ");
for(i=0;i<k;i++)
System.out.print(m[i]);
}
}

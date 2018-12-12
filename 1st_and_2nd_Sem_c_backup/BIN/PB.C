#include<stdio.h>
void main()
{
long int i,j,n,start=0,end=0,f,sum1=0,sum2=0,found=0,no=0;
long int d,n1,s2=0,c=0;
long int a[10],b[10];
clrscr();
printf("Enter the no. of digits ::\n");
scanf("%lu",&n);
printf("Enter the password::(Enter space or tab between the digits)\n");
for(i=0;i<n;i++)
{
f=1;
scanf("%lu",&a[i]);
for(j=1;j<=a[i];j++)
f=f*j;
sum2=sum2+f;
}
printf("\n");
printf("\n sum2 = %lu\n",sum2);

for(i=0;i<n;i++)
no=no*10+a[i];
//for(i=0;i<n;i++)       //for printing of digits         //storing 7843
//printf("%d",a[i]);
for(i=0;i<n;i++)
{
b[i]=i+1;
start=start*10+b[i];
}
//for(i=0;i<n;i++)       //for printing of digits         //storing 1234
//printf("%d",b[i]);
printf("Start = %lu",start);
for(i=n-1;i>=0;i--)
{
b[i]=i+1;
f=1;
for(j=1;j<=b[i];j++)
f=f*j;
sum1=sum1+f;
end=end*10+b[i];
}
printf("Sum = %lu",sum1);
printf("End = %lu",end);
printf("\n");
for(i=start;i<=end;i++)
{
n1=i;
s2=0;
while(n1!=0)
{
d=n1%10;
if(d==0)
break;
f=1;
for(j=1;j<=d;j++)
f=f*j;
s2=s2+f;
n1=n1/10;
}
if(s2==sum1)
{
c++;
printf("%lu c = %lu\n",i,c);
if(no==i)
{
found=1;
break;
}
}
}
if(found==1)
printf("Password cracked :: \n Password found = %lu\n and at position = %lu",i,c);
else
printf("Not accesed// not present");
getch();
}
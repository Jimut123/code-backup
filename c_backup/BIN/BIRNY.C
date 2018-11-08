#include<stdio.h>
#include<math.h>
int c=0;
void binary(int,int);
void main()
{
int j,n,i,m;
clrscr();
printf("Enter a number :");
scanf("%d",&n);
printf("\nThe truth table of %d bits binary number is :: \n",n);
m=(int)pow(2,n);
//printf("%d",c);
for(i=0;i<m;i++)
{
binary(i,n);

}
getch();
}
void binary(int m,int n)
{

int i=0,a[100],j,d,k=m,g=0;
for(i=0;i<100;i++)
a[i]=0;
i=0;
while(k!=0)
{
d=k%2;
a[i++]=d;
g++;
k=k/2;
}
for(j=n-g-1;j>=0;j--)
printf("0 ");
for(j=i-1;j>=0;j--)
printf("%d ",a[j]);
//delay(230);
printf("\n");
}
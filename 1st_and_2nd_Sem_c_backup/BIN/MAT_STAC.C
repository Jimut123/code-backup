#include<stdio.h>
#include<zarvis.h>
void main()
{
int i,n,j,a[10][10],k,h,s[100],u,v,t,c1=0,p,q=0,o,p1=0,p2=0;
clrscr();
printf("Enter the size of 1 side ::\n");
scanf("%d",&n);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("Enter the element of %d th row and %d th column :: \n",i+1,j+1);
scanf("%d",&a[i][j]);
}
}


printf("\n");
for(i=n-1;i>=0;i--)
{
for(j=n-1;j>=0;j--)
{
printf("\nWnat to pop or push ?(1/2)\n and 4 to exit\n");
scanf("%d",&p);
if(p==4)
exit(3);
if(p==1)
{

q++;
for(u=0;u<n;u++)
{
for(v=0;v<n;v++)
{
if(v<n-1)
{
if(c1<q)
s[c1++]=q;

t=a[u][v+1];
a[u][v]=t;
}
if(v==n-1)
{
t=a[u+1][0];
a[u][v]=t;
if(c1<q)
s[c1++]=q;

}

}
}
a[i][j]=0;
//printf("*%d\t%d",i,j);
//printf("\ta[i][j]=%d",a[i][j]);
}
if(p==2)
{
//printf("%d\t%d",i,j);
p1++;
for(u=n-1;u>=0;u--)
{
for(v=n-1;v>=0;v--)
{
if(p2<=p1)
{
p2++;
a[u][v]=s[--c1];
break;
}
}
}

}

printf("\n\t\t\t\t\tStack ::");
for(o=0;o<c1;o++)
printf("\n\t\t\t\t\t%d",s[o]);

printf("\n");
for(k=0;k<n;k++)
{
for(h=0;h<n;h++)
{
printf("%d\t",a[k][h]);
delay();
}
printf("\n\n");
}
}
printf("\n");
}


getch();


}


#include"stdio.h"
#include"conio.h"
void main()
{
int a[100],j,i,n,t;
printf("Give no of terms:");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Give Elements:");
scanf("%d",&a[i]);
}
printf("Elements before sort:");
for(i=0;i<n;i++)
{
printf("\n%d",a[i]);
}
for(i=0;i<n;i++)
{
//insert value into temporary variable for finding out the
// proper place of insertion
t=a[i];
for(j=i-1;j>=0;j--)
{
//check for proper place for insertion
if(t<a[j])
{
a[j+1]=a[j];
//inserting value at proper position
a[j]=t;
}
}
}
printf("Elements after sort:");
for(i=0;i<n;i++)
{
printf("\n enter %d",a[i]);
}

}

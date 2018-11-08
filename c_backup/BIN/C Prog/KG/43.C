/* Write a program to insert a given number in the array in a given position*/
#include <stdio.h>
main()
{
int a[6],i,j=6,k,val,pos;
for(i=0;i<5;i++)
{
    printf("\nENTER NUMBER-%d: ",i+1);
    scanf("%d",&a[i]);
}
printf("\nENTER VALUE TO INSERT: ");
scanf("%d",&val);
printf("\nENTER POSITION TO INSERT: ");
scanf("%d",&pos);
for(k=j;k>=pos;k--)
{
    a[k]=a[k-1];
}
a[--pos]=val;
printf("\nTHE ARRAY IS: ");
for(i=0;i<j;i++)
{
    printf("\n\t %d",a[i]);
}
}

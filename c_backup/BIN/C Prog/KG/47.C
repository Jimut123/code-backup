#include<stdio.h>
main()
{
 int i,j,k,n,pos;
 float a[50],item;
 printf("\n Size of the array?");
 scanf("%d",&n);
 printf("\n Enter the elements one by one:");
 for(i=0;i<n;i++)
 scanf("%f",&a[i]);
 printf("\n Element to be inserted?");
 scanf("%f",&item);
 printf("\n Position of insertion?");
 scanf("%d",&pos);
 n++;
 for(k=n;k>=pos;k--)
 a[k]=a[k-1];
 a[--pos]=item;
 printf("\n Array after inserting the new number:");
 for(i=0;i<n;i++)
 printf("\t %6.2f",a[i]);
 printf("\n");
}

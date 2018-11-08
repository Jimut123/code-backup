/* Print all the input numbers in reverse order. */

#include<stdio.h>
main()
{
 int a[5],b[5],i,j;
 printf("\n Enter 5 nos:");
 for(i=0;i<=4;i++)
 scanf("%d",&a[i]);
 for(i=0,j=4;i<=4/* j>=0; */;i++,j--)
 b[j]=a[i];
 printf("\n The nos in reverse order:\n");
 for(i=0;i<=4;i++)
 printf("\n %d",b[i]);
}

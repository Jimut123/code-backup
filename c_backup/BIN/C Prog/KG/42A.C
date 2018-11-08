#include<stdio.h>
main()
{
 int a[]={5,1,15,20,25};
 int i,j,m;
 i=++a[1];  /*i=2,a[1]=2*/
 j=a[1]++;  /*j=2,a[1]=3*/
 m=a[i++];  /*i was 2 so m will be 15, in becomes 3*/
 printf("\n i=%d, j=%d, m=%d",i,j,m);
}

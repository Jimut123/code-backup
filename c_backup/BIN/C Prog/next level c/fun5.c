#include<stdio.h>
main()
{
 int a[20],i,m,n,r;
 printf("\n Enter the decimal number:");
 scanf("%d",&n);
 m=n;
 for(i=0;n>0;i++)
 {
     r=n%2;
	 a[i]=r;
	 n=n/2;
 }
 printf("\n Binary equivalent of %d is \t",m);
 for(i--;i>=0;i--)
     printf("%d",a[i]);
}

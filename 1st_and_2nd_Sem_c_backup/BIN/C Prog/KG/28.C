/*  Write program to print the fibonacci series up to a given number.  */

#include <stdio.h>
main()
{
	int num,i;
	unsigned long n1=0,n2=1,s;
	printf("\nENTER A NUMBER: ");
	scanf("%d",&num);
	printf("\nFIBONACCI SERIES UPTO %d NUMBERS IS: \n",num);
	printf("%lu %lu",n1,n2);
	for(i=1;i<=num-2;i++)
	{
		s=n1+n2;
		printf(" %lu",s);
		n1=n2;
		n2=s;
    }
}
/*
{
    int a=0,b=1,c=0,e,x;
    while(c<=15)
    {
        c=a+b;
        a=b;
        b=c;
        e=a+b;
        for(x=c+1;x<e;x++)
        {
            if(x<=15)
            printf("%d\t",x);
        }
    }
}
*/

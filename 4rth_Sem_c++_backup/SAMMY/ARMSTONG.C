#include <stdio.h>
void main()
{
	int i,n,r,nn;
	clrscr();
	for(i=100;1<=999;i++)
	{
		n=i;
		nn=0;
		while(n!=0)
		{
			r=n%10;
			n/=10;
			nn+=r*r*r;
		}
		if(nn==i)
		printf("\n %d",i);
	}
	getch();
}

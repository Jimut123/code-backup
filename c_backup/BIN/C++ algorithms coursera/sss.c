#include<stdio.h>
void main()
{
	int i,n[20],min,max;
	clrscr();
	for(i=0;i<10;i++)
	{
		printf("Enter the %d no. element :",i+1);
		scanf("%d",&n[i]);
	}
	min=n[0];
	max=n[0];
    for(i=0;i<10;i++)
    {
    	if(n[i]>=max)
    	max=n[i];
    	else if(n[i]<=min)
    	min=n[i];
	}
	printf("Maximum number : %d \n Minimum number : %d \n",max,min);
	getch();
}

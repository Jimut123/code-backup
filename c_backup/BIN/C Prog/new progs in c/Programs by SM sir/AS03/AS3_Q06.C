
	/* Assignment 3 .... Question 6 */
	/* Arranging a group of numbers into positive & negative numbers */

#include<stdio.h>
#include<math.h>

void main()
{
	int a[10],i,j,n,temp,flag,pos;
	clrscr();
	gotoxy(10,10);
	printf("Enter the number of elements you want to enter : ");
	scanf("%d",&n);

	for(i=0;i<n;i++)
	{
		printf("\n\tEnter number %d : ",i+1);
		scanf("%d",&a[i]);
	}

	for(i=0;i<n;i++)
	{
		flag=0;
		if(a[i]<0)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[j]>=0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				pos=j;
				temp=a[pos];
				for(j=pos;j>i;j--)
					a[j]=a[j-1];
				a[i]=temp;
			}
		}
	}
	clrscr();
	gotoxy(10,10);
	printf("The modified array is as follows....\n\n");
	printf("\t");

	for(i=0;i<n;i++)
		printf("%5d",a[i]);
	getch();
}

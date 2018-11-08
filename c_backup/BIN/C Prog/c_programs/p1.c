#include<stdio.h>
int main()
{
	int i, a[20],count=0,countodd,counteven;
	printf("\nEnter the elements of the array: ");
	scanf("%[^\n]",a);
	for(i=0;i<strlen(a);i++)
	{
		if(a[i]!=1&&a[i]%3==0)
			count++; 
		else
			continue;
	}
	printf("\nNo. of numbers that are completely divisible by 3: %d ",count);
/*	for(i=0;i<strlen(a);i++)
	{
		if(a[i]&1==1)
			countodd++;
		if(a[i]&1!=1)
		{
			counteven++;
			printf("\nFollowing even numbers are: %d",a[i]);
		}		
	}
	printf("\nThe number of odd numbers is: %d \n\nThe number of even numbers is: %d\n",countodd,counteven);*/
	return 0;
}

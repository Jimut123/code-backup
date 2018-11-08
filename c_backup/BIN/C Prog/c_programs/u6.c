#include<stdio.h>
#include<string.h>
int main()
{
	int i,n;
	char ch[100];
	printf("\nEnter string of numbers: ");
	scanf("%[^\n]",ch);
	printf("\nThe number to find: ");
	scanf("%d",&n);
	for(i=0;i<strlen(ch);i++)
	{
		if(ch[i]==n)
			printf("\nDesired number found!!!...");
	/*	else
			printf("\nOoops! Number has not found...");*/
	}
	return 0;
}

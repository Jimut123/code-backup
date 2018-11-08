/* using of Nested Loop: series of asterisks*/
#include<stdio.h>
int main()
{
	int row,col,k;
	for(row=1;row<=5;row++)
		{
			for(col=1;col<=row;col++)
				printf("%d \t",k++);
				printf("\n");
		}
	return 0;
}

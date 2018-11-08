#include<stdio.h>
int main()
{
	int x=1,A,B;
	printf("\n Enter the value of A and B:");
	scanf("%d %d",&A,&B);
	
	switch(x)
	{
		case 1:
			x=A+B;
			printf("\n The value of x=%d+%d=%d",A,B,x);
		
	}
	return 0;
}

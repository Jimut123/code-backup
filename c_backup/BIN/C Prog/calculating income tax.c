/* Calculating Income Tax_ Income Tax-it,Annual Income-ai */
#include<stdio.h>
int main()
{
	float it,ai;
	printf("\n Annual Income: ");
	scanf("%f",&ai);
	if(ai<200000)
		{
			printf("\n Income Tax: 0");
		}
		else if(ai>=200000 && ai<=500000)
		{
			it=ai*0.1;
			printf("\n Income Tax: %0.2f ",it);
		}		
			else if(ai>500000)
		{
			it=ai*0.2;
			printf("\n Income Tax: %0.2f",it);
		}	
	return 0;
}

/* Calculating Income Tax_ Income Tax-it,Annual Income-ai */
#include<stdio.h>
int main()
{
	float it,ai;
	printf("\n Annual Income: ");
	scanf("%d",ai);
	
	{
	
			if(ai<200000)
			{
				printf("\n Income Tax: 0");
			}
	
		
		
	 if(ai>200000 && ai<500000)
		{
				it=ai*(10/100);
			printf("\n Income Tax: %d ",&it);
		}
			
		
			if(ai>500000)
		{
				it=ai*(20/100);
			printf("\n Income Tax: %d",&it);
			
		}
	}
	return 0;
}

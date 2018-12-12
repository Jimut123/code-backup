// to imply_ 245=two hundred fourty five
#include <stdio.h>
#include<stdlib.h>
int main()
{
	int i,j,k,l;
	int n[3];	
	printf("\nENTER A 3 DIGIT NUMBER: ");
	for(i=0;i<3;i++)
	scanf("%d",&n[i]);
	for(i=0;i<1;i++)
	{
		j=n[i];
		switch(j)
	{
		case 1:
			printf(" ONE HOUNDRED");
			break;
		case 2:
			printf(" TWO HOUNDRED");
			break;
		case 3:
			printf(" THREE HOUNDRED");
			break;
		case 4:
			printf(" FOUR HOUNDRED");
			break;
		case 5:
			printf(" FIVE HOUNDRED");
			break;
		case 6:
			printf(" SIX HOUNDRED");
			break;
		case 7:
			printf(" SEVEN HOUNDRED");
			break;
		case 8:
			printf(" EIGHT HOUNDRED");
			break;
		case 9:
			printf(" NINE HOUNDRED");
			break;
						
		default:
			printf(" ");
	}
	}
	for(i=1;i<2;i++)
	{
	if(n[i]==1)
	{
		k=n[i]*10+n[i+1];
		if(k==10||k==11||k==12||k==13||k==14||k==15||k==16||k==17||k==18||k==19)	
	{
		switch(k)
	{
		case 10:
			printf(" TEN");
			break;
		case 11:
			printf(" ELEVEN");
			break;
		case 12:
			printf(" TWELVE");
			break;
		case 13:
			printf(" THIRTEEN");
			break;
		case 14:
			printf(" FOURTEEN");
			break;
		case 15:
			printf(" FIFTEEN");
			break;
		case 16:
			printf(" SIXTEEN");
			break;
		case 17:
			printf(" SEVENTEEN");
			break;
		case 18:
			printf(" EIGHTTEEN");
			break;
		case 19:
			printf(" NINETEEN");
			break;
						
		default:
			printf(" ");
	}
	}
	}
	else 
	{
		k=n[i];
		switch(k)
		{
			case 2:
				printf(" TWENTY");
				break;
			case 3:
				printf(" THIRTY");
				break;
			case 4:
				printf(" FOURTY");
				break;
			case 5:
				printf(" FIFTY");
				break;
			case 6:
				printf(" SIXTY");
				break;
			case 7:
				printf(" SEVENTY");
				break;
			case 8:
				printf(" EIGHTY");
				break;
			case 9:
				printf(" NINETY");
				break;
				
			default:
				printf(" ");
				break;
		}
	
	
	for(i=2;i<3;i++)
	{
		l=n[i];
		switch(l)
		{
			case 1:
				printf(" ONE");
				break;
			case 2:
				printf(" TW0");
				break;
			case 3:
				printf(" THREE");
				break;
			case 4:
				printf(" FOUR");
				break;
			case 5:
				printf(" FIVE");
				break;
			case 6:
				printf(" SIX");
				break;
			case 7:
				printf(" SEVEN");
				break;
			case 8:
				printf(" EIGHT");
				break;
			case 9:
				printf(" NINE");
				break;
			default:
				printf(" ");
				break;	
		}
	}
	}
	}
	return 0;
}

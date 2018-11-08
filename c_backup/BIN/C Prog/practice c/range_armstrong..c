 /*finding armstrong numbers within given range*/
#include<stdio.h>  
int main()
{
	int i,temp,num=0;
	for(i=1;i<500;i++)
	{
		temp=i;
		num=0;
		while(temp!=0)
		{
			num=num+pow(temp%10,3);		
			temp=temp/10;
		}
		if(num==i)
			printf(" %d",num);
	}
	return 0;
}

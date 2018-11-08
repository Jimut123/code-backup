#include<stdio.h>
int main()
{	
	int n,i=0,next,prev=1,r;
	printf("\nEnter The No. Of Terms - ");
	scanf("%d",&n);
	for(r=1;r<=n;r++)
	{
		if(r<=1)
			next=r;
		else
		{	
		next=i+prev;
		i=prev;
		prev=next;
	    }
		printf("%d\t",next);
    }
		return 0;
}

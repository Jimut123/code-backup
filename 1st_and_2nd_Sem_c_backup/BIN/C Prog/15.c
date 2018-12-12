#include<stdio.h>
int main()
{
	int i,s=0,n;
	printf("\n Enter The No. Of Terms: ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	s+=i;
	printf("\b+=%d");
	printf("\n Sum Is %d",s);
	return 0;
	
}

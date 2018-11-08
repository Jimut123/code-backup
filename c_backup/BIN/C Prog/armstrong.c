#include<stdio.h>

int main(){
	
	int s=0,n,r,m;
	
	printf("\nEnter The no. ");
	scanf("%d",&n);
	n=m;
	while(n)
	{
		r=n%10;
		s=s+r*r*r;
		n=n/10;
		
	}
	
    if(s==m)
	printf("It is an Armstrong No. ");
	else
	printf("It is Not an Armstrong No. ");
	
	return 0;
}

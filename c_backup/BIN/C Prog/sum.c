#include<stdio.h>
int main()

{
	int a,b,s=0;
	printf("\n Enter The Number:- ");
	scanf("%d",&a);
	
	for(b=1;b<=a;b++){
	 s=s+b;
	if(b==5||b==7)
	 
	   continue;
	   
	else
	printf("%d+",b);
	}
	s=s-5-7;
	printf("\b=%d",s);
	return 0;
	
}

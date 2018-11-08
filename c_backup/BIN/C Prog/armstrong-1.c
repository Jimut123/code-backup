#include<stdio.h>
#include<conio.h>
void main(){
	
	int s=0,n,r,m,n1,n2;
	
	printf("\nArmstrong numbers between two intervals: ",n1,n2);
	scanf("%d%d", &n1,&n2);
	printf("\nArmstrong numbers between %d and %d are: ", n1,n2);
	while(n)
	{
		r=n%10;
		s=s+r*r*r;
		n=n/10;
		
	}
	
    if(s==m)
	{
	printf("%d",s);
	}
	getch();
}

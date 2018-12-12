#include<stdio.h>
int main()
{
	int n=36;
	int i,c;
	for(i=1,c=0;n;n-=i,c++,i+=2);
	printf("Square Root:= %d",c);
	return 0;
}

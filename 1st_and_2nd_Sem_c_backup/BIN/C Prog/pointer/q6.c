#include<stdio.h>
int main()
{
	char ma[5],*p=ma;
	int i;
	for(i=4;i>=0;i--){
	*p=i*i;
	p++;
	}
	for(i=4;i>=0;i--)
	printf("%d ", ma[i]);
	return 0;
}

#include<stdio.h>
int main()
{
	int a=5;
	double b=3.1415;
	void *vp;
	vp=&a;
	printf("\n a=%d",*((int *)vp));
	vp=&b;
	printf("\n b=%d",*((double *)vp));
	return 0;
}

#include<stdio.h>
int main()
{
	union a
	{
		int i;
		char ch[2];
	};
	union a u;
	u.ch[0]=3;
	u.ch[1]=2;
	printf("%d %d %d",u.ch[0],u.ch[1],u.i);
	return 0;
}

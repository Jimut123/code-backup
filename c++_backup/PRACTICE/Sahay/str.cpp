/* Beginning  of def.c */
#include<iostream>
//#include<stdio>
using  namespace std;
struct abc
{
	char a;
	int b;
	float c;
};


struct abc test()
{
	struct abc a1;
	a1.a='x';
	a1.b=10;
	a1.c=1.1;
	return a1;
}
int main()
{

	int x;
	x=test();
	cout<<x<<endl;
	return 0;
}

// This is an erroronius piece of code


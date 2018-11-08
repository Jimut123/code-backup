#include<iostream>
using namespace std;
int add(int,int);
int add(int,int,int);


int main()
{
	int x,y;
	x=add(10,20);
	y=add(30,40,50);
	cout<<x<<endl<<y<<endl;
	return 0;
}



int add(int a,int b)
{
	return a+b;
}
int add(int a,int b,int c)
{
	return (a+b+c);
}





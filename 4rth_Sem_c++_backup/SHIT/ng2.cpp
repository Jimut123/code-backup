// c++ program to find the quotient and mod of 2 numbers //

#include<iostream>
using namespace std;
int main()
{
	int a,b,qu,mod;
	cout<<"enter two numbers";
	cin>>a>>b;
	qu=a/b;
	mod=a%b;
	cout<<"the quotient is:" <<qu;
	cout<<"the remainder is:" <<mod;
}
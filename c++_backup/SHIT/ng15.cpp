#include <iostream>
using namespace std;
int main()
{
	int a,n;
	cout<<"enter the year";
	cin>>a;
	if(a%4==0||a%400==0)
	cout<<"this is leap year";
	else
	cout<<"this is not a leapyear";
	return 0;
}
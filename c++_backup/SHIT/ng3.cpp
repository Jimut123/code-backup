//c++ program to find the simple interest//

#include<iostream>
using namespace std;
int main()
{
	int p,r,t,s;
	cout<<"enter the principal,rate and time";
	cin>>p>>r>>t;
	s=(p*r*t)/100;
	cout<<"the simple interest is:"<<s;
}
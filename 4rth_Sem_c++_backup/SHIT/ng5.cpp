// c++ program to convert a certain temperature in celcius into fehrenhite//

#include<iostream>
using namespace std;
int main()
{
	int a,f;
	cout <<"enter the temperature in celcius";
	cin>>a;
	f=(9*a+160)/5;
	cout<<"the same temperature in fehrenhite is:"<<f;
	return 0;
}
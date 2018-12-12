//c++ program to find temperature in celcius from fehrenhite//

#include <iostream>
using namespace std;
int main()
{
	int a,c;
	cout<<"enter the  temperature in fehrenhite";
	cin>>a;
	c=(5*a-160)/9;
	cout <<"the temperature in celcius is:"<<c;
}
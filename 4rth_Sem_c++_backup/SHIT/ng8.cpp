//c++ program to solve a equation//

#include <iostream>
using namespace std;
int main()
{
	int a,b,c,sum;
	cout <<"enter three numbers";
	cin>>a>>b>>c;
	sum=((a*a*a)+(b*b*b)+(c*c*c))*((a*a*a)+(b*b*b)+(c*c*c));
	cout <<"the result of equation is:"<<sum;
}
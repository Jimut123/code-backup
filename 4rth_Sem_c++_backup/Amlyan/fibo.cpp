#include<iostream>
using namespace std;
int main()
{
	int c=0,a=0,count=2,n,b=1;
	cout << "\nEnter the no. of terms:\n";
	cin >> n;
	cout <<a<<' '<<b<<' ';
	while(count++ < n)
	{
		c = a + b;
		cout <<c<<' ';
		a = b;
		b = c;
	}
	return 0;
}

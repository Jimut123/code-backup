#include<iostream>
using namespace std;
// An example of pass by reference 
void swap(int &a,int &b)
{
	int t;
	t = a;
	a = b;
	b = t;
}

int main()
{
	int a,b;
	cout << "\n Enter values of a and b : \n";
	cin >> a;
	cin >> b;
	cout << "\n value of a "<<a<<"and b : "<<b<<" before swapping \n";
	swap(a,b);	// operating the swap function here
	cout << "\n value of a "<<a<<"and b : "<<b<<" after swapping \n";
	return 0;
}



#include<iostream>
#include "myLib.h"
#include "myLib.cpp"
using namespace std;
int main()
{
	int x;
	cout << "\nEnter the value of the number which you want to find the square and cube :";
	cin >> x;
	cout <<"\nSquare of "<<x<<" is : "<<square(x);
	cout <<"\nCube of "<<x<<" is : "<<cube(x);
	return 0;
}

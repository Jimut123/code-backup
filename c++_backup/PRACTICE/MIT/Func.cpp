// To use function

// To make a function raised to the power of
#include<iostream>
using namespace std;
int raiseToPower(int a , int b)
{
	int i,pow=1;
	for(i=1;i<=b;i++)
	{
		pow=pow*a;
	}
	return pow;
}

int main()
{
	int a,b,pow;
	cout << "\nEnter the two numbers a and b (a^b) : ";
	cin >>a;
	cin >>b;
	pow = raiseToPower(a,b);
	cout << "\n"<< a ;
	cout <<" raised to the power "<< b ;
	cout <<" is : "<<pow<<endl;
	return 0;
}



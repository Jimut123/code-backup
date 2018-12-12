#include<iostream>
using namespace std;

void squareByPtr(int *numPtr)
{
	*numPtr = *numPtr * *numPtr;
}


int main()
{

	int x = 5;
	squareByPtr(&x);
	cout << x << endl;    // Prints 25
	return 0;
}




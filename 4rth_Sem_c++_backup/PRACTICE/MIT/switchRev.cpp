#include<iostream>
using namespace std;
int main()
{
	int x;
	cout << "\nEnter the value of x : \n";		//<<endl;
	cin >> x;
	switch(x)
	{
		case 1:
			cout << "\nx is 1\n";
				break;
		case 2:
		case 3:
			cout <<  "\nx is 2 or 3\n";
				break;
		default:
			cout <<"\nx is not 1,2 or 3\n";
				break;
	}
	return 0;
}


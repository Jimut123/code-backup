#include<iostream>
using namespace std;

template <class T, class U>
bool are_equal(T a, U b)
{
	return (a==b);
}


int main()
{
	//are_equal<int,double>(10,10.0)
	if(are_equal(10,10.0))
		cout<<"x and y are equal\n";
	else
		cout<<"x and y are not equal \n";
	return 0;
}




#include<iostream>
using namespace std;

class A
{
	int a;
	public:
		A()
		{
			a = 0;
			cout<<"Default";
		}	
		A(int m = 0)
		{
			a=m;
		}
};

int main()
{
	A a;
	//a();
	return 0;
}


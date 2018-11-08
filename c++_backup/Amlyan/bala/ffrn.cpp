// friend function is not in the scope of the class in which it has been defined...
#include<iostream>
using namespace std;

class f
{
	public:
		void d();
		friend void add();
};

void f::d()
{
	add();
}
void add()
{
	int a=1,b=2;
	cout<<a+b<<endl;
}
int main()
{
	f obj;
	obj.d();
	return 0;
}








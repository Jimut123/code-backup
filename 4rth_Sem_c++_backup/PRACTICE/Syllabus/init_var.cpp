#include<iostream>
#include<typeinfo>
using namespace std;
int main()
{
	int  a(5),b{50};
	cout<<"a = "<<a<<" b = "<<b;
	auto abr = a;
	cout<<"Type of abr = "<<typeid(abr).name()<<endl;
	return 0;
}





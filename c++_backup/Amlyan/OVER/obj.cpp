#include<iostream>
#include<cmath>
using namespace std;
class obj
{
	//int a;
	public:
		int a;
		obj();
		obj(int);
		obj(obj&);
};
obj::obj()
{
	a=0;
}
obj::obj(int d)
{
	a=d;
}
	
obj::obj(obj& u)
{
	a=u.a;
}

int main()
{
	obj o1;
	cout<<o1.a;
	cout<<"\nEnter a value\n";
	int p=0;
	cin>>p;
	obj o2(p);
	obj o3(o2);
	obj o4;
	o4=o2;
	cout<<"\nobj o4 "<<o4.a;
	cout<<"\nobj o3 "<<o3.a;
	o2.a++;
	cout<<"\nobj o4 "<<o4.a;
	cout<<"\nobj o3 "<<o3.a;
	
	cout<<"\n================="<<endl;
	cout<<&o1<<endl;
	cout<<&o2<<endl;
	cout<<&o3<<endl;
	cout<<&o4<<endl;
	return 0;
}

	
	

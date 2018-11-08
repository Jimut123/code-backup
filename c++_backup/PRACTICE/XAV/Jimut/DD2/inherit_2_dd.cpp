#include<iostream>
using namespace std;

class Base
{
	public:
	int a[10],n;
	public:
		Base(int no)
		{
			cout<<"\n Base class constructor created!"<<endl;
			n=no;
		}
		friend istream & operator >>(istream &,Base &);

};

istream & operator >>(istream & in,Base & obj)
{
	int i;
	for(i=0;i<Base::n;i++)
	{
		cin>>obj.a[i];
	}
	return cin;
}


class Derived : public Base 	// inheriting the Base class
{
	public:
		void sorting();
		friend ostream & operator <<(ostream &,Derived &);
};

ostream & operator <<(ostream & out,Derived & obj)
{
	int i;
	for(i=0;i<Base::n;i++)
	{
		out<<obj.a[i];
	}
	return out;
}


int main()
{
	cout<<"\n Enter the total no. of elements present in the array : \n"<<endl;
	cin>>n;
	Base B(n);
	Derived D;
	cin>>B;
	cout<<D;
	return 0;
}











#include<iostream>
using namespace std;

class constr
{
	int k,l;
	public:
		constr();
		constr(int m,int n);
		constr(constr & obj);
};
constr ::constr()
{
	k=0;l=0;
	cout<<"The default constructor initialized with values "<<k<<" "<<l<<endl;
} 

constr ::constr(int m,int n)
{
	k=m;l=n;
	cout<<"The parameterized constructor initialized with values "<<k<<" "<<l<<endl;
}
constr::constr(constr & obj)
{
	k=obj.k;
	l=obj.l;
	cout<<"The object constructor initialized with values "<<k<<" "<<l<<endl;
}

int main()
{
	constr c;
	constr c2(2,30);
	constr c4(300,39);
	constr c1(c4);
	return 0;
}




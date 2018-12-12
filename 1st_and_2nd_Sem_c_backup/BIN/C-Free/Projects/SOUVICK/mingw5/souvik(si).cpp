#include"iostream.h"
int main()
{
	int p,r,t,si,amt;
	cout<<"enter data:"<<endl;
	cin>>p;
	cin>>r;
	cin>>t;
	si=(p*r*t)/100;
	amt=p+si;
	cout<<si<<endl;
	cout<<p<<endl;
	return 0;
}
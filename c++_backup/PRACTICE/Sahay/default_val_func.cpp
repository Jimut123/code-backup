#include<iostream>
using namespace std;

//int add(int a=0,int b=0,int c=0);  //can be also written/initialize as this
int add(int=0,int=0,int=0);
int main()
{
	int a = 10,b = 10,c = 10;
	//cout<<"\n Enter the three values :\n"
	//cin>>a;
	//cin>>b;
	//cin>>c;
	cout<<"a+b+c : "<<add(a,b,c)<<endl;
	cout<<"a+b : "<<add(a,b)<<endl;
	cout<<"a : "<<add(a)<<endl;
	cout<<"a+c : "<<add(a,0,c)<<endl;
	return 0;
}

int add(int a, int b, int c)
{
	return (a+b+c);
}





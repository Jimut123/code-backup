#include<iostream>
using namespace std;

class ovr
{
	public:
		void ovr1(int f);
		void ovr1(float f);
		void ovr1(double d);
		
};
void ovr::ovr1(int f)
{
	cout<<"This is the integer value :: "<<f<<endl;
}
void ovr::ovr1(float f)
{
	cout<<"This is the float value :: "<<f<<endl;
}
void ovr::ovr1(double d)
{
	cout<<"This is the double value :: "<<d<<endl;
}
int main()
{
	int in;
	ovr ovr_obj;
	float fl;
	double dbl;
	cout<<"\n Enter the integer value :: "<<endl;
	cin>>in;
	cout<<"\n Enter the float value :: "<<endl;
	cin>>fl;
	cout<<"\n Enter the double value :: "<<endl;
	cin>>dbl;
	ovr_obj.ovr1(in);
	ovr_obj.ovr1(fl);
	ovr_obj.ovr1(dbl);
	return 0; 
}



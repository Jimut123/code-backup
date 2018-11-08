#include<iostream>
using namespace std;

class Distance
{
	int m,cm;
	public:
		Distance();
		Distance(int,int);
		~Distance();
		void display();
		friend int operator>(Distance &,Distance &);
};

int operator>(Distance & obj1,Distance & obj2)
{
	if(obj1.m>obj2.m )
		return	1;
	else if(obj1.cm>obj2.cm && obj1.m<obj2.m)
		return 0;
	if (obj1.m<obj2.m)
		return 0;
		
}
Distance ::Distance()
{
	cout<<"DC"<<endl;
	m=0;
	cm=0;
}
Distance::Distance(int m,int cm)
{
	cout<<"PC"<<endl;
	Distance::m=m;
	Distance::cm=cm;
}
Distance::~Distance()
{
	cout<<"Destructor"<<endl;
}

void Distance::display()
{
	cout<<"Meter : "<<m<<" centimeter : "<<cm<<endl;
}
int main()
{
	Distance D1(2,78),D2(2,49);
	if(D1>D2)
		cout<<"First one is larger "<<endl;
	else
		cout<<"Second one is larger "<<endl;
	return 0;
}





#include<iostream>
using namespace std;

class dbc;
class abc;
class abc: public dbc
{
	public:
	int x,y;
	//public:
		abc()
		{
			x=1;
			y=2;
		}
		friend void sum(dbc,abc);
		
};
class dbc 
{
	protected:
	int a,b;
	public:
		dbc()
		{
			a=5;
			b=6;
		}
	
};

void sum(dbc a1,abc b)
{
	cout<<a1.a+b.x;
}


int main()
{
	abc a6;
	dbc b6;
	//ostream ob;
	sum(b6,a6);
	return 0;
}











#include<iostream>
using namespace std;

class opvr
{
	public:
		int x,y;
		opvr();
		void operator++();
		void operator++(int );//b=1);
};
opvr::opvr()
{
	x=0;
	y=0;
}
void opvr::operator++()
{
	//x=x+1;
	//y=y+1;
}

void opvr::operator++(int)
{
	++x;
	++y;
}

int main()
{
	opvr obj;
	obj++;
	cout<<"First = "<<obj.x<<"\t"<<obj.y<<endl;
	++obj;
	cout<<"Second = "<<obj.x<<"\t"<<obj.y<<endl;
	return 0;
}







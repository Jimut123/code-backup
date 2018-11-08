#include<iostream>
using namespace std;


class item
{
	static int count;	// single copy for all the objects is created for a,b and c
				// initialized by 0, no garbage value
	int member;
    public:
	void getdata(int a)
	{
		member = a;
		count++;
	}
	void getcount(void)
	{
		cout<<" Count "<<count<<endl;
	}
};

int item::count;


int main()
{
	item a,b,c;
	a.getcount();
	b.getcount();
	c.getcount();
	a.getdata(100);
	b.getdata(200);
	c.getdata(300);
	a.getcount();
	b.getcount();
	c.getcount();
	return 0;
}






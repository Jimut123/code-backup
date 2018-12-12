#include<iostream>
using namespace std;

class integer
{
	int m,n;
    public:
	integer(int,int);
	void display(void)
	{
		cout<<"m = "<<m<<endl;
		cout<<"n = "<<n<<endl;
	}
};
integer::integer(int x,int y)
{
	m=x;
	n=y;
}

int main()
{
	integer integer1(0,100);
	integer integer2 = integer(25,75);
	integer1.display();
	integer2.display();
	return 0;
}






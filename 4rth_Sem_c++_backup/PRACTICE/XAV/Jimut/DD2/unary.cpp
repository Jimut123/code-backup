#include<iostream>
using namespace std;

class un
{
	int a;
	public:
		un()
		{ 
			a=0;
			cout<<"Default constructor"<<endl;
		}
		un(int a)
		{
			un::a=a;
			cout<<"Parameterized const"<<endl;
		}
		void display();
		void operator-(un &)
};
void un::operator-(un & obj)
{
	obj.a = -obj.a;
}

void un::display()
{
	cout<<"a = "<<a<<endl;
}
int main()
{
	un u(7);
	u.display();
	-u;
	u.display();
	return 0;
}



#include<iostream>
using namespace std;

class a_
{
	//public:
	int a,b;
	public:
		void put(int k,int l)
		{
			a=k; b=l;
		}
		/**void add()
		{
			
		}**/
		a_()
		{
			a=1;
			b=2;
		}
		void show()
		{
			cout<<"a = "<<a<<"b = "<<b<<endl;
		}
	
};


int main()
{	
	a_ a1,b1,c1;
	//a b1;
	//a c1;
	a1.put(50,100);
	a1.show();
	b1.show();
	//c1 = a1+b1;
	//c1.a = a1.a+b1.a;
	//c1.b = a1.b+b1.b;
	c1.show();	
	return 0;
}




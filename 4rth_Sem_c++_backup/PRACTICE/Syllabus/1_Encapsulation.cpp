#include<iostream>
using namespace std;


class Encapsulation
{
	private:
		int x;		// This variable x is made private and can be modified only by using the
				// function get and set 
	public:
		void set(int a)
		{
			x=a;
		}
		int get()
		{
			return x;
		}
};




int main()
{
	Encapsulation obj;
	obj.set(5);
	cout<<obj.get();
	return 0;
}




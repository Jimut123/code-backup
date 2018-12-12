#include<iostream>
#include<cmath>
using namespace std;
class lcm
{
	int a, b;
	public:
		void input()
		{
			cout<<"Enter 2 numbers";
			cin>>a;
			cin>>b;
		}
		void lcm1()
		{
			int l=a;
			for(int i=1;i<=b;i++)
			{
				l=a*i;
				if(l%b==0)
				{
					break;
				}
			}
			cout<<"lcm= "<<l;
		}
};
int main()
{
	lcm l;
	l.input();
	l.lcm1();

}
	

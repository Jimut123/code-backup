#include<iostream>
#include<cmath>
using namespace std;
class squareroot
{
	float n;
	public:
	void input()
	{
		cout<<"Enter a number";
		cin>>n;
	}
	void sqroot()
	{
		int ten=1;
		float a=1;
		float b=1;
		for (int i=1;i<9;i++)
		{
			ten=10*ten;
			for(int i=a;i<(a+10*b);i=i+b)
			{
				
				if(i*i>n)
				{
					b=1/ten;
					break;
				}
				a=i;
			}
		}
		cout<<"\n"<<(a+b);
	}
};
int main()
{
	squareroot s;
	s.input();
	s.sqroot();
}


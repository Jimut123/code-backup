#include<iostream>
#include<cmath>
using namespace std;
class pattern2
{
	int n;
	public:
		void input()
		{
			cout<<"Enter a number";
			cin>>n;
		}
		void pattern()
		{
			for(int i=1;i<=n;i++)
			{
				cout<<i<<" ";
			}
			cout<<"\n";
			for(int i=2;i<n;i++)
			{
				cout<<i<<"  ";
				for(int j=2;j<n;j++)
				{
					cout<<"  ";
				}
				cout<<"\b"<<(n-i+1);
				cout<<"\n";
			}
			for(int i=n;i>0;i--)
			{
				cout<<i<<" ";
			}
		}
};
int main()
{
	pattern2 p;
	p.input();
	p.pattern();
}

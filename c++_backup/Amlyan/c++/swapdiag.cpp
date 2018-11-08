#include<iostream>
#include<cmath>
using namespace std;
class swapdiag
{
	int a[5][5], n;
	public:
		void input()
		{
			n=5;
			cout<<"Enter the elements in the array";
			for(int i=0;i<n;i++)
			{
				for (int j=0;j<n;j++)
				{
					cin>>a[i][j];
				}
			}
		}
		void swapping()
		{
			cout<<"array  before swapping\n";
			print();
			
			for (int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==j)
					{
						int c=a[i][j];
						a[i][j]=a[i][n-j-1];
						a[i][n-j-1]=c;
					}
				}
			}
			cout<<"array after swapping\n";
			print();
		}
		void print()
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					cout<<a[i][j]<<" ";
				}
				cout<<"\n";
			}
		}
};
int main()
{
	swapdiag s;
	s.input();
	s.swapping();
}

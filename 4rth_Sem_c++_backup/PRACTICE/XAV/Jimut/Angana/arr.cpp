using namespace std;
#include<iostream>
#include<cmath>
class array1
{
    public:	
	int a[100];
	int n;
	void input()
	{
		cout<<"Enter a number... the number of elements in the array";
		cin>>n;
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
	}
	int max()
	{
		int max=a[0];
		for(int i=1;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	int min()
	{
		int min=a[0];
		for(int i=1;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
	int sum()
	{
		int s=0;
		for(int i=0;i<n;i++)
		{
			s=s+a[i];
		}
		return s;
	}
};
int main()
{
	array1 obj;
	obj.input();
	cout<<"\nThe max is "<<obj.max();
	cout<<"\nThe min is "<<obj.min();
	cout<<"\nThe sum of the elements is "<<obj.sum();
	cout<<"\nThe average is "<<(obj.sum()/obj.n);
}
	

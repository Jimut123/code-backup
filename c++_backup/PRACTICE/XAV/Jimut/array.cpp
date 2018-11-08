#include<iostream>
using namespace std;
int a[100];
class Array
{
	public:
	void sum(int n)
	{
		int sum=0,i;
		for(i=0;i<n;i++)
			sum = sum+a[i];
		cout<<"\n Sum = "<<sum<<endl;
		float avg=sum/n;
		cout<<"\n Average = "<<avg<<endl;
	}
	void max_min(int n)
	{
		int i;
		int max = a[0];
		int min = a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];	
		}
		cout<<"\n maximum = "<<max<<" minimum = "<<min;
	}
};

int main()
{
	int i,n;
	cout<<"Enter n :\n";
	cin>>n;
	for(i=0;i<n;i++)
		cin>>a[i];
	Array obj;
	obj.sum(n);
	obj.max_min(n);
	return 0;
}



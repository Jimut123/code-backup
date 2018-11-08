#include<iostream>
#include<cmath>
using namespace std;
class fd
{
	float arr[100][100];
	public:
	void forward();
	void display(int);
};
void fd::forward()
{
	cout<<"Enter the value of intervals \n";
	int n=0;
	cin>>n;
	cout<<"\nEnter the data in the format x <enter> y\n";
	for(int i=0;i<n;i++)
	{
		cin>>arr[i][0];
		cin>>arr[i][1];
	}
	int m=n-1;
	for(int j=2;j<n+1;j++)
	{
		for(int i=0;i<m;i++)
		arr[i][j]=arr[i+1][j-1]-arr[i][j-1];
		m--;
	}
	display(n);
}
void fd::display(int n)
{
	cout<<"\nThe difference table is\n";
	cout<<"x\tf(x)\t";
	for(int i=2;i<n+1;i++)
	cout<<"f"<<i<<"(x)\t";
	cout<<"\n";
	int m=n;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=n&&j<=m;j++)
		{
			cout<<arr[i][j]<<"\t";
		}
		m--;
		cout<<endl;
	}
}
int main()
{
	fd ob;
	ob.forward();
	return 0;
}

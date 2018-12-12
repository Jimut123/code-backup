using namespace std;
#include<iostream>
#include<cmath>
class fp
{
     public:
	int a;
	void fpfunc()
	{
		cout<<"Enter a  number";
		cin>>a;
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		cout<<"\n The sum is: "<<sum; 
	}
};
int main()
{
	fp obj;
	obj.fpfunc();
	int d=0;
	return 0;
}



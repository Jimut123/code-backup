#include<iostream>
using namespace std;
// to return the LCM of a number
int main()
{
	int a,b,i;
	cout<<"\n Enter two numbers :\n"<<endl;
	cin>>a;
	cin>>b;
	for(i=1;i<=b;i++)
	{
		if(a*i%b == 0)
		{
			cout<<"LCM = "<<a*i<<endl;
			break;
		}
	}
	return 0;
}

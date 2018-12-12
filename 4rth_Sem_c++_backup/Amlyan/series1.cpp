#include<iostream>
#include<cmath>
using namespace std;
/*  1^1   3^3   5^5
*s =___  + ___ + ___ + ......
*   1!    3!    5!
*/
int fact(int n)
{
	int f=1;
	for(int i=1;i<=n;i++)
	{
		f=f*i;
	}
	return f;
}
int main()
{
	int i,m;
	float s=0.0,f=0.0;
	cout <<"\n Enter the total number (limit) :\n"<<endl;
	cin >> m;	
	for(i=1;i<m;i+=2)
	{
		f=(float)fact(i)/pow(i,i);
		s=s+f;
	}
	cout << "sum = "<<s<<endl;
	return 0;
}

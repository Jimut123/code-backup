#include<iostream>
using namespace std;


int a[20][20];
int main()
{
	int i,j,n;
	float m;
	cin>>n;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n+1;j++)
		{
			cin>>a[i][j];
		}
	}

	for(i=0;i<n;i++)
	{
		for(j=0;j<n+1;j++)
		{
			m = a[i+1][j]/a[i][j];
			a[i][j] = 	
			
		}
	}
	return 0;
}


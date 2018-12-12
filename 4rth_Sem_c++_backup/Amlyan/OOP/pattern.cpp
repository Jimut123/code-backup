#include<iostream>
using namespace std;
int main()
{
	int i,n,j;
	int a[20][20];
	cout<<"\n Enter the number:\n"<<endl;
	cin>>n;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			
			if(j==0||i==0)
			{		
				a[i][j]=i+j+1;	
			}	
			else if(i==n-1||j==n-1)
			{
				a[i][j]=2*n-i-j-1;
			}
			else
			{
				a[i][j]=0;
			}	
			
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(a[i][j]!=0)
			{
				cout<<a[i][j]<<"\t";		
			}
			else
			{
				cout<<"\t";
			}
		}
		cout<<endl;
	}
	return 0;
}

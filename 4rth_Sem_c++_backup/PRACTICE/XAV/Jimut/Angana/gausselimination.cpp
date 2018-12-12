using namespace std;
#include<iostream>
#include<cmath>
class gausselimination
{
public:
	float a[100][100];
	int n;
	float X[100];
	void input()
	{
		cout<<"Enter the number of unknowns";
		cin>>n;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				cin>>a[i][j];
			}
		}
	}
	void gmatrix()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=i;k<=n;k++)
				{
					a[j][k]=a[j][k]-a	

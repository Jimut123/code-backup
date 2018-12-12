using namespace std;
#include<iostream>
class gauss
{
	public:
		int n;
		float a[10][20];
		float b[10];
		void input()
		{
			cin>>n;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<2*n;j++)
				{
					if(j==n+1)
					{
						a[i][j]=1;
						cin>>b[i];
					}
					else if(j!=n&&j>=n)
					{a[i][j]=0;}
					else
					{cin>>a[i][j];}
				}
			}
		}
		void matrix()
		{
				for(int i=0; i<n;i++)
				{
					for(int count=0;count<2*n;count++)
					{
						float f=a[i][count]/a[i][i];
						a[i][count]=f;
						
					}
					for(int j=i+1;j<n;j++)
					{
						for(int k=i;k<2*n;k++)
						{
							float m=a[j][i]*a[i][k];
							a[j][k]=a[j][k]-m;
						}
					}
				}
				for(int i=n-2;i>=0;i--

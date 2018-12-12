#include<iostream>
#include<cmath>
using name space std;
class matrixmultiplication
{
	public:
		matrixmultiplication(int m, int n, int a[][])
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					a[i][j]=0;
				}
			}
		}
		void multiply(int a[][], int b[][], int c[][], int m, int n, int p)
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<p;j++)
				{
					int sum=0;
					for(int k=0;k<n;k++)
					{
						sum=sum+a[i][k]*b[k][j];
					}
					c[i][j]=sum;
				}
			}
		}
};
int main()
{
	
}

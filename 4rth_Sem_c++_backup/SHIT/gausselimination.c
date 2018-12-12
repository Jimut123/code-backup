#include"stdio.h"
void upper(double a[100][100],int);
void back(double a[100][100],double x[100],int);
double a[100][100],x[100],sum=0.0,c;
int n;
void main()
{
int i,j;
printf("\n enter order of matrix:");
scanf("%d",&n);
printf("\n enter the elements agumented matrix row-wise:");	
for(i=0;i<n;i++)
{
for(j=0;j<=n;j++)
{
	scanf("%d",&a[i][j]);
}
}
upper(a,n);
back(a,x,n);
}
void upper(double a[100][100],int n)
{
	int i,j,k;
	c=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
	if(i>j)
	{
		c=a[i][j]/a[j][j];
		for(k=0;k<=n;k++)
		{
			a[i][k]=a[i][k]-c*a[j][k];
		}
	}
}
}
	
}
void back(double a[100][100],double x[100],int n)
{
int i,j;
	x[n-1]=a[n-1][n]/a[n-1][n-1];
	for(i=n-2;i>=0;i--)
	{
		sum=0;
		for(j=i+1;j<=n;j++)
		{
			sum=sum+a[i][j]*x[j];
		}
		x[i]=(a[i][n]-sum)/a[i][i];
	}
	printf("\n the solution is:");
	for(i=0;i<n;i++)
	{
		printf("\n %d=%lf\t",i,x[i]);
	}
}

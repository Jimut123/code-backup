	//q9as1.cpp : Write a program to implement
	//Least square Fit method
	using namespace std;
	#include<iostream>
	class Least
	{
	public:
	void least(float x[50],float y[50],int m, int n);
      void gauss_elimination(float a[10][10],float b[10],int n);
	};
void Least :: least(float x[50],float y[50],int m, int n)
	{
	float a[10][10],b[10],s1,s2,p;
	int i,j,k,k1,k2;
	//To calculate coefficient matrix a[][]
		for(i=0;i<=n;i++)
			for(j=0;j<=n;j++)
			{
			k=i+j;
			s1=0;
				for(k1=0;k1<m;k1++)
				{
				p=1;
					for(k2=1;k2<=k;k2++)
					p=p*x[k1];
				s1=s1+p;
				}
			a[i][j]=s1;
			}
	//To calculate coefficient b[]
		for(i=0;i<=n;i++)
		{
		k=i;
		s2=0;
			for(k1=0;k1<m;k1++)
			{
			p=1;
				for(k2=1;k2<=k;k2++)
				p=p*x[k1];
			s2=s2+p*y[k1];
			}
		b[i]=s2;
		}
	//To display co-efficients
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n;j++)
			cout<<a[i][j]<<"\t";
		cout<<b[i]<<endl;
		}
	gauss_elimination(a,b,n+1);
	
	}
void Least:: gauss_elimination(float a[10][10], float b[10],int n)
	{
	float x[10],am;
	float s;
	int i,j,k;
	//To form triangular equations
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				if(i != j)
				{
				am=a[j][i]/a[i][i];
					for(k=0;k<n;k++)
				a[j][k]=a[j][k]-a[i][k]*am;
				b[j]=b[j]-b[i]*am;
				}
	//Back substitution method starts
	x[n-1]=b[n-1]/a[n-1][n-1];
		for(i=n-2;i>=0;i--)
		{
		s=0;
			for(j=i+1;j<n;j++)
			s=s+a[i][j]*x[j];
		x[i]=(b[i]-s)/a[i][i];
		}
	cout<<endl<<"Solutions are--->\n";
		for(i=0;i<n;i++)
		cout<<"a-"<<i<<" ="<<x[i]<<endl;
	}

	int main()
	{
	float x[50],y[50];
	int i,n,m;
	system("clear");
	cout<<endl<<"Enter number of points(1-50)=";
	cin>>m;
	cout<<endl<<"Enter x-points, y-points one by one--->\n";
		for(i=0;i<m;i++)
		{
		cout<<"x["<<i<<"]=";
		cin>>x[i];
		cout<<"y["<<i<<"]=";
		cin>>y[i];
		}
	cout<<"Enter degree of polynomial=";
	cin>>n;
	Least L;
	L.least(x,y,m,n);
	return 0;
	}

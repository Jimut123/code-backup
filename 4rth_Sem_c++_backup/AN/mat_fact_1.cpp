	//mat_fact_1.cpp : Write a program to implement Matrix Factorization method
	using namespace std;
	#include<iostream>
	class MAT_FACT
	{
	public:
	void mat_fact(float a[10][10],float b[10],float x[10],int n);
	void display(float a[10][10],int n);
	};
	void MAT_FACT :: mat_fact(float a[10][10],float b[10],float x[10],int n)
	{
	float l[10][10],u[10][10],s;
	float y[10];
	int i,j,k;
	//To initialize l[][] and u[][] to 0
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
			{
			l[i][j]=0;
			u[i][j]=0;
			}
	//To construct l[][] and u[][] matrix
		for(i=0;i<n;i++)
		{
		l[i][i]=1;
			for(j=0;j<n;j++)
				if(i>j)
				{
				s=0;
					for(k=0;k<j;k++)
					s=s+l[i][k]*u[k][j];
				l[i][j]=(a[i][j]-s)/u[j][j];
				}
				else if(i<=j)
				{
				s=0;
					for(k=0;k<i;k++)
					s=s+l[i][k]*u[k][j];
				u[i][j]=a[i][j]-s;
				}
		}
	cout<<endl<<"Elements in l[][] Matrix--->\n";
	display(l,n);
	cout<<endl<<"Elements in u[][] Matrix--->\n";
	display(u,n);
	//To calculate y[] from l[][] using forward subtitution method
	y[0]=b[0];
		for(i=1;i<n;i++)
		{
		s=0;
			for(j=0;j<i;j++)
			s=s+l[i][j]*y[j];
		y[i]=b[i]-s;
		}
	//To calculate x[] from u[][] using backward substitution method
	x[n-1]=y[n-1]/u[n-1][n-1];
		for(i=(n-2);i>=0;i--)
		{
		s=0;
			for(j=(i+1);j<n;j++)
			s=s+u[i][j]*x[j];
		x[i]=(y[i]-s)/u[i][i];
		}
	}
	void MAT_FACT :: display(float a[10][10],int n)
	{
	int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			cout<<a[i][j]<<"\t";
		cout<<endl;
		}
	}

	int main()
	{
	float a[10][10],b[10],x[10];
	int i,j,n;
	system("clear");
	cout<<"Enter number of equations(1-10)=";
	cin>>n;
	cout<<"Enter coefficients of all equations--->\n";
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			cout<<"a["<<i<<"]["<<j<<"]=";
			cin >>a[i][j];
			}
		cout<<"b["<<i<<"]=";
		cin>>b[i];
		}
	MAT_FACT MF;
	MF.mat_fact(a,b,x,n);
	cout<<endl<<"Roots are -->\n";
		for(i=0;i<n;i++)
		cout<<"x["<<i<<"]="<<x[i]<<endl;
	return 0;
	}

			

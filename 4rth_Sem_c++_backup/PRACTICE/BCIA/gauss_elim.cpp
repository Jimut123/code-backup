#include<iostream>
using namespace std;

/**

The matrix :
3
5 1 3 7
1 5 1 7
1 1 5 7


**/

class Gauss_Elim
{
	 double a[10][10],b[10],x[10];
	 int n;
	public:
		void input();
		void calc();
		void display();

};

void Gauss_Elim :: calc()
{
	int i,j,k;
	double m1;
	
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			m1 = a[j][i]/a[i][i];
			for(k=0;k<n;k++)
			{
				a[j][k] -= m1*a[i][k]; 
			}
			b[j] -= m1*b[i];
		}
		display();
	}
	
	
	for(i=n-1;i>=0;i--)
	{
		x[i]=b[i];
		for(j=i+1;j<n;j++)
		{
			x[i] -= a[i][j] * x[j];
		}
		x[i] /= a[i][i];
	}
	
	cout<<"\n The roots are :: \n"<<endl;
	for(i=0;i<n;i++)
		cout<<x[i]<<endl;
}

void Gauss_Elim :: display()
{
	int i,j;
	cout<<endl;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			cout<<a[i][j]<<"\t";
		}
		cout<<b[i]<<endl;
	}
	cout<<endl;
}

void Gauss_Elim :: input()
{
	int i,j;
	cout<<"\n Enter the size of the row and columns :"<<endl;
	cin>>n;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			cout<<"\n Enter the a[i][j] values :: "<<endl;
			cin>>a[i][j];
		}
		cout<<"\n Enter the b value :: "<<endl;
		cin>>b[i];
	}
	display();
}



int main()
{
	Gauss_Elim GE;
	GE.input();
	GE.calc();
	return 0;
}

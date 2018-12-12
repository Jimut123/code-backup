using namespace std;
#include<iostream>
#include<cmath>
class jacobi
{
	float a[10][10];
	float x[10];
	int n;
	float b[10];
	float E[10];
 public:
	void input();
	void display();
	void jac();
	void displayx();
};
void jacobi::input()
{
	cout<<"Enter the number of unknowns, n \n";
	cin>>n;
	cout<<"Enter your ccoeff augmented matrix \n";
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if(j==n)
			{
			  cin>>b[i];
			}
			else
			{
			  cin>>a[i][j];
			}
		}
	}
	cout<<"\nThe entered matrix is : \n";
	display();
}
void jacobi::display()
{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=n; j++)
		{
			if(j==n)
			{
			 cout<<"= "<<b[i]<<"\n";
			}
			else
			{	
			cout<<a[i][j]<<"x"<<(i+1)<<"\t";
			}
		}
	}
}
void jacobi::displayx()
{
	for(int i=0;i<n;i++)
	{cout<<x[i]<<",";}
	cout<<endl;
}
void jacobi::jac()
{
	for(int i=0;i<n;i++)
	{x[i]=0;}
	int flag=0;
	while(!flag)
	{
		for(int i=0;i<n;i++)
		{
			float sum=0;
			for (int j=0;j<n;j++)
			{
				if(j!=i)
				{sum=sum+a[i][j]*x[j];}	
			}
			float f=(b[i]-sum)/a[i][i];
			E[i]=f-x[i];
			x[i]=f;
			
			if(E[i]>-0.0001&&E[i]<0.0001)
                        {flag=1;}
                        else
                        {flag=0;}
		}
		
	}
	displayx();
}
int main()
{
	jacobi ob;
	ob.input();
	ob.jac();
	return 0;
}

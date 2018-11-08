using namespace std;
#include<iostream>
#include<cmath>
class matinv
{
	float a[10][10];
	float l[10][10];
	float u[10][10];
	float b[10];
	float y[10];
	float x[10];
	int n;
public:
	void factorise();
	void input();
	void display();
	void displayx(float[10][10]);
};
void matinv::input()
{
	cout<<"Enter the number of unknowns\n";
	cin>>n;
	cout<<"Enter the elements in the matrix";
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if(j==n)
			{cin>>b[i];}
			else
			{cin>>a[i][j];}
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			 if(i<j)
			{l[i][j]=0;}
			else
			{u[i][j]=0;}
		}
	}

}
void matinv::displayx(float m[10][10])
{
	for(int i=0;i<n;i++)
	{for(int j=0;j<n;j++)
	 {cout<<"  "<<m[i][j];}
	cout<<"\n";
	}
}	
void matinv::factorise()
{
for(int i=0;i<n;i++)
{u[0][i]=a[0][i];}



	for(int i=1;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j)
			{l[i][j]=1;}
			if(i<=j)
			{float sum=0;
				for(int k=0;k<n;k++)
				{sum+=l[i][k]*u[k][i];}
			 u[i][j]=a[i][j]-sum;}
			if(i>j)
			{float sum=0;
                                for(int k=0;k<n;k++)
                                {sum+=l[i][k]*u[k][j];}
                         float t=a[i][j]-sum;
			 l[i][j]=t/u[j][j];}
		}
	}
	displayx(a);
	displayx(l);
	displayx(u);
	
	y[0]=b[0];
	for(int i=1;i<n;i++)
	{float sum=0;
		for(int j=0;j<i+1;j++)
		{
			if(j!=i)
			{sum+=l[i][j]*b[j];}
		}
	 y[i]=b[i]-sum;
	}
	x[n-1]=y[n-1];
	for(int i=n-2;i>=0;i--)
	{
	float sum=0;
                for(int j=n-1;j>=0;j--)
                {
                        if(j!=i)
                        {sum+=u[i][j]*y[j];}
                }
         float s=y[i]-sum;
	 x[i]=s/u[i][i];
	}
}
void matinv::display()
{
	cout<<"mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm\n";
	for(int i=0;i<n;i++)
	{cout<<x[i]<<" ";}
}
int main()
{
	matinv obj;
	obj.input();
	obj.factorise();
	obj.display();
	return 0;
}


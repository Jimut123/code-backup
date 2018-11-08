	//q52as1.cpp : Write a program to implement
	//Lagrange Interpolation method
	using namespace std;
	#include<iostream>
	class Lagrange
	{
	public:
	float lagrange(float x[50],float y[50],float xx, int n);
	};
float Lagrange :: lagrange(float x[50],float y[50],float xx, int n)
	{
	float diff_matrix[50][50], num1,den1,yy;
	int i,j;
	//To construct diff_matrix
		for(i=0;i<n;i++)	
			for(j=0;j<n;j++)
				if(i==j)
				diff_matrix[i][j]=xx-x[i];
				else
				diff_matrix[i][j]=x[i]-x[j];
	//To display diff_matrix
	cout<<endl<<"Elements in Difference Matrix--->\n";
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			cout<<diff_matrix[i][j]<<"\t";
		cout<<endl;
		}
	//To calculate yy at x=xx
	yy=0;
		for(i=0;i<n;i++)
		{
		num1=1;
		den1=1;
			for(j=0;j<n;j++)
				if(i!=j)
				{
				num1=num1*diff_matrix[j][j];
				den1=den1*diff_matrix[i][j];
				}
		yy=yy+num1/den1*y[i];
		}
	cout<<"xx="<<xx<<" yy="<<yy<<endl;
	return yy;
	}
	int main()
	{
	float x[50],y[50],xx,yy;
	int i,n;
	system("clear");
	cout<<endl<<"Enter number of points(1-50)=";
	cin>>n;
	cout<<endl<<"Enter x-points, y-points one by one--->\n";
		for(i=0;i<n;i++)
		{
		cout<<"x["<<i<<"]=";
		cin>>x[i];
		cout<<"y["<<i<<"]=";
		cin>>y[i];
		}
	cout<<"Enter xx=";
	cin>>xx;
	Lagrange L;
	yy=L.lagrange(x,y,xx,n);
	return 0;
	}




		







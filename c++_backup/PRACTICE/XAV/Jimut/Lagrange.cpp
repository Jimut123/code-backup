#include<iostream>
using namespace std;

float x[20];
float y[20];
float x_ar[20];
int n;
float diff[20][20];
class LAG
{
	public:
		void input();
		void mat_cal();
		
};

void LAG::input()
{
	int i,j;
	cout<<"\n Enter the total number of inputs ::"<<endl;
	cin>>n;
	for(i=0;i<n;i++)
	{
		cout<<"\nEnter the "<<i+1<<" value :";
		cin>>x[i];
		cin>>y[i];
	}
	for(i=0;i<n;i++)
        {
		cout<<x[i]<<"\t"<<y[i]<<endl;
	}
}

void LAG::mat_cal()
{
	int i,j;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			diff[i][j]=x[i]-x[j];
		}
	}
	cout<<"\n The matrix :: \n"<<endl;
	for(i=0;i<n;i++)
        {
                for(j=0;j<n;j++)
                {
                        cout<<diff[i][j]<<"\t";
		}
		cout<<"\n";
	}
	cout<<"\n";
	float x_num;
	cout<<"\n Enter the number x : "<<endl;
	cin>>x_num;
	
	for(i=0;i<n;i++)
	{
		x_ar[i]=x_num-x[i];
		cout<<x_ar[i]<<"\t";
	}
	cout<<endl;
	float mul_down,sum=0,mul_up;
	for(i=0;i<n;i++)
	{
		mul_down = 1;
		mul_up =1;
		for(j=0;j<n;j++)
		{
			if(diff[i][j]>0)
				mul_down = mul_down*diff[i][j];
			if(j!=i)
				mul_up = mul_up*x_ar[j];
		}
		cout<<"mul_down = "<<i<<" = "<<mul_down<<endl;
		cout<<"mul_up = "<<i<<" = "<<mul_up<<endl;
	}
	
}

int main()
{
	LAG l;
	l.input();
	l.mat_cal();
}








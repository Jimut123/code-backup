using namespace std;
#include<iostream>
#include<cmath>
class inverse
{
	float a[10][20];
	float b[10];
	int n;
	float x[10];
	public:
	void input();
	void display();
	void displayx();
	void inv();
};
void inverse::input()
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
	for(int i=0;i<n;i++)
	{
		for(int j=n;j<2*n;j++)
		{
			if(j==(n+i))
			{a[i][j]=1;}
			else
			{a[i][j]=0;}
		}
	}
        cout<<"The entered matrix is : \n";
        display();
cout<<"in input again";
inv();
}
void inverse::inv()
{
cout<<"Entered inv";
	for(int i=0;i<n;i++)
	{
		for(int p=0;p<2*n;p++)
		{a[i][p]=a[i][p]/a[i][i];}
		for(int j=i+1;j<n;j++)
		{
			float m=a[j][i]/a[i][i];
			for(int k=i;k<2*n;k++)
			{
				a[j][k]=a[j][k]-m*a[i][k];
			}
		}
	}
	for(int i=n-2;i>=0;i--)
	{
		for(int j=i-1;j>=0;j++)
		{
			float m=a[j][i]/a[i][i];
			for(int k=i;k<2*n;k++)
			{
				a[j][k]=a[j][k]-m*a[i][k];
			}
		}
	}
	display();
	cout<<" \n";
	for(int i=0;i<n;i++)
	{
		float sum=0;
		for(int j=0;j<n;j++)
		{
			sum=sum+a[i][n+j]*b[j];
		}
		x[i]=sum;
	}
	cout<<"\n";
	displayx();
}
void inverse::display()
{
        cout<<"Entered display";
	for(int i=0;i<n;i++)
        {
                for(int j=0;j<2*n; j++)
                {
                      
                  
                        cout<<a[i][j]<<"\t";
                 
                }
        
	cout<<"left display \n";
	}
}
void inverse::displayx()
{
        for(int i=0;i<n;i++)
        {cout<<x[i]<<",";}
        cout<<endl;
}
int main()
{
	inverse ob;
	ob.input();
	//ob.inv();
	return 0;
}

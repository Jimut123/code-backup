#include<iostream>
using namespace std;
class gauss
{
	float a[20][20];
	int n;
	int i,j;
	float x[20];
	public:
		void delay()
		{	
			int g,h;
			for(g=0;g<100000;g++)
			{
			for(h=0;h<1000;h++);
			}
		}
		void print1()
                {
                        int i1,j1;
                        for(i1=0;i1<n;i1++)
                        {
                                for(j1=0;j1<n+1;j1++)
                                {
                                        cout<<a[i1][j1]<<"  ";
                                }
                                cout<<endl<<endl;
                        }
                }

		void input()
		{
			cin>>n;
			for(i=0;i<n;i++)
			{
			for(j=0;j<=n;j++)
			{
				cin>>a[i][j];
			}
			}
		}
		void matrix()
		{
			for(int i=0;i<n;i++)
			{
			for(int j=i+1;j<n;j++)
			{
				float m=a[j][i]/a[i][i];
				for(int k=0;k<n+1;k++)
				{
					a[j][k]=a[j][k]-a[i][k]*m;
				}
				cout<<endl<<endl;
				print1();
				delay();
			}
			}
		}
		void substitution()
		{
			x[n-1]=a[n-1][n]/a[n-1][n-1];
			for(int i=n-1;i>=0;i--)
			{
				float sum=0;
				for(int j=0;j<=n;j++)
				{ if(i!=j){
					sum=sum+a[i][j]*x[j];}
				}
				x[i]=(a[i][n]-sum)/a[i][i];
			}
		}
		void print()
		{
			cout<<"\n\n";
			for(int i=0;i<n;i++)
			cout<<x[i]<<",";
			cout<<"\n";
		}
};


int main()
{
	gauss obj;	
	obj.input();
	obj.matrix();
	obj.substitution();
	obj.print();
	return 0;
}











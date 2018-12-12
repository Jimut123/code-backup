#include<iostream>
#include<cmath>
using namespace std;
class pattern1
{
	int n;
	public:
		void input()
		{
			cout<<"Enter a number";
			cin>>n;
		}
		void pattern()
		{
			for(int i=1;i<=2*n+1;i++)
			{
				char ch='-';
				if(i%2==0)
				{
					ch='=';
				}
				cout<<"\n";
				if(i==1||i==2*n+1)
				{
					cout<<"+";
					for(int k=1;k<=2*n;k++)
					{
						cout<<"-";
					}
					cout<<"+";
				}
				else{
				
				    if(i==n+1)
				    {
				    	cout<<"|<";
				    	for(int j=1;j<2*n-1;j++)
					    {
				    		cout<<ch;
				    	}
				    	cout<<">|";
				   }
				 else 
				    {
				    	int e=n+2-i;
				    	char dh='/';
				    	char lh='\\';
				    	if(i>n+1)
				    	{
				    		e=i-n;
				    		dh='\\';
				     		lh='/';
				    	}
					
				    	int f=2*n-e+1;
				    	cout<<"|";
				      	for(int j=1;j<e;j++)
				    	{
				    		cout<<" ";
				    	}
				    	cout<<dh;
				    	for(int j=e+1;j<f;j++)
				    	{
				    		cout<<ch;
				    	}
				    	cout<<lh;
				    	for(int j=f+1;j<=2*n;j++)
				    	{
				    		cout<<" ";
				    	}
				    	cout<<"|";
				    }
			}
				
				
			}
		}
};
int main()
{
	pattern1 p;
	p.input();
	p.pattern();
}



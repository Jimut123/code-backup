#include<iostream>
using namespace std;
//int n;

class RevDiag
{
	public:
		void printArray(int a[10][10],int n)
		{	
			int i,j;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					cout<<a[i][j]<<'\t';
				}
				cout<<endl;
			}
		}
		void diagSwap(int a[10][10], int n)
		{
			int i,j;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(i==j && i!=n/2)
					{
						swap(a[i][j],a[i][n-i-1]);
					}
			}

			}
			printArray(a,n); 
			
		}
		void swap(int &a, int &b)
		{
			int t=a;
			a=b;
			b=t;
		}
};

int main()
{
	RevDiag rd;	//creating and object of a class
	int i,j;
	int n;
	cout<<"\n Enter the size of the matrix :\n"<<endl;
	cin>>n;
	int a[10][10];
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			cout<<"\n Enter the element of "<<i+1<<" row and "<<j+1<<" column : "<<endl;
			cin>>a[i][j];
		}
	}
	rd.printArray(a,n);
	cout<<endl<<endl;
	rd.diagSwap(a,n);
	//int a1,b1;
	//cin>> a1;
	//cin>> b1;
	//rd.swap(a1,b1);
	//cout<<a1<<" "<<b1;	
	return 0;
}


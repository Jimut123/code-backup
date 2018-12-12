#include<iostream>
using namespace std;

class Matrix
{
	public:
		void Matrix(int a[10][10],int n)
		{
			int i,j;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=0;		
				}
			}
			
		}
		void Mat_Input(int a[10][10],int n)
		{
			int i,j;
			for(i=0;i<n;i++)
                        {
                                for(j=0;j<n;j++)
                                {
					cout<<"\n Enter a number :";
                                        cin>>a[i][j];
                                }
                        }

			
		}
		
}

int main()
{
	int i,j;
	int a[10][10];
	Matrix M(a,n);
	
	return 0;
}





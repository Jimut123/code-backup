#include<iostream>
using namespace std;

class Matrix_Mul
{
	private:
		int i,j;
	public:
		void input_matrix(int a[20][20],int n);
		void calc_matrix(int a[20][20],int b[20][20],int c[20][20],int n);
		void disp_matrix(int a[20][20],int n);
		
};


void Matrix_Mul::disp_matrix(int a[20][20],int n)
{
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			cout<<a[i][j]<<"\t";
		}
		cout<<"\n";
	}

}

void Matrix_Mul::input_matrix(int a[20][20],int n)
{
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{	
			cout<<"\nEnter the element of the  "<<(i+1)<<" th row and "<<(j+1)<<" th column :: "<<endl;
			cin>>a[i][j];
		}
	}
	
}

void Matrix_Mul::calc_matrix(int a[20][20],int b[20][20],int c[20][20],int n)
{
	
	int k;
	cout<<"\n Displaying the calculation indeces : \n";
	for(i=0;i<n;i++)
	{
		//c[i][j] = 0;
		for(j=0;j<n;j++)
		{
			c[i][j] = 0;
			for(k=0;k<n;k++)
			{
				cout<<i<<k<<" "<<k<<j<<"\t";
				c[i][j] = c[i][j]+(int)a[i][k]*b[k][j];
			}
			cout<<"\n";
		}
	}
	
}

int main()
{
	cout<<"\n Enter the size of the matrix :";
	int n;
	cin>>n;
	
	int a[20][20],b[20][20];
	int c[20][20];					// the resultant matrix
	Matrix_Mul obj;
	cout<<"\n Enter the first matrix = "<<endl;
	obj.input_matrix(a,n);				// to input matrix a
	cout<<"\n Enter the second matrix = "<<endl;
	obj.input_matrix(b,n);				// to input matrix b
	cout<<"\n Matrix A = "<<endl;
	obj.disp_matrix(a,n);
	cout<<"\n Matrix B = "<<endl;	
	obj.disp_matrix(b,n);
	
	obj.calc_matrix(a,b,c,n);	
	cout<<"\n The resultant matrix :: "<<endl;
	obj.disp_matrix(c,n);
	
	return 0;
}













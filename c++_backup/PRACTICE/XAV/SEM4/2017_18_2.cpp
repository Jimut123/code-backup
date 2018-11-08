#include<iostream>
using namespace std;

#define size 10

//int m,n;

class Matrix
{
	int mat[size][size];
	int m,n;
	public:
		Matrix();
		Matrix(int,int);
		friend istream & operator>>(istream &, Matrix &);
		friend ostream & operator<<(ostream &, Matrix &);
		friend Matrix operator*(Matrix &, Matrix &);
};

Matrix operator*(Matrix & obj1,Matrix & obj2)
{
	Matrix temp;
	int i,j,k,sum=0;
	for(i=0;i<obj1.m;i++)
	{
		for(j=0;j<obj1.m;j++)
		{
			for(k=0;k<obj1.m;k++)
			{
				sum+=obj1.mat[i][k]*obj2.mat[k][j];
			}
			temp.mat[i][j]=sum;
			sum=0;
		}		
	}
	return temp;
}

Matrix :: Matrix()
{
	cout<<"Def const created!"<<endl;
	Matrix::m=0;
	Matrix::n=0;
}

Matrix :: Matrix(int m,int n)
{
	Matrix::n=n;
	Matrix::m=m;
}

istream & operator>>(istream & din, Matrix & obj)
{
	int i,j;
	for(i=0;i<obj.n;i++)
	{
		for(j=0;j<obj.m;j++)
		{
			din>>obj.mat[i][j];
		}		
	}
	return din;
}

ostream & operator<<(ostream & dout, Matrix & obj)
{
	int i,j;
	for(i=0;i<obj.n;i++)
        {
                for(j=0;j<obj.m;j++)
                {
                        dout<<obj.mat[i][j]<<" ";
                }
		dout<<"\n";
        }
        return dout;

}

int main()
{
	Matrix M(3,3);
	cin>>M;
	cout<<M;
	Matrix N(3,3);
	cin>>N;
	cout<<N;
	Matrix L = M*N;
	cout<<L;
	return 0;
}




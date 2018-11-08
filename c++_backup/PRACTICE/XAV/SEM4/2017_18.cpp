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
};

Matrix :: Matrix()
{
	cout<<"Def const created!"<<endl;
	::m=0;
	::n=0;
}

Matrix :: Matrix(int m,int n)
{
	::n=n;
	::m=m;
}

istream & operator>>(istream & din, Matrix & obj)
{
	int i,j;
	for(i=0;i<::n;i++)
	{
		for(j=0;j<::m;j++)
		{
			din>>obj.mat[i][j];
		}		
	}
	return din;
}

ostream & operator<<(ostream & dout, Matrix & obj)
{
	int i,j;
	for(i=0;i<::n;i++)
        {
                for(j=0;j<::m;j++)
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
	return 0;
}




#include<iostream>
using namespace std;

float a[10][10];
float b[10];
void print_mat(int);
void make_b(int);
void make_mat(int,int,float);
void sub_row_mat(int,int,int);
void make_me_slow();

void make_me_slow()
{
	int i,j;
	for(i=0;i<100000;i++)
	{
	for(j=0;j<1000;j++);
	}
}

void sub_row_mat(int n,int r1, int r2)
{
	int i;
	for(i=0;i<n+1;i++)
	{
		a[r][i] = a[r][i] - a[r2][i];
	}
}


void make_mat(int n,int r,float num)
{
	int i;
	for(i=0;i<n+1;i++)
	{
		a[r][i] = (float)a[r][i]/num;
	}
}

void make_b(int n)
{
	int i,j;
	int count = 0;
	for(i=0;i<n;i++)
	{
	for(j=0;j<n;j++)
	{
		if(i==j)
		{
			b[count++]=a[i][j];
		}	
	}
	}
	cout<<endl;
	cout<<"\n The b matrix :\n";
	for(i=0;i<n;i++)
	{
		cout<<b[i]<<"\t";
	}
	
}

void print_mat(int n)
{
	int i,j;
	for(i=0;i<n;i++)
	{
        for(j=0;j<n+1;j++)
        {
                cout<<a[i][j]<<"\t";
        }
	cout<<"\n";
        }


}


int main()
{
	int i,j,n;
	cout<<"\n Enter the size of the matrix(no. of equations) : ";
	cin>>n;
	for(i=0;i<n;i++)
	{
	for(j=0;j<n+1;j++)
	{
		cout<<"\n Enter the "<<(i+1)<<" row and "<<(j+1)<<" column :";
		cin>>a[i][j];
	}
   	}
	cout<<"\n";
    	print_mat(n);
	make_b(n);   
	make_mat(n,0,b[0]);
	make_me_slow();
	cout<<endl;
	print_mat(n);
	for(i=n-1;i>=1;i--)
	{
		for(j=1;j<=i;j++)
		{
			make_me_slow();
			sub_row_mat(n,j,);
			make_b(n);
			cout<<"\n"<<endl;
           	  	print_mat(n);
			make_me_slow();
			make_mat(n,j,b[j]);
			cout<<"\n"<<endl;
			print_mat(n);
			make_me_slow();
		}
	}
    	return 0;
}








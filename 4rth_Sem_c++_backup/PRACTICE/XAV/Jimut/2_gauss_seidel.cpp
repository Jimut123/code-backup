#include<iostream>
using namespace std;


// Using gauss seidel Method, solve linear simultaneous equation

class GAUSS_SEIDEL
{
	public:
		void gauss_seidel(float a[10][10], float b[10], float x[10], int n);
		//void disp(float a[10][10], float b[10], float x[10], int n);	
};



/*
void JACOBI :: disp(float a1[10][10], float b1[10], float x1[10], int n1)
{
	int i1,j1;
	for(i1=0;i1<n1;i1++)
	{
		for(j1=0;j1<n1;j1++)
			cout<<a1[i1][j1]<<"\t";
		cout<<b1[i1];
		cout<<endl;
	}
}
*/
void GAUSS_SEIDEL :: gauss_seidel(float a[10][10], float b[10], float x[10], int n )
{
	float xg[10],s;
	int i,j,flag,itr=0;
	float eps[10];
	float tol=1e-06;	//10^-6
	// To initialize all initial guess value xg[] to 0
	for(i=0;i<n;i++)
		xg[i]=0;
	flag=1;
	while(flag==1)
	{
		flag=0;
		itr++;
		for(i=0;i<n;i++)
		{
			s=0;
			for(j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(j<i)
						s=s+a[i][j]*x[j];
					else
						s+=a[i][j]*xg[j];
				}
			}
			x[i]=(b[i]-s)/a[i][i];
		}
		
		// to calculate eps[]
		for(i=0;i<n;i++)
		{
			eps[i]=x[i]-xg[i];
			if(eps[i]<0)
				eps[i]=-eps[i];
		}
		// to test convergence
		for(i=0;i<n;i++)
			if(eps[i]>tol)
			{
				flag=1;
				break;
			}
			// To update guess values
			for(i=0;i<n;i++)
			{
				xg[i]=x[i];
			}
		
		
		//cout<<endl<<"No. of iterations taken = "<<itr<<endl;
		//disp(a,b,x,n);
		
	}	
	cout<<endl<<"No. of iterations taken = "<<itr<<endl;	
}


int main()
{
	float a[10][10],b[10],x[10];
	int i,n,j;
	system("clear");	
	cout<<endl<<"Enter the no. of equations = ";
	cin>>n;
	
	cout<<"\n Enter the coefficients of your input matrix =";
	for(i=0;i<n;i++)	
	{
		for(j=0;j<n;j++)
		{
			cout<<"a["<<i<<"]["<<j<<"]=";
			cin>>a[i][j];
			
		}
	cout<<"b["<<i<<"]=";
	cin>>b[i];
	}
	GAUSS_SEIDEL G;
	G.gauss_seidel(a,b,x,n);
	// To display all roots
	for(i=0;i<n;i++)
		cout<<"root["<<(i+1)<<"]= "<<x[i]<<endl;
	return 0;
}

























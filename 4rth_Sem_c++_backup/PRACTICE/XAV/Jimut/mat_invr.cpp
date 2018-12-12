#include<iostream>
using namespace std;


// Using gauss seidel Method, solve linear simultaneous equation

class MAT_INV
{
	public:
		void mat_inv(float a[10][10], float b[10], float x[10], int n);
		void display(float aug[10][20],int n);
		//void disp(float a[10][10], float b[10], float x[10], int n);	
};


void MAT_INV :: mat_inv(float a[10][10], float b[10], float x[10], int n )
{
	int i,j,k,n1;
	float am,s;	//10^-6
	float aug[10][20], inverse[10][10];
	// To initialize all initial guess value xg[] to 0
	n1=2*n;
	for(i=0;i<n;i++)
		for(j=0;j<n1;j++)
			aug[i][j]=0;
	// copy a[][] to aug[][]
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			aug[i][j]=a[i][j];


	// To add 1 in 2nd half of the aug[][] matrix
	for(i=0;i<n;i++)
	{
		aug[i][i+n]=1;
	}

	cout<<endl<<"elements in the initial matrix --> \n";
	display(aug,n);

	// To start the matrix Inversion method
	for(i=0;i<n;i++)
	{
		am=aug[i][i];
			for(j=0;j<n1;j++)
				aug[i][j]=aug[i][j]/am;
			for(j=0;j<n;j++)
				if(i!=j)
				{
					am=aug[j][i];
						for(k=0;k<n1;k++)
						aug[j][k]=aug[j][k]-aug[i][k]*am;
				}
		cout<<"Elements in augmented matrix -->\n";
		display(aug,n);
	}
	// To collect inverse matrix
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		inverse[i][j]=aug[i][j+n];
	// To display elements in inverse matrix
		cout<<endl<<"Elements in inverse matrix = "<<endl;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			cout<<inverse[i][j]<<"\t";
			cout<<"\n";
		}	
	// To claculate  roots by taking product of inverse[][] and b[]
	for(i=0;i<n;i++)
	{
		s=0;
		for(j=0;j<n;j++)
			s=s+inverse[i][j]*b[j];
		x[i]=s;
	}
}

void MAT_INV :: display(float aug[10][20],int n)
{
	int i,j,n1;
	char ch;
	n1=2*n;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n1;j++)
			cout<<aug[i][j]<<"\t";
		cout<<endl;
	}
	cout<<"Type any key and press enter key -->";
	cin>>ch;
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
	MAT_INV MI;
	MI.mat_inv(a,b,x,n);
	cout<<endl<<"roots are ---\n";
		for(i=0;i<n;i++)
			cout<<"x["<<i<<"]="<<x[i]<<endl;
	return 0;
}

























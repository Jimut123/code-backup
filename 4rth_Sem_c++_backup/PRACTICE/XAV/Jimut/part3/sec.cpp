#include<iostream>
using namespace std;

const int size = 3;
class vector
{
	int v[size];
	public:
		vector();
		vector(int *x);
		friend vector operator *(int a,vector b);
		friend vector operator *(vector b,int a);
		friend void  operator >> (istream &, vector &);
		friend void  operator << (ostream &, vector &);
};

vector :: vector()
{
	for(int i=0; i<size; i++)
		v[i]=0;
}

vector :: vector(int *x)
{
	vector c;
	for(int i=0;i<size;i++)
		v[i]=x[i];
}

vector operator *(int a, vector b)
{
	vector c;
	for(int i=0;i<size;i++)
		c.v[i]=a*b.v[i];
	return c;
}


vector operator *(vector b,int a)
{
	vector c;
	for(int i=0;i<size;i++)
		c.v[i]=b.v[i]*a;
	return c;
}

void operator >>(istream &din, vector & b)
{
	for(int i=0;i<size;i++)
		din>>b.v[i];
	//return (din);
}

void operator <<(ostream & dout, vector & b)
{
	dout<<"("<<b.v[0];
	for(int i=1;i<size;i++)
		dout<<","<<b.v[i];
	dout<<")";
	//return (dout);
}

int main()
{	
	vector m;
	int x[size]={2,3,4};
	vector n(x);
	cout<<"Enter elements of vector m ";
	cout<<endl;
	cin>>m;
	cout<<endl;
	cout<<"m = ";
	cout<<m;
	cout<<"\n";
	vector p,q;
	p=2*m;
	q=n*2;
	cout<<"\n";
	cout<<"p = ";
	cout<<p;
	cout<<endl;
	cout<<"q = ";
	cout<<q;
	cout<<"\n";
	return 0;
}





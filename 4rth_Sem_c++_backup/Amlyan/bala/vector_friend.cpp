#include<iostream>
using namespace std;

const int size = 3;	// the size of the vector
class Vector
{
	int v[size];
	public:
		Vector();	// constructs a null vector
		Vector(int *x);
		friend Vector operator*(int, Vector &);
		friend Vector operator*(Vector &,int);
		friend istream & operator >>(istream &,Vector &);
		friend ostream & operator <<(ostream &,Vector &);
};

istream & operator>>(istream & din,Vector & b)
{
	int i;
        for(i=0;i<size;i++)
		din>>b.v[i];
	return din;
}

ostream & operator<<(ostream & dout,Vector & b)
{
	int i;
	dout<<" ( ";
        for(i=0;i<size;i++)
		dout<<b.v[i]<<" ";
	dout<<" ) "<<endl;
	return dout;
}

Vector::Vector()
{
	int i;
	cout<<"\n Constructing the null vector "<<endl;
        for(i=0;i<size;i++)
		v[i]=0;
}

Vector::Vector(int *x)
{
	cout<<"\n Constructing from a vector "<<endl;
	int i;
	for(i=0;i<size;i++)
		v[i]=x[i];
}

Vector operator*(int a,Vector & obj)
{
	Vector temp;
	int i;
	for(i=0;i<size;i++)
		temp.v[i]=a*obj.v[i];
	return temp;
}

Vector operator*(Vector & obj, int a)
{
	Vector temp;
	int i;
        for(i=0;i<size;i++)
                temp.v[i]=obj.v[i]*a;
        return temp;
}

int main()
{
	int x[size] = {2,4,6};
	Vector m;		// invokes the constructor 1
	Vector n=x;		// invokes the constructor 2
	cout<<"\n Enter the elements of the vector m :: "<<endl;
	cin>>m;
	cout<<endl;
	cout<<"Vector m = "<<m<<endl;
	Vector p,q;
	p=2*m;
	q=n*2;
	cout<<"\n";
	cout<<"p = "<<p<<"\n";
	cout<<"q = "<<q<<"\n";
	return 0;
}

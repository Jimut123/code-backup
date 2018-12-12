#include<iostream>
using namespace std;

const int size = 5;	//size of the vector

class Vector_Pow
{
	v[size];
	public:
		friend istream & operator>>(istream &,Vector_Pow &);
		friend ostream & operator<<(ostream &,Vector_Pow &);	
};

istream & operator >> (istream &din, Vector_Pow &b)
{
	int i;
	for(i=0;i<size;i++)
		din>>b.v[i];
	return din;
}

ostream & operator << (ostream &dout, Vector_Pow &b)
{
	int i;
	dout<<"(";
	for(i=0;i<size;i++)
		dout<<b.v[i]<<" ";
	dout<<")";
	return dout;
}
int main()
{	
	Vector_Pow 
	return 0;
}







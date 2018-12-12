#include<iostream>
using namespace std;

const int size = 3;	// the size of the vector
class Vector
{
	int v[size];
	public:
		void input();
		void display();
		friend Vector operator*(int, Vector &);
		friend Vector operator*(Vector &,int);
};

void Vector::input()
{
	int i;
	cout<<"Enter the elements of the "<<size<<" dimensional vector :"<<endl;
	for(i=0;i<size;i++)
		cin>>v[i];
}

void Vector::display()
{
	int i;
	for(i=0;i<size;i++)
                cout<<"\t"<<v[i]<<"\t";
	cout<<endl;
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
	Vector V1,V2,V3,V4;
	V1.input();
	V1.display();
	V2.input();
	V2.display();
	V3 = V1*2;
	V3.display();
	V4 = 2*V2;
	V4.display();
	return 0;
}

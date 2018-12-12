#include<iostream>
using namespace std;

class Complex
{
	int rl,im;
	public:
		void input(int r,int i);
		void display();
		Complex add(Complex,Complex);
};

void Complex::input(int r, int i)
{
	rl=r;
	im=i;
}

void Complex::display()
{
	cout<<"imaginary : "<<im<<" real : "<<rl<<endl;
}

Complex Complex::add(Complex obj1,Complex obj2)
{
	Complex temp;
	temp.rl = obj1.rl+obj2.rl;
	temp.im = obj1.im+obj2.im;
	return temp;
}

int main()
{
	Complex c1,c2,c3;
	cout<<"\n Enter the first complex no.'s real and imaginary part :"<<endl;
	int rl,im;
	cin>>rl>>im;
	c1.input(rl,im);
	cout<<"\n Enter the second complex no.'s real and imaginary part :"<<endl;
	cin>>rl>>im;
	c2.input(rl,im);
	c3=c3.add(c1,c2);
	cout<<"\n Added complex no's real and imaginary part : ";
	c3.display();
	return 0;
};



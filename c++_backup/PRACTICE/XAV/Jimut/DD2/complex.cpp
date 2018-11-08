#include<iostream>
using namespace std;


class Complex
{
	int rl,im;
	public:
		Complex();
		~Complex();
		Complex(int,int);	
		void display();
		friend Complex operator+(Complex &,Complex &);
};

void Complex :: display()
{
	cout<<rl<<" + "<<im<<"i"<<endl;
}
Complex operator+(Complex & obj1,Complex & obj2)
{
	Complex temp;
	temp.rl = obj1.rl+obj2.rl;
	temp.im = obj1.im+obj2.im;
	return temp;
}
Complex::Complex()
{
	rl=0;
	im=0;	
	cout<<"Default constructor is created!"<<endl;
}

Complex::Complex(int rl,int im)
{
	Complex::rl=rl;
	Complex::im=im;
	cout<<"Parameterised constructor is initialised!"<<endl;
}

Complex::~Complex()
{
	cout<<"Object is destroyed!"<<endl;
}

int main()
{
	Complex C1(2,4),C2(4,5),C3;
	C3 = C1 + C2;
	C3.display();
	return 0;
}





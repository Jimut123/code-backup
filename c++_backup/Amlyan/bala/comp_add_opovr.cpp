#include<iostream>
using namespace std;

class Complex
{
	int imag,real;
	public:
		Complex(){imag = 0; real = 0;}
		Complex(int real1,int imag1);
		Complex operator+(Complex &);
		void display();
};

Complex::Complex(int real1,int imag1)
{
	imag=imag1;
	real=real1;
}
void Complex::display()
{
	cout<<endl<<"real part = "<<real<<" imaginary part = "<<imag<<endl;
}
Complex Complex::operator+(Complex & obj)
{
	Complex t;
	t.real = real + obj.real;
	t.imag = imag + obj.imag;
	return t;
}


int main()
{
	Complex C1,C2,C3;
	int rl,im;
	cout<<"\n Enter the real and imaginary part of First Complex no.  : "<<endl;
	cin>>rl>>im;
	C1 = Complex(rl,im);
	C1.display();
	cout<<"\n Enter the real and imaginary part of Second Complex no.  : "<<endl;
        cin>>rl>>im;
        C2 = Complex(rl,im);
	C2.display();
	//Complex C3(0,0);
	C3 = C1+C2;	
			/*	
			 * usual function call c3 = c1.operator+(c2), so c1 is the object that is present
			 * so this member functions can be acessed directly and the members of the c2 can
			 * be acessed via the . operator. 
			 */
	C3.display();
	
	return 0;
}





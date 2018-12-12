//Take two complex number and Output the sum
#include <iostream>
using namespace std;

class Complex
{
	float real, imag;
  public:
	void input(float, float);
	void display(void);
	Complex sum(Complex &);
};

inline void Complex :: input(float real, float imag)
{
    Complex :: real = real;
    Complex :: imag = imag;
}
inline void Complex :: display(void)
{
    cout << real << " + i" << imag <<endl;
}

inline Complex Complex :: sum(Complex &c)
{
	Complex temp;
	temp.real = real + c.real;
	temp.imag = imag + c.imag;
	return temp;
}
int main()
{
	float r1, r2, i1, i2;
	Complex c1, c2, c3;
	cout << "Enter 1st Complex Number: ";
	cin >> r1 >> i1;
	cout << "Enter 2nd Complex Number: ";
	cin >> r2 >> i2;
	c1.input(r1, i1);
	c2.input(r2, i2);
	c3 = c1.sum(c2);
	c3.display();
	return 0;
}
	


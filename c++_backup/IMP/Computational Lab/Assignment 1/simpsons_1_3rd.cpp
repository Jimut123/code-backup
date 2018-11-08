/*q8as1.cpp: Write a program to implement Simson's 1/3rd Rule to calculate value of an integral
*/
#include <iostream>
using namespace std;
class Simpsons13
{
  public:
	double simpsons13(double a, double b, long int n);
	double function_1(double x);
};
double Simpsons13 :: simpsons13(double a, double b, long int n)
{
	double yon, y1, y2, it;
	long int i;
	double h;
	h = (b - a) / n;
	yon = function_1(a) + function_1(b);
	y1 = 0;
	y2 = 0;
	for(i = 1; i < n; i++)
	{
		if(i % 2)
			y1 = y1 + function_1(a + i * h);
		else
			y2 = y2 + function_1(a + i * h);
	}
	it = (1.0 / 3.0) * h * (yon + 4 * y1 + 2 * y2);
	return it;
}
double Simpsons13 :: function_1(double x)
{
	double y;
	y = 4.0 / (1 + x * x);
	return y;
}
int main()
{
	double a, b, it;
	long int n;
	system("clear");
	do {
	cout << endl << "Enter Number of Intervals:  ";
	cin >> n;
	}while(n % 2 != 0);
	cout << "Enter Lower limit of your integral: ";
	cin >> a;
	cout << "Enter upper limit of your Integral: ";
	cin >> b;
	Simpsons13 S;
	it = S.simpsons13(a, b, n);
	cout << "\nValue of Integral using Simpson's 1/3rd Rule: " << it << endl;
	return 0;
}

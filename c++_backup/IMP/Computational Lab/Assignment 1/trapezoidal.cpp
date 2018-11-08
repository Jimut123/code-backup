/*q7as1.cpp: Write a program to implement Trapezoidal Rule to calculate value of an integral
*/
#include <iostream>
using namespace std;
class Trapezoidal
{
  public:
	double trapezoidal(double a, double b, long int n);
	double function_1(double x);
};
double Trapezoidal :: trapezoidal(double a, double b, long int n)
{
	double yon, y1, it;
	long int i;
	double h;
	h = (b - a) / n;
	yon = function_1(a) + function_1(b);
	y1 = 0;
	for(i = 1; i < n; i++)
		y1 = y1 + function_1(a + i * h);
	it = .5 * h * (yon + 2 * y1);
	return it;
}
double Trapezoidal :: function_1(double x)
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
	cout << endl << "Enter Number of Intervals:  ";
	cin >> n;
	cout << "Enter Lower limit of your integral: ";
	cin >> a;
	cout << "Enter upper limit of your Integral: ";
	cin >> b;
	Trapezoidal T;
	it = T.trapezoidal(a, b, n);
	cout << "\nValue of Integral using Trapezoidal Rule: " << it << endl;
	return 0;
}

/*q8as1.cpp: Write a program to implement Simpson's 3/8th Rule to calculate value of an integral
*/
#include <iostream>
using namespace std;
class Simpsons38
{
  public:
	double simpsons38(double a, double b, long int n);
	double function_1(double x);
};
double Simpsons38 :: simpsons38(double a, double b, long int n)
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
		if(i % 3)
			y1 = y1 + function_1(a + i * h);
		else
			y2 = y2 + function_1(a + i * h);
	}
	it = (3.0 / 8.0) * h * (yon + 3 * y1 + 2 * y2);
	return it;
}
double Simpsons38 :: function_1(double x)
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
	}while(n % 3 != 0);
	cout << "Enter Lower limit of your integral: ";
	cin >> a;
	cout << "Enter upper limit of your Integral: ";
	cin >> b;
	Simpsons38 S;
	it = S.simpsons38(a, b, n);
	cout << "\nValue of Integral using Simson's 3/8th Rule: " << it << endl;
	return 0;
}

/*Solve non linear equation (single variable) using Bisection Method */
#include <iostream>
using namespace std;
class BisectionMethod
{
	public:
		int bisection_method(float x[10]);
		void display(float x[10], int n);
		float function_1(float y);
};
int BisectionMethod :: bisection_method(float x[10])
{
	float a, b, c ,f1, f2, f3, ff;
	float i;
	int n;
	n = 0;	//n = number of roots
	a = -10;
	f1 = function_1(a);
	for(i = -9.9999; i <= 10; i = i + 0.0001)
	{
		b = i;
		f2 = function_1(b);
		ff = f1 * f2;
		if(ff < 0 && f1 > 0)
		{
			do 
			{
				c = .5 * (a + b);
				f3 = function_1(c);
				if(f3 < 0)
				{
					b = c;
					f2 = function_1(b);
				}
				else
				{
					a = c;
					f1 = function_1(a);
				}
				if(f3 < 0)
					f3 = -f3;
				if(f3 < 1e-06)
				{
					x[n++] = c;
					break;
				}
			}while(1);
		}
		else if(ff < 0 && f2 > 0)
		{
			do 
			{
				c = .5 * (a + b);
				f3 = function_1(c);
				if(f3 < 0)
				{
					a = c;
					f1 = function_1(a);
				}
				else
				{
					b = c;
					f2 = function_1(b);
				}
				if(f3 < 0)
					f3 = -f3;
				if(f3 < 1e-06)
				{
					x[n++] = c;
					break;
				}
			}while(1);
		}
		a = i;
		f1 = function_1(a);
	}
	display(x, n); 	//To display all roots of non-linear equation
	return n;
}

void BisectionMethod :: display(float x[10], int n)
{
	int i;
	cout << endl << "Roots are ---->\n";
	for(i = 0; i < n; i++)
		cout << "Root[" << (i+1) << "] = " << x[i] << endl;
}

float BisectionMethod :: function_1(float y)
{
	float y1;
	y1 = y * y - 3;
	//y1 = (y - 1.11) * (y - 1.12) * (y - 1.13) * (y - 1.14);
	//y1 = y * y * y - 3 * y + 1;
	//y1 = y * y * y - y - 11;
	//y1 = y * y * y - 6 * y * y + 11 * y - 6;
	return y1;
} 

int main()
{
	float x[10];
	int n;
	BisectionMethod BE;
	n = BE.bisection_method(x);
	return 0;
}

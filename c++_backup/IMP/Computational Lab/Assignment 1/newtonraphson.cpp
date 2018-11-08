/*Solve non linear equation (single variable) using Newton Raphson Method */
#include <iostream>
using namespace std;
class NewtonRaphsonMethod
{
	public:
		int newton_raphson_method(float x[10]);
		void display(float x[10], int n);
		float function_1(float y);
		float function_1d(float y);
};
int NewtonRaphsonMethod :: newton_raphson_method(float x[10])
{
	float a, b, c ,f1, f2, f3;
	float i, h;
	int n, j, itr[10];
	n = 0;	//n = number of roots
	a = -10;
	f1 = function_1(a);
	for(i = -9.9999; i <= 10; i = i + 0.0001)
	{
		b = i;
		f2 = function_1(b);
		f3 = f1 * f2;
		if(f3 < 0)
		{
			c = .5 * (a + b);
			itr[n] = 0;
			do 
			{
				h = -function_1(c) / function_1d(c);
				c = c + h;
				if(h < 0)
					h = -h;
				itr[n] = itr[n] + 1;
			}while(h > 1e-06);
			x[n++] = c;
		}
		a = i;
		f1 = function_1(a);
	}
	display(x, n); 	//To display all roots of non-linear equation
	//To didplay number of iterations to get solutions
	for(j = 0; j < n; j++)
		cout << "Itr[" << j << "] = " << itr[j] << endl;
	return n;
}

void NewtonRaphsonMethod :: display(float x[10], int n)
{
	int i;
	cout << endl << "Roots are ---->\n";
	for(i = 0; i < n; i++)
		cout << "Root[" << (i+1) << "] = " << x[i] << endl;
}

float NewtonRaphsonMethod :: function_1(float y)
{
	float y1;
	//y1 = y * y - 3;
	//y1 = (y - 1.11) * (y - 1.12) * (y - 1.13) * (y - 1.14);
	//y1 = y * y * y - 3 * y + 1;
	//y1 = y * y * y - y - 11;
	y1 = y * y * y - 6 * y * y + 11 * y - 6;
	//y1 = y * y - 2 * y + 1;
	//y1 = y * y * y * y * y * y * y * y * y - 512;
	return y1;
} 

float NewtonRaphsonMethod :: function_1d(float y)
{
	float y1;
	//y1 = 2 * y;
	y1 = 3 * y * y - 12 * y + 11;
	//y1 = 3 * y * y - 1;
	//y1 = 3 * y * y - 3;
	//y1 = 2 * y - 2;
	//y1 = 9 * y * y * y * y * y * y * y * y;
	return y1;
}
int main()
{
	float x[10];
	int n;
	//system("clear");
	NewtonRaphsonMethod NRM;
	cout << "y = x^3 - 6x^2 + 11y -6\n";
	n = NRM.newton_raphson_method(x);
	return 0;
}

/* q81as1.cpp: Write a program to implement 2nd order Runge Kutta Method to 
solve a differential equation
*/

#include <iostream>
using namespace std;
class Runge2
{
 public:
	float runge2(float x0, float y0, float h);
	float runge2_function(float  x, float y);
};
float Runge2 :: runge2_function(float x, float y)
{
	float y1;
	y1 = y + 0 * x; 	// dy/dx = y
	return y1;
}
float Runge2 :: runge2(float x0, float y0, float h)
{
	float k1, k2, y1;
	k1 = h * runge2_function(x0, y0);
	k2 = h * runge2_function(x0 + h, y0 + k1);
	y1 = y0 + .5 * (k1 + k2);
	return y1;
}
int main()
{
	float x0, y0, x1, y1, h, xn;
	int i, n;
	system("clear");
	cout << endl << "Enter x0 = ";
	cin >> x0;
	cout << "Enter y0 = ";
	cin >> y0;
	cout << "Enter xn = ";
	cin >> xn;
	cout << "Enter h = ";
	cin >> h;
	n = (int)((xn - x0) / h);
	cout << "n = " << n << endl;
	Runge2 R;
	cout << "x = " << x0 << " y = " << y0 << endl;
	for(i = 1; i <= n + 1; i++)
	{
		x1 = x0 + i * h;
		y1 = R.runge2(x0, y0, h);
		cout << "x = " << x1 << " y = " << y1 << endl;
		y0 = y1;
	}
	return 0;
}

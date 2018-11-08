/* q82as1.cpp: Write a program to implement 4nd order Runge Kutta Method to 
solve a differential equation
*/

#include <iostream>
using namespace std;
class Runge4
{
 public:
	float runge4(float x0, float y0, float h);
	float runge4_function(float  x, float y);
};
float Runge4 :: runge4_function(float x, float y)
{
	float y1;
	//y1 = y + 0 * x; 	// dy/dx = y
	//y1 = x + y;
	//y1 = x2 + 1;
	y1 = x * y + y * y;
	return y1;
}
float Runge4 :: runge4(float x0, float y0, float h)
{
	float k1, k2, k3, k4, y1;
	k1 = h * runge4_function(x0, y0);
	k2 = h * runge4_function(x0 + h / 2, y0 + k1 / 2);
	k3 = h * runge4_function(x0 + h / 2, y0 + k2 / 2);
	k4 = h * runge4_function(x0 + h, y0 + k3);
	y1 = y0 + (1.0 / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4);
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
	Runge4 R;
	cout << "x = " << x0 << " y = " << y0 << endl;
	for(i = 1; i <= n + 1; i++)
	{
		x1 = x0 + i * h;
		y1 = R.runge4(x0, y0, h);
		cout << "x = " << x1 << " y = " << y1 << endl;
		y0 = y1;
	}
	return 0;
}

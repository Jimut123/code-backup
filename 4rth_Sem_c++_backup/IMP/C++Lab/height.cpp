/* 
Enter a height in feets and inches and add them 
*/
#include <iostream>
using namespace std;

class Height
{
	int feet, inch;
   public:
	void input();
	void output();
	Height sum(Height &);
};
inline void Height :: input()
{
	cout << "Enter Height in Feet and Inches: ";
	cin >> feet >> inch;
}
inline void Height :: output()
{
	cout << "Total " << feet << " feet and " << inch <<" inches\n";
}
inline Height Height :: sum(Height &h)
{
	Height temp;
	temp.feet = feet + h.feet;
	temp.inch = inch + h.inch;
	if (temp.inch >= 12 )
	{
		temp.inch = temp.inch % 12;
		temp.feet = temp.feet + 1;
	}
	return temp;
}
int main()
{
	int f, i;
	Height h1, h2, h3;
	h1.input();
	h2.input();
	h3 = h1.sum(h2);
	h3.output();
//	cout <<"Nerdy PDROXXX: " << argv[1] << endl;
	return 0;
}

/*
Write a program to implement the typecasting operations using operator keyword.
*/
#include <iostream>
using namespace std;
class Cm
{
	double cm;
 public:
	Cm(double d)
	{
		cm = d;
	}
	void display()
	{
		cout << "cm: " << cm << endl;
	}
};
class Inch
{
	double inch;
 public:
	Inch(double d)
	{
		inch = d;
	}
	operator Cm()
	{
		return inch * 2.538;
	}
	void display()
	{
		cout << "Inch: " << inch << endl;
	}
};
int main()
{
	Inch obj(1);
	Cm ob1 = obj;
	obj.display();
	ob1.display();
	return 0;
};
		

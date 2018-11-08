/* Write a program in c++ to manipulate date.
Make the following operators overloaded.
(i) >>, to take input date
(ii) << to display the output
(iii) ++, pre-increment operator that will give the next date
*/

#include <iostream>
using namespace std;
class Date
{
	int d, m, y;
 public:
	friend istream& operator>>(istream& in, Date& obj);
	friend ostream& operator<<(ostream& out, Date& obj);
	friend Date operator++(Date&);
	friend Date operator++(Date&,int);
};
istream& operator>>(istream& in, Date& obj)
{
	in >> obj.d;
	in >> obj.m;
	in >> obj.y;
	return in;
}
ostream& operator<<(ostream& out, Date& obj)
{
	out << obj.d << "/" << obj.m << "/" << obj.y << endl;
	return out;
}
Date operator++(Date& obj)
{
	if(obj.m == 1 || obj.m == 3 || obj.m == 5 || obj.m == 7 || obj.m == 8 || obj.m == 10)
	{
		if(obj.d == 31)
		{
			obj.d = 1;
			obj.m += 1;
		}
		else
			obj.d += 1;
	}
	else if(obj.m == 2)
	{
		if(obj.d == 28)
		{
			obj.d = 1;
			obj.m = 3;
		}
		else
			obj.d += 1;
	}
	else if(obj.m == 12)
	{
		if(obj.d == 31)
		{
			obj.d = 1;
			obj.m = 1;
			obj.y += 1;
		}
		else
			obj.d += 1;
	}
	else
	{
		if(obj.d == 30)
		{
			obj.d = 1;
			obj.m += 1;
		}
		else
			obj.d += 1;
	}
	return obj;
}
Date operator++(Date& obj,int x)
{
	if(obj.m == 1 || obj.m == 3 || obj.m == 5 || obj.m == 7 || obj.m == 8 || obj.m == 10)
	{
		if(obj.d == 31)
		{
			obj.d = 1;
			obj.m += 1;
		}
		else
			obj.d += 1;
	}
	else if(obj.m == 2)
	{
		if(obj.d == 28)
		{
			obj.d = 1;
			obj.m = 3;
		}
		else
			obj.d += 1;
	}
	else if(obj.m == 12)
	{
		if(obj.d == 31)
		{
			obj.d = 1;
			obj.m = 1;
			obj.y += 1;
		}
		else
			obj.d += 1;
	}
	else
	{
		if(obj.d == 30)
		{
			obj.d = 1;
			obj.m += 1;
		}
		else
			obj.d += 1;
	}
	return obj;
}
int main()
{
	Date d1, d2,d3;
	char ch;
	do{
		cout << "Enter Date(dd/mm/yyyy):-\n";
		cin >> d1;
		cout << "Your Date is: ";
		cout << d1;
		d2 =++d1;
		d3 = d2++;
		cout << "Next Date: ";
		cout << d2;
		cout << "Next date(post): ";
		cout << d3;
		cout << "\n" << "Do you want more practice(Y/N)?: ";
		cin >> ch;
	}while(ch == 'Y' || ch == 'y');
	return 0;
}

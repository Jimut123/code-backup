#include<iostream>

using namespace std;

void changingValues(int &a, int &b, int &c, int &d , char &e)
{
	a++;
	b++;
	c++;
	d++;
	e++;
}


int main()
{

	int a,b,c,d;
	char e = 'e';
	a = 0;
	b = 1;
	c = 25;
	d = 90;
	cout << "\n Values before : a = "<<a<<" b = "<<b<<" c = "<<c<<" d = "<<d<<" e = "<<e<<endl;
	changingValues(a,b,c,d,e);
	cout << "\n Values after : a = "<<a<<" b = "<<b<<" c = "<<c<<" d = "<<d<<" e = "<<e<<endl;
	return 0;
}





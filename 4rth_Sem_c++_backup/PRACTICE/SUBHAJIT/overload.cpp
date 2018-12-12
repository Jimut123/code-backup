#include<iostream.h>
class space
	{
		int x;
		int y;
		int z;
	public:
		void getdata(int a, int b, int c)
		void display(void);
		void operator-();   //overload unary minus
	};

void space :: getdata(int a, int b, int c)
{
	x=a;
	y=b;
	z=c;
}
void space :: display(void)
{
	cout<< x << " ";
	cout<< y << " ";
	cout<< z << "\n";
}
void space :: operator-()
{
	x= -x;
	y= -y;
	z= -z;
}
void main()
{
	space S;
	S.getdata(10,-20,30);
	cout << "S : ";
	S.display();
	-S;	//activates operator-() function
	cout << "S  :  ";
	S.display();
	getch();
}

//OUTPUT: S: 10 -20  30
	  S: -10 20 -30
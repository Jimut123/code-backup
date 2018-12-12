#include<iostream>
using namespace std;

class XYZ;

class ABC
{
	//public:
	int a;
	public:
		void getinput(int i);
		friend void max(ABC,XYZ);
};

void ABC :: getinput(int i)
{
	a=i;
}

class XYZ
{
	//public:
	int b;
	public:
		void getinput(int i);
		friend void max(ABC,XYZ);
};

void XYZ :: getinput(int i)
{
	b=i;
}

void max(ABC obj_2,XYZ obj_1)
{
	if(obj_1.b > obj_2.a)
		cout<<obj_1.b<<" is the largest"<<endl;
	else
		cout<<obj_2.a<<" is the largest"<<endl;
}
int main()
{
	int num1,num2;
	//XYZ obj_1;
	ABC obj_2;
	XYZ obj_1;
	cout<<"\n Enter two numbers :: "<<endl;
	cin >> num1>>num2;
	obj_1.getinput(num1);
	obj_2.getinput(num2);
	max(obj_1,obj_2);
	return 0;
}








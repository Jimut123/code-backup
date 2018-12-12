#include<iostream>
using namespace std;

class XYZ;

class ABC
{
	//private:
	//protected:
	public:
	int a;
	public:
		void getinput(int i);
		//friend 
		void max(ABC,XYZ);
};

void ABC :: getinput(int i)
{
	a=i;
}

class XYZ
{
	int b;
	public:
		void getinput(int i);
	 	friend void max(ABC,XYZ);
};

void XYZ :: getinput(int i)
{
	b=i;
}

void max(ABC obj2,XYZ obj1)
{
	if(obj1.b > obj2.a)
		cout<<obj1.b<<" is the largest"<<endl;
	else
		cout<<obj2.a<<" is the largest"<<endl;
}
int main()
{
	int num1,num2;
	ABC obj_2;
	XYZ obj_1;
	cout<<"\n Enter two numbers :: "<<endl;
	cin >> num1>>num2;
	obj_1.getinput(num1);
	obj_2.getinput(num2);
	max(obj_2,obj_1);
	return 0;
}








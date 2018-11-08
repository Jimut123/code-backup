#include<iostream>
using namespace std;

class Distance
{
	int cm,m;
	public:
		void input(int,int);
		void display();
		Distance add(Distance&);
};

void Distance :: input(int cm1,int m1)
{
	cm=cm1;
	m=m1;	
}
void Distance :: display()
{
	cout<<"The distance :: in m = "<<m<<" and cm = "<<cm;
}
Distance Distance :: add(Distance& ob)
{
	Distance t;
	t.cm = cm + ob.cm;
	t.m = m + ob.m;
	if(t.cm>=100)
	{
		t.cm -=100;
		t.m++;
	}
	return t;
}
int main()
{
	Distance ob1,ob2,ob3;
	int cm_1,m_1;
	cout<<"\n Enter 2 nos first in cm and then in m ::"<<endl;
	cin>> cm_1 >>m_1;
	ob1.input(cm_1,m_1);
	cout<<"\n Enter 2 nos first in cm and then in m  ::"<<endl;
	cin>> cm_1 >>m_1;
	ob2.input(cm_1,m_1);
	ob3=ob1.add(ob2);
	ob3.display();
	return 0;
}
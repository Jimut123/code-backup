#include<iostream>
using namespace std;

class Comp
{
	int rl,im;
	public:
		void input(int, int);
		void display();
		Comp add(Comp&);
		Comp sub(Comp&);
};

void Comp::input(int rl1,int im1)
{
	rl=rl1;
	im=im1;
}

void Comp::display()
{
	cout<<"The no ::  real = "<<rl<<" Imaginary =  "<<im<<endl;
}

Comp Comp:: add(Comp& ob)
{
	Comp C;
	C.rl = rl+ob.rl;
	C.im = im+ob.im;	
	return C;
}
Comp Comp:: sub(Comp& ob)
{
	Comp C;
	C.rl = rl-ob.rl;
	C.im = im-ob.im;	
	return C;
}


int main()
{
	Comp ob1,ob2,ob3;
	int cm_1,m_1;
	cout<<"\n Enter Real and imaginary part  ::"<<endl;
	cin>> cm_1 >>m_1;
	ob1.input(cm_1,m_1);
	cout<<"\n Enter Real and imaginary part of second comp no.  ::"<<endl;
	cin>> cm_1 >>m_1;
	ob2.input(cm_1,m_1);
	ob3=ob1.add(ob2);
	ob3.display();
	ob3=ob1.sub(ob2);
	ob3.display();
	return 0;
}







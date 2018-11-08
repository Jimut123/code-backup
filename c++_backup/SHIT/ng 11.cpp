#include <iostream>
using namespace std;
int main()
{
	
	float p,b;
	cout<<"hellow! please enter your child`s  marks"<<endl;
	cin>>b;
	if(b<50) 
	cout<<"fail!"<<endl;
	else
	cout<<"pass!"<<endl;
	p=(b/100)*100;
	cout<<"the percentage is :"<<p<<"%"<<endl;
	return 0;
	}
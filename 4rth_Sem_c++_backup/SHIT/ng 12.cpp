#include<iostream>
using namespace std;
int main()
{
	float a;
	cout<<"welcome to kolkata!please enter the amount of distance you want  to  go";
	cin>>a;
	if(a<=10)
	cout<<"the cost of the ticket is Rs25:"<<endl;
	else
	if(a>=10 && a<=50)
	cout<<"the cost of the ticket is Rs75:"<<endl;
	else
	if(a>=50 && a<=100)
	cout<<"the ticket costs Rs105:"<<endl;
	else
	if(a>=100 && a<=800)
	cout<<"the ticket costs Rs470:"<<endl;
	else
	cout<<"you must pay Rs5000:"<<endl;
	cout<<"have a happy journey";
}
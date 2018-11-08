#include<iostream>
using namespace std;
class C
{
private :
	int m1,m2;
public :
	void input();	
	void display();
};

void C::input()
{
	cout<<"\n Enter 2 nos. :"<<endl;
	cin>>m1>>m2;	
}
void C::display()
{
	cout<<"\n First no. = "<<m1<<"\n 2nd no. = "<<m2;
}

int main()
{
	C obj;
	obj.input();
	obj.display();
	return 0;
}





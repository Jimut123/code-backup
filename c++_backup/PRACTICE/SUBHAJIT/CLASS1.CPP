
#include<iostream.h>
#include<conio.h>
class person
{
	char name[30];
	int age;
  public:
	void getdata(void);
	void display(void);
};

void person::getdata(void)
{
	cout<<"Enter Name";
	cin>>name;
	cout << "Enter Age";
	cin>>age;
}

void person::display(void)
{
	cout<<"\n Name:"<<name;
	cout<<"\n Age:"<<age;
}
void main()
{
	clrscr();
	person p;	// decln of object 'p' to the class 'person'
	p.getdata();
	p.display();
	getdata();
 }
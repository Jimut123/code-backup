// prog to scan and print a number and cost of item using classes

#include<iostream.h>
#include<conio.h>
class item
{
	int number;
	char it_name[30];
	float cost;
   public:
	void getdata(void);
	void putdata(void);
};

void item::getdata()
{
	cout<<"Enter the Number,Name and Cost of the Item";
	cin>>number>>it_name>>cost;
}
void item::putdata()
{
	cout<<"ITEM NUMBER  "<<number<<endl;
	cout<<"NAME OF THE ITEM "<<it_name<<endl;
	cout<<"COST OF ITEM "<<cost<<endl;
}
 void main()
 {
   clrscr();
   item x;
   x.getdata();
   x.putdata();
   getch();
 }


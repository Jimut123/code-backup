#include<iostream.h>
#include<conio.h>
class sample
{
	int m;
	void read(void); //private member function
   public:
	void update(void);
	void write(void);
};

void sample::update(void)
{
  read();
  m=2*m;
}

void sample::write(void)
{
	cout<<" m = "<< m;
}
void sample::read(void)
{
	cout<<"enter number";
	cin>>m;
}
void main()
{
 clrscr();
 sample a;
 a.update();
 a.write();
 getch();
}

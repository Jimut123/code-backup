#include<iostream.h>
#include<conio.h>
class student
{
	protected:
	int roll_number;
	public:
		void get_number(int a)
		{
			roll_number=a;
		}
		void put_number(void)
		{
			cout<<"Roll No:" << roll_number << "\n" ;
		}
};

class sem:public student
{
	protected:
			int m1,m2,m3;
	public:
			void get_marks(int x, int y, int z)
			{
				m1=x;
				m2=y;
				m3=z;
			}
			void put_marks(void)
			{
				cout<<"Marks Obtained:" << "\n"
				<< "Marks1: " << m1 << "\n"
				<< "Marks2: " << m2 << "\n"
				<< "Marks3: " << m3 << "\n"    ;
			}
};
class cia
	{
		protected:
				int marks;
		public:
				void get_score(int s)
				{
					marks=s;

				}
				void put_score (void)
				{
					cout<<"CIA Marks:" << marks<<"\n \n";

				}
	};
class result:public sem, public cia
{
		int total;
		public:
			void display ( void) ;
};
void result :: display(void)
{
	total=m1+m2+m3+marks;
	put_number();
	put_marks();
	put_score();
	cout<<"Total score" << total << "\n";
}

void main()
	{
		clrscr();
		result student1;
		student1.get_number(13);
		student1.get_marks(77,88,90);
		student1.get_score(80);
		student1.display();
		getch();
	}



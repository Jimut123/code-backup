#include<iostream>
using namespace std;

//class time;
class time
{
        int sec,min,hr;
        public:
                void input();
                void display();
};

class date
{
	int day,mon,year;
	public:
		void input();		
		void display();
};

void date::input()
{
	cout<<"\n Enter the date (DD-MM-YYYY) :: "<<endl;	
	cin>>day;
	cin>>mon;
	cin>>year;
}

void date::display()
{
	cout<<"Date :: "<<day<<"-"<<mon<<"-"<<year<<endl;
}

class time
{
	int sec,min,hr;
	public:
                void input();
                void display();
};

void time::input()
{	
	cout<<"\n Enter the date (sec-min-hr) :: "<<endl;
        cin>>sec;
        cin>>min;
        cin>>hr;
}

void time::display()
{
	cout<<"Time :: "<<sec<<"-"<<min<<"-"<<hr<<endl;
}


int main()
{
	date d;
	time t;
	d.input();
	d.display();
	//time t;
	t.input();
	t.display();
	return 0;	
}










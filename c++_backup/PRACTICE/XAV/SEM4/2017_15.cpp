#include<iostream>
using namespace std;


class Time
{
	int hour,min,sec;
	public:
		Time();
		Time(int,int,int);
		~Time();
		void display();
		friend Time operator+(Time &,Time &);
		friend Time operator--(Time &);
		friend Time operator--(Time &,int);
		friend Time operator++(Time &,int);
		friend Time operator++(Time &);
};

Time operator++(Time & obj)
{
	Time temp;
	cout<<"First *******\n\n";
	temp.sec=obj.sec++;
        temp.min=obj.min++;
        temp.hour=obj.hour++;
        return temp;

}

Time operator++(Time & obj,int n=0)
{
	Time temp;
	cout<<"Second **********\n\n";
        temp.sec=++obj.sec;
        temp.min=++obj.min;
        temp.hour=++obj.hour;
        return temp;
	
}

Time operator--(Time & obj)
{
	Time temp;
	cout<<"First *********\n\n";
	temp.sec=obj.sec--;
	temp.min=obj.min--;
	temp.hour=obj.hour--;
	return temp;
}

Time operator--(Time & obj,int n=0)
{
        Time temp;
	cout<<"Second **********\n\n";
        temp.sec=--obj.sec;
        temp.min=--obj.min;
        temp.hour=--obj.hour;
        return temp;
}

Time :: ~Time()
{
	cout<<"\n Obj Destroyed!"<<endl;
}


Time operator+(Time & ob1,Time & ob2)
{
	Time temp;
	int hr1=0,min1=0;
	temp.sec = ob1.sec+ob2.sec;
	if(temp.sec>59)
	{
		temp.sec=temp.sec-59;
		min1++;
	}
	temp.min = ob1.min+ob2.min+min1;
	if(temp.min>59)
	{
		temp.min=temp.min-59;
		hr1++;
	}
	temp.hour = ob1.hour + ob2.hour + hr1;
	return temp;
}

Time :: Time()
{
	cout<<"\n Def const created!"<<endl;
	hour=0;
	min=0;
	sec=0;
}

Time :: Time(int hour,int min,int sec)
{
	cout<<"\n Par const created!"<<endl;
	Time::hour=hour;
	Time::min=min;
	Time::sec=sec;
}

void Time :: display()
{
	cout<<hour<<':'<<min<<':'<<sec<<endl;
}


int main()
{
	int hr,mn,sc;
	cout<<"\n Enter the hour, min, sec for obj 1 ::"<<endl;
	cin>>hr;
	cin>>mn;
	cin>>sc;
	Time obj1(hr,mn,sc);
	
	cout<<"\n Enter the hour, min, sec for obj 2 ::"<<endl;
	cin>>hr;
        cin>>mn;
        cin>>sc;
	Time obj2(hr,mn,sc);
	
	Time obj3;
       	obj3 = obj1+ obj2;
	obj3.display();
	
	cout<<"\n Before :"<<endl;
	obj1.display();
	obj1--;
	cout<<"\n After :"<<endl;
	obj1.display();

	cout<<"\n Before :"<<endl;
	obj2.display();
	--obj2;

	cout<<"\n After :"<<endl;
	obj2.display();
	
	cout<<"\n Before :"<<endl;
        obj1.display();
        obj1++;
        cout<<"\n After :"<<endl;
        obj1.display();

        cout<<"\n Before :"<<endl;
        obj2.display();
        ++obj2;

        cout<<"\n After :"<<endl;
        obj2.display();



	return 0;
}




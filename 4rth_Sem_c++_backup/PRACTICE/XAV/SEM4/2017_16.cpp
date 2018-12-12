#include<iostream>
#include<string>
using namespace std;


class Student
{
	int roll;
	string name,dept;
	public:
		Student();
		Student(int,string,string);
		void display_stu();
		~Student();
};

Student :: ~Student()
{
	cout<<"\n Student obj Destroyed! \n";
}

Student :: Student()
{
	cout<<"\n The def const of Student class is created! \n"<<endl;
	name="";
	dept="";
	roll=0;
}

Student :: Student(int roll,string name,string dept )
{
        cout<<"\n The par const of Student class is created! \n"<<endl;
	Student::name=name;
	Student::dept=dept;
	Student::roll=roll;
}

void Student :: display_stu()
{
	cout<<endl<<"Student details :: "<<endl;
	cout<<"--------------------------------------------------"<<endl;
	cout<<"Name of the Student :: "<<name<<endl;
	cout<<"Roll of the Student :: "<<roll<<endl;
	cout<<"Dept. of the Student :: "<<dept<<endl;

}



class UG : virtual public Student
{
	string course;
	int year;
	public:
		UG();
		UG(string,int,int,string,string);
		~UG();
		void display_UG();
};

UG::UG()
{
	course="";
	year=0;
}

UG::UG(string course,int year,int roll,string name,string dept):Student(roll,name,dept)
{
	UG::course=course;
	UG::year=year;
	//Student(int roll,string name,string dept);
}

UG::~UG()
{
	cout<<"\n UG obj Destroyed ....!"<<endl;
}

void UG::display_UG()
{
	display_stu();
	cout<<endl<<"UG details :: "<<endl;
	cout<<"Course :: "<<course<<endl;
	cout<<"Year :: "<<year<<endl; 
}


class PG : virtual public Student
{
	string course;
	int year;
	public:
		PG();
		PG(string,int,int,string,string);
		~PG();
		void display_PG();
};

PG::PG()
{
	course="";
	year=0;
}

PG::PG(string course,int year,int roll,string name,string dept):Student(roll,name,dept)
{
	PG::course=course;
	PG::year=year;
	//Student(int roll,string name,string dept);

}

PG::~PG()
{
	cout<<"\n PG obj Destroyed ....!"<<endl;
}

void PG::display_PG()
{
	display_stu();
	cout<<"PG details :: "<<endl;
	cout<<"Course :: "<<course<<endl;
	cout<<"Year :: "<<year<<endl; 
}


class Result: public UG, public PG
{

	int marks1,marks2,PGoUG;
	public:
		Result();
		Result(int,int,int,int,int,string,string,string);
		~Result();
		void display_res();

};

void Result :: display_res()
{
	cout<<endl<<"Marks 1 :: "<<marks1;
	cout<<endl<<"Marks 2 :: "<<marks2;
	if(PGoUG==1)
	{
		display_UG();
	}
	else
	{
		display_PG();
	}
	
}
Result::Result(int marks1,int marks2,int roll,int year,int PGoUG,string dept,string course,string name)
	//:UG(string course,int year,int roll,string name,string dept):PG(string course,int year,int roll,string name,string dept)
{
	Result::marks1=marks1;
	Result::marks2=marks2;
	Result::PGoUG=PGoUG;
	if(PGoUG==1)
	{
		//UG
		UG(course,year,roll,name,dept);
	}
	else
	{
		//PG
		PG(course,year,roll,name,dept);
	}

}


Result::Result()
{
	cout<<"\n def const of Result class created! "<<endl;
}

Result::~Result()
{
	cout<<"\n object of Result class destroyed! "<<endl;
}

int main()
{
	string nm,dpt,crs;
	int rl,yr,PGoUG;
	cout<<"\n enter the details of the Student :"<<endl;
	cout<<"\n Enter the name  :"<<endl;
	getline(cin,nm);
	cout<<"name :"<<nm;
	cout<<"roll?:"<<endl;
	cin>>rl;
	cout<<"dept?:"<<endl;
	getline(cin,dpt);
	cout<<"\n Enter whether PG(0) or UG(1) ?: "<<endl;
	cin>>PGoUG;
	cout<<"\n Enter the course and year :"<<endl;
	getline(cin,crs);
	cin>>yr;
	cout<<"\n Enter marks 1 and marks 2 :"<<endl;
	int mrks1;
	int mrks2;
	cin>>mrks1;
	cin>>mrks2;
	Result res(mrks1,mrks2,rl,yr,PGoUG,dpt,crs,nm);
	res.display_res();
	return 0;
}



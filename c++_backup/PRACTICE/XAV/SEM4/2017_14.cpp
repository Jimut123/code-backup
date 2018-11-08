#include<iostream>
using namespace std;

class FUN
{
	static int count;
	char s[100];
	public:
		FUN();
		FUN(int,char c[100]);
		void display_count();
		~FUN();
		void reverseit(char c[100],int);
};

int FUN::count;	//the static ember function to count the numbe rof objects created!!

void FUN::reverseit(char c[100],int n)
{
	int i;
	cout<<"\n The reversed string = "<<endl;
	for(i=n;i>=0;i--)
		cout<<c[i];
	cout<<"\n";
}
FUN::~FUN()
{
	count--;
	cout<<"\n Object destroyed!!"<<endl;
}

void FUN::display_count()
{
	cout<<endl<<"I am object no. "<<count<<endl;;
}

FUN::FUN()
{
	display_count();
	int i;
	cout<<"\ndefault constructor of the class FUN is created!"<<endl;
	count++;	//incrementing the default constructor
}

FUN::FUN(int n,char c[100])
{
	int i;
	for(i=0;i<n;i++)
		FUN::s[i]=c[i];
	cout<<"\nPar const of class FUN is created!"<<endl;
}


int main()
{
	FUN a[3];
	int i;
	//for(i=0;i<3;i++)
	//	a[i].display_count();
	char x[]={'J','i','m','u','t','\0'};
	a[2].reverseit(x,6);
	return 0;
}


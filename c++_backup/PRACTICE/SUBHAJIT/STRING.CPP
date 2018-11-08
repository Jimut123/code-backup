#include<conio.h>
#include<string.h>
#include<iostream.h>

class string {
	public:
	char *s;
	int size;
	void getstring(char *str)
	{
		size = strlen(str);
		s = new char[size];
		strcpy(s,str);
	}

	void operator+(string);
};

void string::operator+(string ob)
{
	size = size+ob.size;
	s = new char[size];
	strcat(s,ob.s);
	cout<<"\nConcatnated String is: "<<s;
}

void main()
{
	string ob1, ob2;
	char *string1, *string2;
	clrscr();

	cout<<"\nEnter First String:";
	cin>>string1;

	ob1.getstring(string1);

	cout<<"\nEnter Second String:";
	cin>>string2;

	ob2.getstring(string2);

	//Calling + operator to Join/Concatenate strings

	ob1 + ob2;
	getch();
}
#include <iostream>
using namespace std;
class Student
{
	int roll;
	char name[50];
	int marks;
 public:
	Student();
	~Student();
	void view_display();
};
Student :: Student()
{
	cout << "Enter Roll No.: ";
	cin >> roll;
	cout << "Name: ";
	cin.getline(name, 50);
	cout << "Enter Total Marks: ";
	cin >> marks;
}
Student :: ~Student()
{
	cout << "Destroyed\n";
}


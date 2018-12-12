#include <iostream>
#include<cstring>
using namespace std;
class SalesPerson;
class Sales
{
	char item_name[50];
	float item_price;
	int quantity;
	static int count;
 public:
	Sales();
	~Sales();
	static void sales_count();
	void set_sales();
	void display();
	//friend void display1(Sales &, SalesPerson &);
};
int Sales :: count;
class SalesPerson
{
	char sp_name[60];
	int age;
	char city[30];
	static int sp_count;
 public:
	SalesPerson();
	~SalesPerson();
	void set_sp();
	void display();
	//friend void display1(Sales &, SalesPerson &);
};
int SalesPerson :: sp_count;
Sales :: Sales()
{
	strcpy(item_name, "null");
	item_price = 0.0;
	quantity = 0;
}
Sales :: ~Sales()
{
	cout << "Destroyed!" << endl;
}

void Sales :: sales_count()
{
	count++;
}

SalesPerson :: SalesPerson()
{
	strcpy(sp_name, "null");
	age = 0;
	strcpy(city, "null");
};
SalesPerson :: ~SalesPerson()
{
	cout << "Destroyed!"<< endl;
}
void Sales :: set_sales()
{
	cout << "Enter Item Name: ";
	cin >> item_name;
	cout << "Enter Item Price: ";
	cin >> item_price;
	cout << "Enter Quantity: ";
	cin >> quantity;
}
void SalesPerson :: set_sp()
{
	cout << "Enter Salesperson's Name: ";
	cin >> sp_name;
	cout << "Age: ";
	cin >> age;
	cout << "City: ";
	cin >> city;
	sp_count++;
}
void SalesPerson :: display()
{
	cout << "Number Of SalesPerson: " << sp_count << endl;
}
void Sales :: display()
{
	cout << "Number Of Sales for today: " << count << endl;
}
//void display1(Sales &s, SalesPerson &sp)
int main()
{
	Sales s1, s2, s3;
	s1.set_sales();
	s2.set_sales();
	s3.set_sales();
	s1.sales_count();
	s2.sales_count();
	s3.sales_count();
	SalesPerson sp1, sp2;
	sp1.set_sp();
	sp2.set_sp();
	sp1.display();
	s1.display();
	return 0;
}

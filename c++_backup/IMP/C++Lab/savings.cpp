#include <iostream>
using namespace std;

class Savings
{
	int acc_no, age, rate;
	double bal;
 public: 
	Savings();
	Savings(Savings &);
	void interest();
	void interest(int);
	void input();
	~Savings();
	void display();
};
inline void Savings :: interest()
{
	bal = bal + (bal * 3 * 1) / 100;
	display();
}
inline void Savings :: interest(int r)
{
	rate = r;
	bal = bal + (bal * rate * 1) / 100;
	display();
}
inline Savings :: Savings()
{
	acc_no = 0;
	age = 0;
	bal = 0.0;
}
inline Savings :: Savings(Savings &obj)
{
	acc_no = obj.acc_no;
	age = obj.age;
	bal = obj.bal;
}
inline void Savings :: input()
{
	cout << "Enter your A/C No. Age and Balance:-\n ";
	cin >> acc_no >> age >> bal;
}
inline Savings :: ~Savings()
{
	//cout << "A/C No: " << acc_no << endl;
	//cout << "Age: " << age << endl;
	cout << "This is a Destructor"<< endl;
}
inline void Savings :: display()
{
	cout << "A/C No.: " << acc_no << endl;
	cout << "Age: " << age << endl;
	cout << "Balance: " << bal << endl;
}

int main()
{
	int rate;
	Savings acc1, acc2;
	Savings acc3(acc1);
	acc1.input();
	cout << "Rate is: 3" << endl;
	acc1.interest();
	acc2.input();
	cout << "rate is: ";
	cin >> rate;
	acc2.interest(rate);
	acc1.interest();
	acc2.interest();
	//acc3.display();
	return 0;
}

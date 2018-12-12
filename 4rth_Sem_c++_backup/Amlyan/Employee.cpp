#include<iostream>
#include<string>
#include<iomanip>
using namespace std;

class Employee
{
	public:
		string name;
		string code;
		string dept;
		void input_Employee();
};

void Employee :: input_Employee()
{
	cout<<"\n Enter the name, code and dept :: "<<endl;
	getline(cin,name);
	getline(cin,code);
	getline(cin,dept);
}

//---------------------------------------------------------------------------


class Pay : virtual public Employee 
{
	public:
		float BasicPay;	// Basic Pay
		float DA;	// Dearness allowance
		float HRA;	// House rent allowance
		float TA;	// Travelling allowance
		void input_Pay();
};


void Pay :: input_Pay()
{
	cout<<"\n Enter the Basic pay,DA, HRA and TA :: "<<endl;
	cin>>BasicPay;
	cin>>DA;
	cin>>HRA;
	cin>>TA;
}


class Deductions : virtual public Employee 
{
	public:
		float IT;	// Income tax
		float PF;	// Provident fund
		float OD;	// other deductions
		void input_Deductions();
};

void Deductions :: input_Deductions()
{
	cout<<"\n Enter the INCOME TAX, PF and other deductions :: "<<endl;
	cin>>IT;
        cin>>PF;
        cin>>OD;

}

class OA : virtual public Employee
{
	public:
		float OA1;
		float OA2;
		float OA3;
		void input_OA();
};

void OA :: input_OA()
{
	cout<<"\n Enter OA1, OA2 and OA3 :: "<<endl;
        cin>>OA1;
        cin>>OA2;
        cin>>OA3;

}


class PaySlip : public Pay,public Deductions,public OA
{
	public:
		void generate_slip();
};
void PaySlip :: generate_slip()
{
	cout<<"--------------------------------PAYSLIP----------------------------"<<setw(50)<<endl;
	cout<<"Name : "<<name<<setw(50)<<endl;
	cout<<"Code : "<<code<<setw(50)<<endl;
	cout<<"Dept : "<<dept<<setw(50)<<endl;
	cout<<"Basic Pay : "<<BasicPay<<setw(50)<<endl; 	
	cout<<"Dearness Allowance : "<<DA<<setw(50)<<endl; 
	cout<<"House Rent Allowance : "<<HRA<<setw(50)<<endl; 
	cout<<"Travelling Allowance : "<<TA<<setw(50)<<endl; 
	cout<<"Income Tax : "<<IT<<setw(50)<<endl; 
	cout<<"Provident fund : "<<PF<<setw(50)<<endl; 
	cout<<"OD : "<<OD<<setw(50)<<endl; 
	cout<<"OA1 : "<<OA1<<setw(50)<<endl; 
	cout<<"OA2 : "<<OA2<<setw(50)<<endl; 
	cout<<"OA3 : "<<OA3<<setw(50)<<endl; 
	cout<<"--------------------------------########----------------------------"<<endl;
}

int main()
{
	PaySlip PS;
	PS.input_Employee();
	PS.input_Pay();
	PS.input_Deductions();
	PS.input_OA();
	PS.generate_slip();
	return 0;
}












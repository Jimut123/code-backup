#include<iostream>
#include<vector>
#include<string>
#include<fstream>

using namespace std;

int main()
{
	const double a = 1.1234567890123;
	const float b = 1.12345678901234567;
	double d = 1.123456789012345;
	cout<<"a(1.1234567890123 ) = "<<a<<" size = "<<sizeof(a)<<endl;
	cout<<"b(1.12345678901234567 ) = "<<b<<" size = "<<sizeof(b)<<endl;
	cout<<"d(1.123456789012345 ) = "<<d<<" size = "<<sizeof(d)<<endl;
	short int short_int = 12345;
	long int long_int = 12345678;
	long long int long_long_int = 1234567890123456789;
	cout<<"short int(12345 ) = "<<short_int<<" size = "<<sizeof(short_int)<<endl;
	cout<<"long int(12345678 ) = "<<long_int<<" size = "<<sizeof(long_int)<<endl;
	cout<<"long long int(1234567890123456789 )  = "<<long_long_int<<" size = "<<sizeof(long_long_int)											<<endl;


	unsigned int unsigned_int = 1234567890;
	cout<<"unsigned int(123456789 ) = "<<unsigned_int<<" size = "<<sizeof(unsigned_int)<<endl;
	long double long_double = 1234567890123456789;
	cout<<"long double =(123456789012345 ) "<<long_double<<" size = "<<sizeof(long_double)<<endl;
		

	cout<<"========================================="<<endl;

	int lagNum = (5>2)?5:2;
	cout<<"(5>2)?5:2  = "<<lagNum<<endl;
	
		
	cout<<"Random Number generator === "<<endl;
	int randNum = (rand() % 100) + 1;
	int i=0;
	while(randNum!=100)
	{
		randNum = (rand() % 100) + 1;
		cout<<randNum<<" ";
		//i++;
	}

	
	



		
	return 0;
	
}




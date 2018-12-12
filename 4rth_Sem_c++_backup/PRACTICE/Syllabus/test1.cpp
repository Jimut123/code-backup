#include<iostream>
#include<string>
using namespace std;
int main()
{
	string str;
	cout<<"\n Enter a string ::\n";
	getline(cin,str);
	cout<<str;
	int str_val = stoi(str);
	cout<<"\n The integer value of the string inputted : "<<stoi(str)<<endl;
	cout<<"\n The value + 1 :: "<<++str_val;
	return 0;
}



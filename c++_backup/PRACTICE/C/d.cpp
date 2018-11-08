#include<iostream>
#include<vector>
#include<string>
#include<fstream>

using namespace std;

int main()
{
	// some string operations
	string str;

	cout<< "\n Enter a string :";
	getline(cin,str);
	
	int len = str.size();
	
	cout<<" size of string = "<<len<<endl;			// prints the length of the string
	cout<<" is string empty = "<<str.empty()<<endl;		// 0 if false 1 if true
	cout<<str.append(" was your input string ")<<endl;	// to insert any string after that
	


	return 0;

}

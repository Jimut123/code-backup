#include<iostream>
#include<vector>
#include<string>
#include<fstream>

using namespace std;

int main()
{
	string numberGuessed;
	int intNumberGuessed = 0;
	do
	{
		cout<<"Guess between 1 and 10 :";
		getline(cin, numberGuessed);		// string input

		intNumberGuessed = stoi(numberGuessed);		//to convert string to integer
		cout<<intNumberGuessed<<endl;
	}
	while(intNumberGuessed != 4);
	cout<<"You Win "<<endl;
	return 0;
}

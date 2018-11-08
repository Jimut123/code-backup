#include<iostream>
#include<vector>
#include<string>
#include<fstream>

using namespace std;

int main()
{
	char happyArray[6] = {'H','a','p','p','y','\0'};		// The old C style 
	string birthdayString = " Birthday" ;
	cout<<happyArray+birthdayString<<endl;
	string yourName;
	cout<<"What is your name :";
	getline(cin,yourName);
	cout<<"hello "<<yourName<<endl;	
	double const Num = 0.56789 ;
	string strNum;
	cout<<"\n Enter the number :";
	getline(cin,strNum);
	
	double guessedNum = stod(strNum);
	cout<<guessedNum;
	if(guessedNum == Num)
	{
		cout<<"\n you are right ";
	}
	else
	{
		cout<<"\n you are wrong ";
	}
	return 0;
}

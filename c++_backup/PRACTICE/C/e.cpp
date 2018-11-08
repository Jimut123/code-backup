#include<iostream>
#include<vector>
#include<string>
#include<fstream>

using namespace std;

int main()
{
	string dogString = "dog";
	string catString = "cat";
	// compares two string
	cout<<dogString.compare(catString)<<endl;	//  1
	cout<<dogString.compare(dogString)<<endl;	//  0
	cout<<catString.compare(dogString)<<endl;	// -1

	string name;
	cout<<"\n Enter your name : "<<endl;
	getline(cin,name);
	
	string anotherString = name.assign(name);

	cout<<"Another string :"<<anotherString<<endl;
	// name.assign(name,0,3) stores Jim in name variable
	string cutString = anotherString.assign(name,0,3);	// 0 to 2 but not 3 [0,1,2]
	cout<<"Cutted string :"<<cutString<<endl;
	cout<<"Your name = "<<name<<endl;	
	int lastIndex = name.find("Pal",0);
	cout<<"Index of Pal "<<lastIndex<<endl;
	
	name.insert(5," Talvosky");	// to insert a name at this point
	cout<<name<<endl;
	
	name.erase(6,9);	// delete 9 characters starting at the 6th index
	cout<<name<<endl;
	
	name.replace(5,6," Logan");	// starting at 5th index replace 6 characters with this string
	cout<<name<<endl;
	return 0;
}

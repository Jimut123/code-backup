#include<iostream>
#include<vector>
#include<string>
#include<fstream>

using namespace std;


int main()
{
	// little bit of pointer
	int myAge = 39;
	char myGrade = 'A';
	cout<<"Size of int = "<<sizeof(myAge)<<endl;
	cout<<"Size of char  = "<<sizeof(myGrade)<<endl;

	cout<<"myAge is located at "<<&myAge<<endl;

	int* agePtr = &myAge;

	cout<<"Address of pointer "<<agePtr<<endl;
	cout<<"Data at the memory address "<<*agePtr<<endl;
	
	int badNums[5] = {4, 13, 14, 24, 34};
	int* numArrayPtr = badNums;

	cout<< "Address = "<<numArrayPtr<<" value = "<<*numArrayPtr<<endl;
	numArrayPtr++;
	cout<< "Address = "<<numArrayPtr<<" value = "<<*numArrayPtr<<endl;
	cout<< "Address = "<<badNums<<" value = "<<*badNums<<endl;
	*badNums+=1;
	cout<< "Address = "<<badNums<<" value = "<<*badNums<<endl;
	return 0;
}

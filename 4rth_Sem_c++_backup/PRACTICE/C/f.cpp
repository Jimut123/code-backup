#include<iostream>
#include<vector>
#include<string>
#include<fstream>

using namespace std;

int main()
{
	vector <int> lotteryNumVect(10);	//type and size
	int lotteryNumArray[5] = {4,13,14,24,34}; 	// array

	lotteryNumVect.insert(lotteryNumVect.begin(),lotteryNumArray,lotteryNumArray+3);
			    // begin from here, inserting the array, only 3 index
	cout<<lotteryNumVect.at(2)<<endl;
	
	lotteryNumVect.insert(lotteryNumVect.begin()+5, 44);	// at the fifth index 
	cout<<lotteryNumVect.at(5)<<endl;
	
	lotteryNumVect.push_back(64);	// to insert at the last
	cout<<" Final value "<<lotteryNumVect.back()<<endl;	//final value, last value is found out
	
	lotteryNumVect.pop_back();	// to pop the last element

	cout<<" Final value "<<lotteryNumVect.back()<<endl; 

	cout<<" First value "<<lotteryNumVect.front()<<endl; 	// front element

	cout<<"########## is the vector empty  ? :"<<lotteryNumVect.empty()<<endl; // 0 f the vector is not empty
	cout<<"Size of the vector :: "<<lotteryNumVect.size()<<endl;
	
	return 0;
}

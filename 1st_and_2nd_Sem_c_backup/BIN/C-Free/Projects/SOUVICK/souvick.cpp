/*C++ program to find the simple interest and amount*/
# include <iostream>
using namespace std;
int main()
{
	int p,r,t,si,amnt;
	cout<<"ENTER PRINCIPAL,RATE AND TIME";
	cin>>p>>r>>t;
	si = p * r * t / 100;
	cout<<"THE SIMPLE INTEREST IS:"<<si<<endl;
	amnt = p + si;
	cout<<"THE AMOUNT IS:"<<endl;
	return 0;
	} 
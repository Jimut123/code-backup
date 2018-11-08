#include<iostream>
//#include"DiagRevRec.cpp"
using namespace std;
int main()
{
	int a,b;
	cin>>a;
	cin>>b;
	RevDiag rd;
	rd.swap(a,b);
	cout<<a<<" "<<b;
	return 0;
}

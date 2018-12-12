#include<iostream>

using namespace std;
struct A
{
	char a;
	int b;
	float c;
};

class B
{
	char a;
	int b;
	float c;
};


int main()
{
	cout<<"The size of struct a : "<<sizeof(A)<<endl;   // 9 but gives 12 ?
	cout<<"The size of class b : "<<sizeof(B)<<endl;    // 9 but gives 12 ?
	return 0;
}









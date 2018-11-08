#include<iostream>
#include<string>
using namespace std;
int i = 10;
int main()
{
	int i= 20;
	cout<<endl<<i<<"\t"<<::i;
	{
		int i = 30;
		cout<<endl<<i<<"\t"<<::i;
	}
	cout<<endl<<i<<"\t"<<::i;
	return 0;
}






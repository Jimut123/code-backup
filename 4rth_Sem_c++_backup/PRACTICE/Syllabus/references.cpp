#include<iostream>
using namespace std;
int main()
{
	int i = 10;
	int &j = i;
	cout<<endl<<"i = "<<i<<" j = "<<j;
	j = 20;
	cout<<endl<<"i = "<<i<<" j = "<<j;
	i = 30;
	cout<<endl<<"i = "<<i<<" j = "<<j;
	i++;
	cout<<endl<<"i = "<<i<<" j = "<<j;
	j++;
	cout<<endl<<"i = "<<i<<" j = "<<j;
	cout<<endl<<"address of i = "<<&i<<" address of j = "<<&j<<endl;
	return 0;
}





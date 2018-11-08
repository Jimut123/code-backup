#include<iostream>
using namespace std;
int main()
{
	static int i=0;
	cout<<i<<" ";
	if (i==100)
		return 0;
	i++;
	main();	
	
	return 0;
}

#include<iostream>
#include<cmath>
using namespace std;

int main()
{
	int i,size = 20,pow=1,j;
	float sum = 0,den;
	
	for(i=0;i<20;i++)
	{
		cout<<1<<"/"<<(i+1)<<"*"<<3<<"^"<<i<<" + ";
		pow=1;
		for(j=1;j<=i;j++)
			pow=pow*3;	
		den = (i+1)*pow;
		sum = sum + 1/den;

	}
	cout<<"Sum = "<<sum<<endl;
	return 0;
}





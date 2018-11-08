#include<iostream>
#include<cmath>
using namespace std;

int main()
{
	int i,j,limit,sume=0,sumo=0;
	float sum = 1.0f;
	for(i=1;i<=20;i++)
	{
		limit = 2*i;
		sume = 0;
		sumo = 0;
		for(j = 1;j<=limit;j++)		
		{
			if(j%2==0)
				sume = sume + j;
			else
				sumo = sumo + j;
		}
		sum = sum+(float)sume/sumo;
	}
	cout<<"sum = "<<sum<<endl;
	return 0;
}





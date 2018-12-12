#include"Dist.h"
//#include<iostream>
//#include"DistLib.cpp"
//using namespace std;
int main()
{
	Distance d1,d2;
	d1.setFeet(2);
	//d1.iFeet=2;   //another way of initializing or setting the parameter
			// as that is publicly availabe
	d1.setInches(2.2);
	d2.setFeet(3);
	d2.setInches(3.3);
	cout<<d1.getFeet()<<" "<<d1.getInches()<<endl;
	cout<<d2.getFeet()<<" "<<d2.getInches()<<endl;
	//return 0;
	return 0;
}

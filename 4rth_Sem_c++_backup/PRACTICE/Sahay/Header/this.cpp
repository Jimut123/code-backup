#include<iostream>
using namespace std;

struct Distance
{
	int iFeet;
	float fInches;
	public:
		void setFeet(Distance * const, int);
		int getFeet(Distance * const);
		void setInches(Distance * const,float);
		float getInches(Distance * const);
};

void setFeet(Distance * const this, int x)
{
	this->iFeet=x;
}
int getFeet(Distance * const this)
{
	return this->iFeet;
}
void setInches(Distance * const this,float y)
{
	this->fInches=y;
}

float getInches(Distance * const this)
{
	return this->fInches;
}



int main()
{
	Distance d1,d2;
	setFeet(&d1,2);
	//d1.iFeet=2;   //another way of initializing or setting the parameter
			// as that is publicly availabe
	setInches(&d1,2.2);
	setFeet(&d2,3);
	setInches(&d2,3.3);
	cout<<getFeet(&d1)<<" "<<getInches(&d1)<<endl;
	cout<<getFeet(&d2)<<" "<<getInches(&d2)<<endl;
	//return 0;
	return 0;
}










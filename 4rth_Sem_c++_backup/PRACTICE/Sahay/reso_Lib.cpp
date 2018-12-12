#include<iostream>
using namespace std;

class Distance
{
	int iFeet;
	float fInches;
	public:
		void setFeet(int);			// prototype only
		int getFeet();				// prototype only
		void setInches(float);			// prototype only
		float getInches();			// prototype only
};

void Distance::setFeet(int x)
{
	iFeet=x;
}

void Distance::getFeet()
{
	return iFeet;
}

void Distance::setInches(float y)
{
	fInches=y;
}

float Distance::getInches()
{
	return fInches;
}


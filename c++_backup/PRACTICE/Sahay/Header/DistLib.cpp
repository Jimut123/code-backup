#include<iostream>
using namespace std;
#include "Dist.h"
void Distance::setFeet(int x)
{
	iFeet=x;
}

int Distance::getFeet()
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


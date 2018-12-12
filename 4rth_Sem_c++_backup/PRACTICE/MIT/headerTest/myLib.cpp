// myLib.cpp -- implementation
//

#include "myLib.h"
#include<iostream>
int square(int);
int cube(int);

int square(int x)
{
	return x*x;
}

int cube(int x)
{
        return x*square(x);
}


#include<iostream>
#include "RandomMatrix.h"
#include <cstdlib>
#include <ctime>
#include <iostream>
using namespace std;

int main()
{
  MatrixMan myMatrixMan;
  int a[10][10],array_size=10;
  int i;
  for(i=0;i<100;i++)
  {
    myMatrixMan.matrixGen();
  }
  return 0;
}

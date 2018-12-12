#include<iostream>
#include <cstdlib>
#include <ctime>
#include <iostream>
#include <unistd.h>
#include "matrixBase.h"
int main()
{
  char a[10][10]={
    //0   1   2   3   4   5   6   7   8   9
    {'-','-','-','-','-','-','-','-','-','-'}, // 0
    {'|',' ',' ',' ',' ',' ',' ',' ',' ','|'}, // 1
    {'|',' ',' ',' ',' ',' ',' ',' ',' ','|'}, // 2
    {'|',' ',' ',' ',' ',' ',' ',' ',' ','|'}, // 3
    {'|',' ',' ',' ',' ',' ',' ',' ',' ','|'}, // 4
    {'|',' ',' ',' ',' ',' ',' ',' ',' ','|'}, // 5
    {'|',' ',' ',' ','J',' ',' ',' ',' ','|'}, // 6
    {'|',' ',' ',' ',' ',' ',' ',' ',' ','|'}, // 7
    {'|',' ',' ',' ',' ',' ',' ',' ',' ','|'}, // 8
    {'-','-','-','-','-','-','-','-','-','-'}  // 9
  };
  MatrixBase myMatrixBase;
  myMatrixBase.matrixDisplay(a);
  //int random =myMatrixBase.randomGen(10);
  //std::cout << "random = " << random ;


  return 0;
}

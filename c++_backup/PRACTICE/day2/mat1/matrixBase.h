#include<iostream>
#include <cstdlib>
#include <ctime>
#include <iostream>
#include <unistd.h>

using namespace std;

class MatrixBase
{
public:
  void matrixDisplay(char a[10][10])  // To basically display the matrix
  {
    int i,j;
    for(i=0;i<10;i++)
    {
      for(j=0;j<10;j++)
      {
        std::cout <<a[i][j]<< '\t';
      }
      std::cout << "\n";
    }
  }
  int randomGen(int num)      //to gnerate the random number
  {
    srand((unsigned)time(0));
    int random = (rand()%num)+1;
    return random;
  }
  int getJCoordinates()
  {
    int coordinates[2]={0,0};

  }
};

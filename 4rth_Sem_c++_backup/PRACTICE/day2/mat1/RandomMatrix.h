#include<iostream>
#include <cstdlib>
#include <ctime>
#include <iostream>
#include <unistd.h>
using namespace std;

class MatrixMan
{
public:
  void matrixGen()
  {
    /* initialize random seed: */
    int a[10][10];
    int array_size=10;
    srand((unsigned)time(0));
    static int count=0;
    count++;
    clear();
    std::cout << "\nNo. of iterations"<<count<< '\n';
    int random;
    /* generate secret number between 1 and 10: */

    int i,j;
    for ( i = 0; i < array_size; i++)
    {
      for (j = 0; j < array_size; j++)
       {

         random = (rand()%10)+1;
         a[i][j]=random;
         std::cout <<a[i][j]<< '\t';
      }
      std::cout << "\n" << endl;
    }
    delay();
  }
  void clear()
  {
    cout << "\033[2J\033[1;1H";
  }
  void delay()
  {
    usleep(999999);
    cout << "\b";
  }
};

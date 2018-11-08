// A header file to contain all the functions needed for the tableClass.cpp


#include<iostream>
#include<cmath>
using namespace std;
class TableLearn
{
public:
  int TableTrain(int n)
  {
    int array[10][n];       //to make the array of 10*n 2D
    int i,j;
    for(i=1;i<=10;i++)
    {
      for(j=1;j<=n;j++)
      {
        array[i-1][j-1]=i*j;
        std::cout <<array[i-1][j-1]<<'\t';
      }
      std::cout << "\n";
    }
    return array;
  }
  int TablePredict(int x,int y,array[10][n])
  {
    array=TableTrain(n);
    if(x<10||y<n)
    return(array[x][y]);
    else
    TableTrain(max(x,y));
  }
  int max(int a,int b)   //Function to find the maximum of two numbers
  {
    int max;
    if(a>b)
    max=a;
    else
    max=b;
    return max;
  }
};

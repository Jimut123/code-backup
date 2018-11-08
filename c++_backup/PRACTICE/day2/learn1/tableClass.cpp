//The tableClass file which will contain the actual train model

#include<iostream>
#include<cmath>
#include<string>
#include "tableLearn.h"
using namespace std;
int main()
{
  int x,y;

  int predictedValue;

  string option;

  TableLearn myFirstLearn; //object of table learn


  std::cout << "\n Enter the number :" << '\n';
  std::cin >> n;

  while(option!="exit")
  {
    std::cout << "\n Enter your data which you want to find, multiplication table of [x*y] format :" << '\n';
    std::cin >>x>>y;          //x and y values are taken

    int array[10][myFirstLearn.max(x,y)];     // to make the array of the table

    std::cout <<"\nMaximum value among x and y =\n"<<myFirstLearn.max(x,y)<< '\n';


    array=myFirstLearn.TableTrain(myFirstLearn.max(x,y));  //to train the matrix model

    predictedValue=myFirstLearn.TablePredict(x,y,array[10][n]);  //to obtain the predicted value

    std::cout <<predictedValue<<'\n';
    
    std::cout << "\n Enter 'exit' to exit :" << '\n';
    getline(cin,option);     //to take in the option

  }
  return 0;
}

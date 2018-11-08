#include<iostream>
using namespace std;

class Pattern
{

public:

  void pattern1(int n)
  {
    int i,j;
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        std::cout<<"*";
      }
      std::cout << "\n";
    }
  }
  void pattern2(int n)
  {
    int i,j;
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        if(i==0||j==n-1||i==n-1||j==0)
        {
          std::cout<<"*";
        }
      }
      std::cout << "\n";
    }

  }
};

int main()
{
  Pattern myPattern;
  int i,j,n;
  std::cout << "\nEnter a number:";
  std::cin >> n;
  myPattern.pattern1(n);
  myPattern.pattern2(n);
  return 0;
}

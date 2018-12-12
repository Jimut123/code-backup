#include <cmath>
#include <iostream>
using namespace std;

class Bisection
{
  float a,b;
public:
  Bisection(float,float);
  float func(float x);
  void calculate();
};

void Bisection :: calculate()
{
  float x,f;
  x=(a+b)/2;
  f=func(x);
  cout<<"f = "<<f;
  while(abs(f) > 10e-09)
  {
    cout<<"Entered while loop"<<endl;
    x=(a+b)/2;
    cout<<"a = "<<a<<"b = "<<b<<endl;
    f=func(x);
    if(f>=0)
      b=x;
    else if(f<0)
      a=x;
  }
  cout<<"a = "<<a<<endl;
}


Bisection :: Bisection(float a,float b)
{
  Bisection::a=a;
  Bisection::b=b;
}


float Bisection :: func(float x)
{
  return (x*x-3);
}

int main()
{
  Bisection B(1,2);
  B.calculate();
  return 0;
}

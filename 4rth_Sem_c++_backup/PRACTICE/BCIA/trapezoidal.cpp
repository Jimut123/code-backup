#include <cmath>
#include <iostream>
using namespace std;

class Trapezoidal
{
  float a,b,h;
public:
  Trapezoidal(float, float, float);
  void calculate();
  float func(float);
};

Trapezoidal :: Trapezoidal(float a, float b, float h)
{
  Trapezoidal::a=a;
  Trapezoidal::b=b;
  Trapezoidal::h=h;
}
void Trapezoidal :: calculate()
{
  float n,i,x=0,sum2=0.0f,sum=0.0f;
  n = (b-a)/h;
  float sum1=0.0f;
  for(i=1;i<n;i++)
  {
    x =x +h;
    cout<<"x = "<<x;
    sum1=sum1+func(x);
    cout<<" func(x)"<<func(x);
  }
  sum2 = func(0)+func(b);
  cout<<"func(0) = "<<func(0)<<" func(b) = "<<func(b);
  sum = 0.5*h*(sum1*2+sum2);
  cout<<"Sum = "<<sum<<endl;
}

float Trapezoidal :: func(float x) {
  return (pow(x,4));
}

int main()
{
  float a,b;
  float h;
  cout<<"\n Enter the lower limit : "<<endl;
  cin>>a;
  cout<<"\n Enter the upper limit : "<<endl;
  cin>>b;
  cout<<"\n Enter the h : "<<endl;
  cin>>h;
  Trapezoidal TR(a,b,h);
  TR.calculate();
  return 0;
}

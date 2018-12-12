#include <cmath>
#include <iostream>
using namespace std;

class NewtonRaphson
{
  float xg;
public:
    NewtonRaphson(float);
    float func(float);
    float funcd(float);
    void calculate();
};

NewtonRaphson :: NewtonRaphson(float xg)
{
    NewtonRaphson::xg = xg;
}

void NewtonRaphson :: calculate()
{
  float f,fd,h;
  f = func(xg);
  fd = funcd(xg);
  h = -(f/fd);
  while(abs(h)>10e-20)
  {
    f = func(xg);
    fd = funcd(xg);
    h = -(f/fd);
    xg = xg+h;
    cout<<"h = "<<h<<"xg = "<<xg<<endl;
  }
}


float NewtonRaphson :: funcd(float x)
{
  return (2*x);
  /*
  float k = 3*x*x;
  float k1 = 12*x;
  float k3 = 11;
  float k_1 = k-k1+k3;
  cout<<k_1<<"\t";
  return (k_1);
  */
}

float NewtonRaphson :: func(float x)
{
  return (x*x-3);
  /*
  float k = x*x*x;
  cout<<k<"\t";
  float k1 = 6*x*x;
  float k3 = 11*x;
  float k_1 = k-k1+k3-6;
  cout<<k_1<<"\t";
  return (k_1);
  */
}

int main()
{
  NewtonRaphson NR(1.0f);
  NR.calculate();
  return 0;
}

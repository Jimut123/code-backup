#include<iostream>
using namespace std;
class RungeKutta
{
  float h,y0,xn;
  public:
    void input();
    float get_k1(float,float);
    float get_k2(float,float);
    void calculate();
};

float RungeKutta :: get_k1(float x0,float y0)
{
  float retval;
  retval = RungeKutta::h*y0;
  return retval;
}
float RungeKutta :: get_k2(float x0,float y0)
{
  float retval;
  retval = RungeKutta::h*y0;
  return retval;
}
void RungeKutta :: calculate()
{
  float x0=0.0f,k1,k2,y1;
  while(x0<RungeKutta::xn)
  {
    k1 = get_k1(x0,y0);
    k2 = get_k2(x0+h,y0+k1);
    y1 = y0 + 0.5*(k1+k2);
    cout<<"\n k1 = "<<k1<<" k2 = "<<k2<<" y0 = "<<y0<<" y1 = "<<y1<<endl;
    x0+=RungeKutta::h;
    y0=y1;
  }
  cout<<"The value = "<<y0<<endl;
}

void RungeKutta :: input()
{
  cout<<"\n Enter the value of h : "<<endl;
  cin>>RungeKutta::h;
  cout<<"\n Enter the value of y0 : "<<endl;
  cin>>RungeKutta::y0;
  cout<<"\n Enter the value of xn : "<<endl;
  cin>>RungeKutta::xn;
}


int main()
{
  RungeKutta RK;
  RK.input();
  RK.calculate();
  return 0;
}

#include<iostream>
using namespace std;
class RungeKutta4
{
  float h,y0,xn;
  float x0,k1,k2,y1,k3,k4;
  public:
    RungeKutta4(){x0==0.0f;}
    void input();
    float get_k1(float,float);
    float get_k2(float,float);
    float get_k3(float,float);
    float get_k4(float,float);
    void calculate();
};

float RungeKutta4 :: get_k1(float x0,float y0)
{
  float retval;
  retval = RungeKutta4::h*y0;
  return retval;
}
float RungeKutta4 :: get_k2(float x0,float y0)
{
  float retval;
  retval = RungeKutta4::h*(y0+k1/2);
  return retval;
}
float RungeKutta4 :: get_k3(float x0,float y0)
{
  float retval;
  retval = RungeKutta4::h*(y0+k2/2);
  return retval;
}
float RungeKutta4 :: get_k4(float x0,float y0)
{
  float retval;
  retval = RungeKutta4::h*(y0+k3);
  return retval;
}
void RungeKutta4 :: calculate()
{

  while(x0<RungeKutta4::xn)
  {
    k1 = get_k1(x0,y0);
    k2 = get_k2(x0,y0);
    k3 = get_k3(x0,y0);
    k4 = get_k4(x0,y0);
    y1 = y0 + (float)(1/6.0f)*(k1+2.0f*k2+2.0f*k3+k4);
    cout<<"\n "<<"k1 = "<<k1<<" k2 = "<<k2<<"k3 = "<<k3<<" k4 = "<<k4<<" y0 = "<<y0<<" y1 = "<<y1<<endl;
    x0+=RungeKutta4::h;
    y0=y1;
  }
  cout<<"The value = "<<y0<<endl;
}

void RungeKutta4 :: input()
{
  cout<<"\n Enter the value of h : "<<endl;
  cin>>RungeKutta4::h;
  cout<<"\n Enter the value of y0 : "<<endl;
  cin>>RungeKutta4::y0;
  cout<<"\n Enter the value of xn : "<<endl;
  cin>>RungeKutta4::xn;
}


int main()
{
  RungeKutta4 RK;
  RK.input();
  RK.calculate();
  return 0;
}

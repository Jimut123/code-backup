#include <cmath>
#include <iostream>
using namespace std;

class Simpson
{
  float a,b,h;
public:
  Simpson(float, float, float);
  void calculate();
  float func(float);
};

Simpson :: Simpson(float a, float b, float h)
{
  Simpson::a=a;
  Simpson::b=b;
  Simpson::h=h;
}
void Simpson :: calculate()
{
  float sume=0.0f,sumo=0.0f,sumno=0.0f,x,tot,tot1,tot2,totf;
  int i;
  sumno=func(0)+func(b);
  float n;
  n=(b-a)/h;
  for(i=1;i<n;i++)
  {
    x=x+h;
   if(i%2==0)
      sume+=func(x);
   if(i%2!=0)
      sumo+=func(x);

  }
  cout<<"Sum even = "<<sume<<"Sum odd = "<<sumo<<" ";
  tot1 = (float)4*sumo;
  tot2 = (float)2*sume;
  tot = sumno+tot1+tot2;
  //cout<<"Total = "<<tot;
  totf = tot*0.333333*h;
  cout<<"Total = "<<totf<<endl;
}

float Simpson :: func(float x) {
  return (4/(1+x*x));
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
  Simpson SI(a,b,h);
  SI.calculate();
  return 0;
}

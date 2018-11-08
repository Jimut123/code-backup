#include<iostream>
using namespace std;
class base
{
  public:
    virtual void vfun()
    {
      cout<<"Base class function";
    }
};

class derived1 : public base
{
  public:
    void vfun()
    {
      cout<<"Derived1 class function";
    }
};

class derived2 : public base
{
  public:
    void vfun()
    {
      cout<<"Derived2 class function";
    }
};

int main()
{
  base *p,b;
  derived1 d1;
  derived2 d2;
  p = &b;
  p->vfun();
  p = &d1;
  p->vfun();
  p = &d2;
  p->vfun();
  return 0;
}

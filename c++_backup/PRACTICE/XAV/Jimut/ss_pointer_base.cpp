#include<iostream>
using namespace std;

class BC
{
  public:
    int b;
    void show()
    {
      cout<<"b = "<<b;
    }
};

class DC : public BC
{
  public:
    int d;
    void show()
    {
      cout<<"b = "<<b<<"d = "<<d;
    }
};

int main()
{
  BC *bptr;
  BC bax;
  bptr = & bax;
  bptr->b = 100;
  bptr->show();
  DC derived;
  bptr = &derived;
  bptr->b=200;
  //bptr->d=300;  // cannot acess derived class
  bptr->show();
  DC *dptr;
  dptr = &derived;
  dptr->d = 900;
  dptr->show();
  ((DC*)bptr)->d=500;
  ((DC*)bptr)->show();
  return 0;
}

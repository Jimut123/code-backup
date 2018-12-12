#include"iostream.h"
#include"conio.h"
void sum(int,int);
int main()
{
     void (*p)(int,int);
     int a,b;
     cin>>a;
     cin>>b;
     p=&sum;
     p(a,b);
     getch();
     return 0;
     }
void sum(int x,int y)
{
     int z;
     z=x+y;
     cout<<z<<endl;
     }

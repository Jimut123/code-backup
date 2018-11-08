#include"iostream.h"
#include"conio.h"
int sum(int,int);
int main()
{
     int (*p)(int,int);
     int a,b,c;
     cin>>a;
     cin>>b;
     p=&sum;
     c=p(a,b);
     cout<<c<<endl;
     getch();
     return 0;
     }
int sum(int x,int y)
{
     int z;
     z=x+y;
     return z;
     }

#include"iostream.h"
#include"conio.h"
int main()
{
     int i,n;
     cout<<"enter any number";
cin>>n;
     for(i=1;i<=n;i++)
     if(n%i==0)
     cout<<i<<",";
     getch();
     return 0;
 }

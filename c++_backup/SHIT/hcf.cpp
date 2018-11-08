#include"iostream.h"
#include<conio.h>
int main()
{
   //clrscr();
   int a,b,c;
   cout<<"enter hcf for two no"<<endl;
   cin>>a;
   cin>>b;
   while(a%b!=0)
    {
     c=a%b;
     a=b;
     b=c;
    }
   cout<<b;
   getch();
   return 0;
}    

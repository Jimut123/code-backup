#include"iostream.h"
#include<conio.h>
int main()
{
   // clrscr();
    int n,i,j,f;
    cout<<"enter two no for their sum"<<endl;
    cin>>n;
    
    for(i=1;i<=n;i++)
    {
      f=0;
      for(j=2;j<i;j++)
      if(i%j==0)
      {
        f=1;
        break;
      }
     if(f==0)
     cout<<i*i<<",";
     }
    getch();
    return 0;
}                               

#include"iostream.h"
#include<conio.h>
int main()
{
    //clrscr();
    int n,i,j,k,n1,sum=0;
    cin>>n;
    sum=0;n1=n;
    while(n>0)
    {
      k=n%10;
      sum=(sum*10)+k;
      n=n/10;
    }
      cout<<n<<endl;
      if(n1==sum)
           cout<<"palindrome"<<endl;
      else
      cout<<"not a palindrome"<<endl;
      getch();
      return 0;
}        

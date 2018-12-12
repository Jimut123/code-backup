#include<iostream.h>
class menu
{
      public:
      void input()
      {
           int sqrt,n,i,f,k,j;
           cout<<"input an integer"<<endl;
           cin>>n;
      cout<<"some operations can be carried out input 1.prime check"<<"2.whole square"<<endl;
      cin>>k;
           switch(int k)
           {
                      case 1:
                      
                           f=0;
 for(i=2;i<n;i++)
 {
                 if (n%i==0)
                 {
                 f++;
                 break;
                 }
                 }
                 if(f==0)
                 cout<<"prime number found="<<n<<endl;
                 break;
                 case 2:
                sqrt=n*n;
                cout<<sqrt;
                break;
                default:cout<<"error"<<endl;
                     
                }
                }}; 
                int main()
                {
                     menu m;
                     m.input();
                     return 0;
                     }
                            
      

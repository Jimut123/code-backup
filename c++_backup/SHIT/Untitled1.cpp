# include "iostream.h"
int main ()
{
     int s  ,a , b , p , r , t , ch;
     cout <<" Enter three numbers " << endl;
     cin>>p>>r>>t>>a>>b;
     cout <<" enter 1 for swap "<< endl;
     cout <<" enter 2 for interest "<<endl;
     cout <<" enter 3 for temperature "<<endl;
     cin >>ch;
     switch (ch)
     {
            case 1:
                 a = a + b;   
                 b = a - b;
                 a = a - b;
                 cout << a << endl;
                 cout << b << endl;
                 break;
                 case 2:
                      s = (p * r * t)/ 100;
                      cout << s << endl;
                      break;
                      case 3:
                           s = f = ( 9 * c + 100 )/5;
                           cout << s << endl;
                           break;
                           default :
                                   cout << "wrong choice "<< endl;
                                   return o ;
                                   }
                                   }

#include<iostream.h>
#include<math.h>
int main()
{
    double a,b,c,x,f1,f2;
    cout<<"enter the coefficients of ax^2+bx+c=0";
    cin>>a>>b>>c;
    f1=(b+sqrt(pow(b,2)-4*a*c))/(2*a);
    f2=(-b-sqrt(pow(b,2)-4*a*c))/(2*a);
    cout<<"the roots of the equation are:"<<f1<<"and"<<f2<<endl;
}

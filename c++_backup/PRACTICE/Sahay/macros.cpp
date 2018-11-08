#include<iostream>
using namespace std;
//inline double cube(double x) {return x*x*x; }
#define cube(x) (x*x*x)
int main()
{
        double a,b;
        double c=13.0;
        a=cube(5.0);
        b= cube(4.5+7.5);
        cout<<a<<endl;
        cout<<b<<endl;
        cout<<cube(c++)<<endl;
        cout<<c<<endl;
        return 0;
}




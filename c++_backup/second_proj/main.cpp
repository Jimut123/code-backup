#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a = 5, b = 8, maximum;
    maximum = max(a,b);
    std::cout<<"Maximum : "<<maximum<<std::endl;
    swap(a,b);
    std::cout<<"a = "<<a<<" b = "<<b<<std::endl;

    int num = 2;
    double cubic_root;
    cubic_root = pow((double)2,1.0/300);
    cout<<fixed<<setprecision(100)<<"cubic root : "<<cubic_root<<endl;
    cout<<fixed<<setprecision(10)<<"cubic root : "<<cubic_root<<endl;
    cout<<fixed<<setprecision(3)<<"cubic root : "<<cubic_root<<endl;
    return 0;
}

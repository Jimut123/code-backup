
//
// Created by jimut on 20/2/18.
//

// Template class example
#include <iostream>
using namespace std;

const int size = 3;

template <class T>
class vector
{
    T* v;
public:
    vector()
    {
        v = new T[size];
        for(int i=0;i<size;i++)
        {
            v[i]=0;
        }
    }
    vector(T *a)
    {
        for(int i=0;i<size;i++)
            v[i]=a[i];
    }
    T operator*(vector &y)
    {
        T sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=this->v[i]*y.v[i];
        }
        return sum;
    }
};

int main()
{
    int x[3] = {1,2,3};
    int y[3] = {4,5,6};
    vector <int> v1;
    vector <int> v2;
    v1 = x;
    v2 = y;
    int R = v1*v2;
    cout<<"R = "<<R<<"\n";
    return 0;

}

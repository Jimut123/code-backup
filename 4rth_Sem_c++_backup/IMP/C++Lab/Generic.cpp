#include<iostream>
using namespace std;
template <class T>
class Generic
{
T *A;
int n;
T search;
public :
Generic();
~Generic();
void linear_search();
};
template <class T>
Generic<T>::Generic()
{
cout<<"Enter size of array"<<endl;
cin>>n;
A=new T[n];
cout<<"Enter array elements"<<endl;
for(int i=0;i<n;i++)
{
cout<<"A["<<i<<"] = ";
cin>>A[i];
}
cout<<"Enter elements to be searched"<<endl;
cin>>search;
}
template <class T>
inline Generic<T>::~Generic()
{
}
template <class T>
void Generic<T>::linear_search()
{
int h=0;
for(int i=0;i<n;i++)
{
if(search==A[i])
{
h=1;
cout<<"Element found"<<endl;
break;
}
}
if(h==0)
cout<<"Element not found"<<endl;
}
int main()
{
int b;
while(1)
{
cout<<"Enter 1 for int, 2 for float, 3 for char, -1 to exit"<<endl;
cin>>b;
if(b==1)
{
Generic<int> f;
f.linear_search();
}
else if(b==2)
{
Generic<float> f;
f.linear_search();
}
else if(b==3)
{
Generic<char> f;
f.linear_search();
}
else if(b==-1)
break;
}
return 0;
}

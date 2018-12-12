#include<iostream>
using namespace std;

template <class T, int N>
T fixed_multiply(T val)
{
	return val*N;
}
template < class J, int N>
J fixed_sum(J val)
{
	return (J)val*N;
}
int main()
{
	cout<<fixed_multiply<int,2>(10)<<"\n";
	cout<<fixed_multiply<int,3>(10)<<"\n";
	cout<<fixed_sum<float,7>(7.0)<<"\n";
	return 0;
}







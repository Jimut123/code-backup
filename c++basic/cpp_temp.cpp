#include <iostream> 
using namespace std; 

template<typename T>
T myMax(T x, T y)
{
	return (x>y)?x:y;
}

int main()
{
	cout<<myMax<int>(3,7)<<endl;
	cout<<myMax<double>(3.9,7.78)<<endl;
	cout<<myMax<char>('e','g')<<endl;
	return 0;
	

}



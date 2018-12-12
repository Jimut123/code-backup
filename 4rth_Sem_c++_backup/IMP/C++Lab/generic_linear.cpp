/*
Design a program for linear search and use template concepts
*/
#include <iostream>
using namespace std;
template<class T>
class Linear
{
	T *array;
	int size;
 public:
	Linear(int n);
	~Linear();
	void linear(T);
};
template<class T>
Linear<T> :: Linear(int n)
{
	size = n;
	array = new T[size];
}
template<class T>
Linear<T> :: ~Linear()
{
	delete array;
}
template <class T>
void Linear<T> :: linear(T data)
{
	int flag = 0;
	for(int i = 0; i < size; i++)
	{
		if(array[i] == data)
		{
			flag = 1;
			break;
		}
		
	}
	if(flag == 1)
		cout << data << " Found in the array" << endl;
	else
		cout << data << " don't exists in the array" << endl;
}
int main()
{
	int n;
	cout << "Enter the size: ";
	cin >> n;
	int array[n];
	Linear<int> obj1(n);
	cout << "Enter data one by one--->\n";
	for(int i = 0; i < n; i++)
	{
		cout << "array[" << i << "] = ";
		cin >> array[i];
	}
	int key;
	cout << "Enter Key: ";
	cin >> key;
	obj1.linear(key);
	return 0;
}
	

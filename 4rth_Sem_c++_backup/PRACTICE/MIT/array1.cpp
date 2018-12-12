#include<iostream>
using namespace std;

int sum(const int array[], const int length)
{
	long sum = 0;
	for (int i = 0; i < length; sum += array[i++]);
	
	return sum;
}

int main()
{
	int arr[] = {1, 2, 3, 4, 5, 6, 7};
	cout << "Sum : "<< sum(arr,7)<< endl;
	return 0;
}


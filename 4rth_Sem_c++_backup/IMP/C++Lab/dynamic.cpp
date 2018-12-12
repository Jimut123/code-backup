#include <iostream>
using namespace std;

class Array
{
	int size;
	int *a;
 public:
	Array(int);
	void input();
	void sort();
	void display();
	void search(int);
	~Array();
};
Array :: Array(int number)
{
	size = number;
	a = new int[size];
}
void Array :: input()
{
	cout << "Enter the Values in the array\n";
	for(int i = 0; i < size; i++)
	{	
		cout << "Enter a[" << i << "] = ";
		cin >> a[i];
	}
}	
void Array :: sort()
{
	int temp;
	for(int i = 0; i < size; i++)
		for(int j = i+1; j < size; j++)
			if(a[i] > a[j])
			{
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
}
void Array :: search(int key)
{
	for(int i = 0; i < size; i++)
		if(a[i] == key)
		{
			cout << "Found " << key << " at position " << i + 1 << endl;
			return;
		}
	cout << "Sorry! Your Search for " << key << " is not Successful." << endl;
}
void Array :: display()
{
	for(int i = 0; i < size; i++)
		cout << a[i] << endl;
}
Array :: ~Array()
{
	delete a;
}
int main()
{
	Array obj(10);
	char choice;
	obj.input();
	obj.display();
	cout << "Sorted Array is as follow--->\n";
	obj.sort();
	obj.display();
	int key;
	do
	{
		cout << "Enter The Key to Search: ";
		cin >> key;
		obj.search(key);
		cout << "Do you want to search more(Y/N): ";
		cin >> choice;
	}while(choice == 'Y' || choice == 'y');
	return 0;
}
		

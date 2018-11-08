/*
Design an application to implement the inheritance property using a base class
class called Stack and derived class called MyStack
*/
#include <iostream>
using namespace std;
class Stack
{
 private:
	int *array;
 protected:
	int top, size;
 public:
	Stack(int);
	void push(int n);
	int pop();
	void display();
};
class MyStack : public Stack
{
 public:
	MyStack(int);
	void push(int n);
	int pop();
	void display();
};
inline Stack :: Stack(int n)
{
	size = n;
	top = -1;
	array = new int(sizeof(int) * size);
}
inline void Stack :: push(int n)
{
	array[++top] = n;
}
inline int Stack :: pop()
{
	int temp;
	temp = array[top];
	top--;
	return temp;
}
inline void Stack :: display()
{
	for(int i = top; i >= 0; i--)
		cout << array[i] << endl;
}
inline MyStack :: MyStack(int n) :Stack(n)
{
}
inline void MyStack :: push(int n)
{
	if(top == size - 1)
	{
		cout << "Stack Overflow" << endl;
		return;
	}
	Stack :: push(n);
}
inline int MyStack :: pop()
{
	if(top == -1)
	{
		cout << "Stack Underflow" << endl;
		return 99999;
	}
	Stack :: pop();
}
inline void MyStack :: display()
{
	if(top == -1)
	{
		cout << "Stack is Empty!" << endl;
	}
	else
		Stack :: display();
}
int main()
{
	int size, n;
	cout << "Enter the Size of the array: ";
	cin >> size;
	MyStack obj(size);
	int choice;
	do
	{
		cout << "Select an Option\n\t1.Insertion\n\t2.Deletion\n\t3.Display\n\t4.Exit\n";
		cout << "Enter your choice: ";
		cin >> choice;
		switch(choice)
		{
			case 1: 
				cout << "Enter the Data: ";
				cin  >> n;
				obj.push(n);
				break;
			case 2:
				cout << "You just popped out: " << obj.pop() << endl;
				break;
			case 3:
				obj.display();
				break;
			case 4:
				cout << "See you soon!" << endl;
				exit(0);
			default: 
				cout << "Sorry!, Wrong Option -_-" << endl;
				break;
		}
	}while(choice != 4);
	return 0;
}
	

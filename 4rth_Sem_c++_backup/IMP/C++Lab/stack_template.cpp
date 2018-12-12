/*
Design an application to implement the inheritance property using a base class
class called Stack and derived class called MyStack
Use Template Concepts**
*/
#include <iostream>
using namespace std;
template <class T, int n>
class Stack
{
 private:
	T *array;
 protected:
	int top;
	int size;
 public:
	Stack();
	void push(T data);
	T pop();
	void display();
};
template <class T, int n>
class MyStack : public Stack<T, n>
{
 public:
	MyStack();
	void push(T data);
	T pop();
	void display();
};
template <class T, int n>
inline Stack<T, n> :: Stack()

{
	size = n;
	top = -1;
	array = new T(sizeof(T) * size);
}
template <class T, int n>
inline void Stack<T, n> :: push(T data)
{
	array[++top] = data;
}
template <class T, int n>
inline T Stack<T, n> :: pop()
{
	T temp;
	temp = array[top];
	top--;
	return temp;
}
template <class T, int n>
inline void Stack<T, n> :: display()
{
	for(int i = top; i >= 0; i--)
		cout << array[i] << endl;
}
template <class T, int n>
inline MyStack<T, n> :: MyStack()
{

}
template <class T, int n>
inline void MyStack<T, n> :: push(T data)
{
	if(Stack<T, n>::top == Stack<T, n>::size - 1)
	{
		cout << "Stack Overflow" << endl;
		return;
	}
	Stack<T, n> :: push(data);
}
template <class T, int n>
inline T MyStack<T, n> :: pop()
{
	if(Stack<T, n> :: top == -1)
	{
		cout << "Stack Underflow" << endl;
		return 99999;
	}
	Stack<T, n> :: pop();
}
template <class T, int n>
inline void MyStack<T, n> :: display()
{
	if(Stack<T, n> :: top == -1)
	{
		cout << "Stack is Empty!" << endl;
	}
	else
		Stack<T, n> :: display();
}
int main()
{
	int size;
	cout << "Enter the Size of the array: ";
	cin >> size;
	int n;
	MyStack<int, 5> obj;
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
	

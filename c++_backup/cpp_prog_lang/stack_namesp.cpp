#include<iostream>
namespace Stack
{
	const int max_size = 5;
	char v[max_size];
	int top=0;
	void push(char c)
	{
		if(top>max_size)
			std::cout<<"Overflow!\n";
		else
			v[top++]=c;
	}
	char pop()
	{
		if(top==-1)
			std::cout<<"Underflow!\n";
		else{
			std::cout<<"Popped value : "<<v[top--]<<std::endl;
			return v[top--];
		}
	}
}
int main()
{
	Stack::push('c');
	if (Stack::pop()!='c') perror("Impossible!");
	return 0;
}
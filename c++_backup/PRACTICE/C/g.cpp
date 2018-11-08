#include<iostream>
#include<vector>
#include<string>
#include<fstream>

int fact(int num)
{
	if (num == 1)
	{
		return 1;
	}
	else
	{
		return num*fact(num-1);
	}
}


int main()
{
	int n;
	std::cout<<"\n Enter a number : "<<std::endl;
	std::cin>>n;
	auto k = fact(n);
	std::cout<<"\n The factorial of "<<n<<" is = "<<k<<std::endl;
	return 0;
}

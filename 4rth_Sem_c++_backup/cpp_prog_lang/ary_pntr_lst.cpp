// In Python's when list1 = list2 is done, this shit happens :
#include<iostream>
int main()
{
	std::cout<<"\n Enter the size of the array :"<<std::endl;
	int n,i;
	std::cin>>n;
	int v1[10];
	int *v2[10];
	std::cout<<"\n Enter the values of vector1 :"<<std::endl;
	for(i=0;i<n;i++)
	{
		std::cin>>v1[i];
	}
	for(i=0;i<n;i++)
	{
		std::cout<<"\n Copying the vector...address wise"<<std::endl;
		v2[i] = &v1[i];
		std::cout<<"v2["<<i<<"] : "<<v2<<std::endl;
	}
	for(i=0;i<n;i++)
	{
		std::cin>>v1[i];
		std::cout<<*v2[i]<<std::endl;
	}
	return 0;
}

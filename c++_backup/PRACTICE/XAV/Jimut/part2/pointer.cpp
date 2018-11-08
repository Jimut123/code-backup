#include<iostream>
using namespace std;

class Array
{
	int *a,s;	
	public:
		Array(int);
		input(int s);
		~Array();
};
inline Array::Array(int s)
{
	cout<<"\n Constructed!!";
	Array::s=s;
	a = new int[s];
}
inline Array::~Array()
{
	delete a;
	cout<<"\n Destroyed! ";
}
void input(int s)
{
	int i;
	cout<<"\n Enter the elements one by one :";
	for( i=0;i<s;i++)
		cin>>a[i];
	for( i=0;i<s;i++)
        	cout<<a[i]<<"  ";

}
int main()
{
	int n;
	cout<<"\n Enter the no. of elements in the array :"<<endl;
	cin>>n;
	Array obj(n);
	obj.input(n);	
	return 0;
}












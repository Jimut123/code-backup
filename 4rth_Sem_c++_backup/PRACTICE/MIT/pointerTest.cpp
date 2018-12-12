#include<iostream>
using namespace std;

int main()
{
	long arr[] = {6, 0, 9, 6};
	long *ptr = arr;

	cout<<"\nTo display the array :: \n"<<endl;
	int i;
	for(i=0;i<=3;i++)
		cout<<arr[i]<< ' ';
	cout<<"\n *ptr : " <<*ptr <<endl;
	ptr++;
	cout<<"\n *ptr : " <<*ptr <<endl;

}

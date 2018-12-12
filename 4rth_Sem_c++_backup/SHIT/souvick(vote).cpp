/*C++ program to check the eligibility of a voter*/
# include <iostream.h>
int main()
{
	int age;
	
    cout<<"please enter your age";
	cin>>age;	
	if(age>=18)
	cout<<"you are eligible to vote";
	else
	cout<<"you are not eligible to vote";
	return 0;
}
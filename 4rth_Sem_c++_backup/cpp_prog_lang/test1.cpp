#include<iostream>
bool accept3()
{
	int tries  = 1;
	while(tries<4){
		std::cout<<"\n Do you want to proceed? (y/n)\n";
		char ans=0;
		std::cin>>ans;
		switch(ans){
			case 'y':
				return true;
			case 'n':
				return false;
			default:
				std::cout<<"Sorry! I didn't get that!\n";
			tries++;
		}
	}
	std::cout<<"\n I'll take that for a no!\n";
	return false;
}
int main()
{
	std::cout<<"\n Enter a number :\n";
	bool acc = accept3();
	if (acc == true)
		std::cout<<"yes! so proceeding!"<<std::endl;
	else
		std::cout<<"nopes! quiting!"<<std::endl;
	return 0;
}

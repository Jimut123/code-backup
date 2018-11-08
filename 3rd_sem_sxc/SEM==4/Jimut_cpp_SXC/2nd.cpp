#include<iostream>
using namespace std;

class C
{
	private:
		int n;
		int sum;
	public:
		void input();
		void summation();
		void valn();
		void suma();
};

void C::input()
{
	//int n;
	cout<<"\n Enter the value of n :"<<endl;
	cin>>n;
}

void C::summation()
{
	int i;
	sum=0;
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	}
}

void C::valn()
{

	cout<<"\n The value of n :"<<n;
}
void C::suma()
{
	cout<<"\n The sum = "<<sum;
}

int main()
{
	C obj;
	obj.input();
	cout<<"\n";
	obj.summation();	
	cout<<"\n";
	obj.valn();
	cout<<"\n";
	obj.suma();
	cout<<"\n";
	return 0;
}

#include<iostream>
#include<cmath>
using namespace std;

class kaprekar
{
	int k,nod;
	public:
		kaprekar();
		kaprekar(int);
		void calculate();
		void nodig();
};

void kaprekar::nodig()
{
	int p=k,n=0;
	while(p!=0)
	{	
		n=n+1;
		p=p/10;
	}
	nod = n;	// calculating the number of digits
}
kaprekar::kaprekar()
{
	k=0;
	nod=0;
}
kaprekar::kaprekar(int n)
{
	k=n;
	nod=0;
}
void kaprekar::calculate()
{
	int m1,m2,sum=0;
	m1 = (k*k)%(int)(pow(10,nod));
	m2 = (k*k)/(int)(pow(10,nod));
	sum=m1+m2;
	if(sum==k)
		cout<<"kaprekar no."<<endl;
	else
		cout<<"not a kaprekar no."<<endl;
	
}

int main()
{
	int kap;
	cout<<"\n Enter a number to check whether kaprekar or not :: "<<endl;
	cin>>kap;
	kaprekar K(kap);
	K.nodig();
	K.calculate();
	return 0;
}













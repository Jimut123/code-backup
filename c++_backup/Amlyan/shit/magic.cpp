#include<iostream>
using namespace std;
const int size = 50;

class Keith
{
	int k_no;
	int a[size];
	public:
		Keith();
		Keith(int);
		void calculate();
		int sum(int,int,int);
		void display(int);
		int dig();
};

int Keith::dig()
{
	int n=k_no,digit=0;
	while(n!=0)	
	{
		digit++;
		n=n/10;
	}
	return digit;
}

void Keith::display(int n)
{
	int i;
	cout<<endl;
	for(i=0;i<n;i++)
		cout<<a[i]<<"\t";
	cout<<endl;
	
}
int Keith::sum(int a1,int b1,int c1)
{
	return (a1+b1+c1);
}
Keith::Keith()
{
	k_no=0;
}
Keith::Keith(int k_no)
{
	Keith::k_no=k_no;
}

void Keith::calculate()
{
	int d,k = k_no,count=dig();
	
	while(k!=0)
	{
		d=k%10;
		a[count--]=d;
		k=k/10;	
	}
	int temp=a[2];count=dig();
	int dummy=0;
	while(temp <= k_no)
	{
		//cout<<"while";		
		a[count+1]=sum(a[count-2],a[count-1],a[count]);
		temp=a[count+1];
		if(temp==k_no)
	        {
		        cout<<"Keith no."<<endl;
			dummy=1;
			break;
		}
		count++;
		display(count);
	}
	if(dummy==0)
		cout<<"not a Keith no."<<endl;
	
	
}

int main()
{
	cout<<"\n Enter a number to check whether it is a Keith no. or not ::"<<endl;
	int n;
	cin>>n;
	Keith K(n);	
	K.calculate();
	return 0;
}

















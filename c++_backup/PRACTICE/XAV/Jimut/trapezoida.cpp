#include<iostream>
#include<cmath>
using namespace std;
float arr[100];
class TRAP
{
	public:
		float func_trap(float x);
		float gen_all(float a,float b,int n);
		
};

float TRAP :: func_trap(float x)
{
	return (4/(1+x*x));
}

float TRAP :: gen_all(float a, float b,int n)
{
	// To calculate h
	float h =(float)(b-a)/n;
	cout<<"h = "<<h<<endl;
	float i;
	float gen=0;
	int count = 0;
	for(i=a;i<=b+h;i+=h)
	{
		arr[count]=func_trap(i);
		cout<<i<<"\t"<<arr[count]<<endl;
		count++;	
		//arr[count++] = i;	
	}
	int i1;
	for(i1=1;i1<count-1;i1++)	
	{
		gen+=arr[i1];
	}
	gen=2*gen;
	gen=gen+arr[0]+arr[count-1];
	gen = 0.5*h*gen;
	return gen;
}
int main()
{
	TRAP T;
	int n;
	//cout<<T.func_trap(2);
	cout<<"\n Enter the no. of intervals ::"<<endl;
	cin>>n;
	float h = T.gen_all(0,1,n);
	cout<<"Integral = "<<h<<endl;
	return 0;
}













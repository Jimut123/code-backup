#include<iostream>
#include<cmath>
using namespace std;
float arr[100];
class SIMP
{
	public:
		float func_simp(float x);
		float gen_all(float a,float b,int n);
		
};

float SIMP :: func_simp(float x)
{
	return (4/(1+x*x));
}

float SIMP :: gen_all(float a, float b,int n)
{
	// To calculate h
	float h =(float)(b-a)/n;
	cout<<"h = "<<h<<endl;
	float i;
	float gen_odd=0,gen_ev=0;
	int count = 0;
	for(i=a;i<=b+h;i+=h)
	{
		arr[count]=func_simp(i);
		cout<<i<<"\t"<<arr[count]<<endl;
		count++;	
		//arr[count++] = i;	
	}
	int i1;
	for(i1=1;i1<count-1;i1++)	
	{
		if(i1%2==0)
		{
			cout<<i1<<"even "<<arr[i1]<<endl;
			gen_ev+=arr[i1];
		}
		else
		{
			cout<<i1<<"odd "<<arr[i1]<<endl;
			gen_odd+=arr[i1];
		}
		
	}
	float gen=0;
	cout<<"h = "<<h<<endl;
	cout<<"gen_ev = "<<gen_ev<<endl;
	cout<<"gen_odd = "<<gen_odd<<endl;
	cout<<"arr[0] = "<<arr[0]<<" arr[i1] = "<<arr[i1]<<endl;
	float sum1=arr[0]+arr[i1-1]+2*gen_ev+4*gen_odd;
	cout<<sum1<<endl;
	gen = h*(sum1);
	gen=gen/3;
	cout<<gen<<endl;
	return gen;
}
int main()
{
	SIMP S;
	int n;
	//cout<<T.func_trap(2);
	cout<<"\n Enter the no. of intervals ::"<<endl;
	cin>>n;
	float h = S.gen_all(0,1,n);
	cout<<"Integral = "<<h<<endl;
	return 0;
}













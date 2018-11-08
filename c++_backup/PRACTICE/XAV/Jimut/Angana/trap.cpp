#include<iostream>
#include<cmath>
using namespace std;
class trap
{
	public:
	float func(float);
	float trapezoidal(float a, float b, int n);
};
float trap::func(float a)
{
	float r=(1+a*a);
	float f=1/r;
	r=4*f;
	return r;
}
float trap::trapezoidal(float a, float b, int n)
{
	float h=(float)(b-a)/n;
	float fx[n+1][2];
	for(int i=0;i<n+1;i++)
	{
		fx[i][0]=a+i*h;
		fx[i][1]=func(fx[i][0]);
	}
	cout<<"\nThe initial value matrix is ....\n";
	for(int i=0;i<n+1;i++)
	cout<<fx[i][0]<<"\t"<<fx[i][1]<<endl;
	float sum=0;
	for(int i=1;i<n;i++)
	sum+=fx[i][1];
	float s=(fx[0][1]+fx[n][1]+2*sum);
	s=s*h;
	float I=s/2;
	return I;
}
int main()
{
	int n;
	float a,b;
	cout<<"\nEnter the lower limit, uper limit and number of intervals";
	cin>>a;
	cin>>b;
	cin>>n;
	trap ob;
	float y=ob.trapezoidal(a,b,n);
	cout<<"\nThe answer is :"<<y<<endl;
	return 0;
}


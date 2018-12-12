using namespace std;
#include<iostream>
#include<cmath>
class newr
{
	float a, b, c;
	public:
	//void input(float, float);
	float func(float);
	float bisection(float, float);
};
float newr::bisection(float a1, float b1)
{
	a=a1;
	b=b1;

	float f1=func(a);
	float f2=func(b);
	c=(a+b)/2;
	if(f1*f2<0)
	{
		if(func(a)>0)
		{float p=a;
		a=b;
		b=p;}
		while(!(func(c)<0.000001&&func(c)>-0.000001))
		{
			if(func(c)<0)
			a=c;
			else
			b=c;
			c=(a+b)/2;
		}
	}
	
	return c;
}
float newr::func(float x)
{
	float y;
	y=x*x-3;
	return y;
}
int main()
{
	cout<<"hi\n";
	float x[10];
	cout<<"\nEnter the number of sunintervals.\n";
	int n=0;
	cin>>n;
	newr obj;
	cout<<"\nEnter the values of the subintervals\n";
	for(int i=0;i<n;i++)
	cin>>x[i];
	cout<<"\nThe root(s)...\n";
	for(int i=0;i<n-1;i++)
	{
		float r=obj.bisection(x[i],x[i+1]);
		cout<<r<<"\n";
	}
	return 0;
}

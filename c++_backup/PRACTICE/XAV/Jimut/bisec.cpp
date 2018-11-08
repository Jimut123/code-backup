#include<iostream>

using namespace std;


class BISECTION
{
public:
	int bisection(float x[10]);
	float function_1(float a);
};


int BISECTION :: bisection(float x[10])
{
	float a,b,c,x1,f1,f2,f3,f12,ff;
	a = -50;
	for(x1=-49.99;x1<=50;x1+=0.01)
	{
		b=x1;
		f1=function_1(a);
		f2=function_1(b);
		f12=f1*f2;
		if(f12<0)
		{
		do
		{
			c=(a+b)/2;
			f3=function_1(c);
			if(f3<0 &&f1<0)
			a=c;
			else if(f3<0&&f2<0)
			b=c;
			else if(f3>0&&f1>0)
			a=c;
			else if(f3<0 && f2>0)	
			b=c;
			else if(f3>0&&f1<0)
			b=c;
			
			f1=function_1(a);
			f2=function_1
		}
		}
	}
}



float RAPHSON :: function_1(float x1)
{
	float y;
	y=x1*x1-3;
	return y;
}

float RAPHSON :: function_1d(float x1)
{
	float y;
	y=2*x1;
	return y;
}

int main()
{
	float x[10];
	int i,n;
	system("clear");
	RAPHSON R;
	n=R.raphson(x);
	cout<<endl<<"Roots are --> \n";
	for(i=0;i<n;i++)
	cout<<"x["<<"]="<<x[i]<<endl;
	return 0;
}


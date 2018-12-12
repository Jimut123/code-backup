	//newton_raphson_method.cpp : Write a program to implement newton raphson
	//method to solve non-linear equation.
	using namespace std;
	#include<iostream>
	class RAPHSON
	{
	public: 
		int raphson(float x[10]);
		float function_1(float x1);
		float function_1d(float x1);
	};
	
	int RAPHSON :: raphson(float x[10])
	{
	float xg,h,a,b,hh,f1,f2,f12,x1;
	int i,n;
	a=-50;
	n=0;
		for(x1=-49.99;x1<=50;x1=x1+.01)
		{
		b=x1;
		f1=function_1(a);
		f2=function_1(b);
		f12=f1*f2;
			if(f12<0)
			{
			xg=(a+b)/2;
				do
				{
				h=-function_1(xg)/function_1d(xg);
				xg=xg+h;
					if(h<0)
					hh=-h;
					else
					hh=h;
					if(hh<1e-6)
					{
					x[n++]=xg;
					break;
					}
				}while(1==1);
			}
		a=x1;
		}
	return n;
	}
	
	float RAPHSON :: function_1(float x1)
	{
	float y;
	y=x1*x1*x1-x1-11;
	return y;
	}
	float RAPHSON :: function_1d(float x1)
	{
	float y;
	y=3*x1*x1-1;
	return y;
	}
	
	int main()
	{
	float x[10];
	int i,n;
	system("clear");
	RAPHSON R;
	n=R.raphson(x);
	cout<<endl<<"Solutions are-->\n";
		for(i=0;i<n;i++)
		cout<<"x["<<i<<"]="<<x[i]<<endl;
	return 0;
	}


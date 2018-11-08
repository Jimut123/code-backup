	//anprog9_newton_raphson.cpp: Write a program to solve non-linear
	//equation using Newton Raphson's method
	using namespace std;
	#include<iostream>
	class RAPHSON
	{
	public:
		int raphson(float x[10]);
		float function_1(float a);
		float function_1d(float a);
	};
	int RAPHSON :: raphson(float x[10])
	{
	float a,b,xg,h,x1,f1,f2,f3,f12,ff;
	int i,n;
	n=0;
	a=-50;
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
				if(h<0)
				ff=-h;
				else
				ff=h;
				if(ff<1e-06)
				{
				x[n++]=xg+h;
				break;
				}
			xg=xg+h;
			}while(1==1);
			}
		a=x1;
		}
	cout<<"n="<<n<<endl;
	return n;
	}
	float RAPHSON :: function_1(float a)
	{
	float f;
	f=a*a-3;
	return f;
	}
	float RAPHSON :: function_1d(float a)
        {
	float y;
	y=2*a;
	return y;
	}
	int main()
	{
	float x[10];
	int i,n;
	RAPHSON R;
	system("clear");
	n=R.raphson(x);
	cout<<endl<<"Roots are -->\n";
		for(i=0;i<n;i++)
		cout<<"Root["<<i<<"]="<<x[i]<<endl;
	}


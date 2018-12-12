#include<iostream>

using namespace std;


class RAPHSON
{
public:
	int raphson(float x[]);
	float function_1(float x1);
	float function_1d(float x1);
};


int RAPHSON :: raphson(float x[])
{
	float xg,h,f1,f2,f12,a,b;
	float x1,hh;
	a=-50;
	int n;
	
	for(x1=-49.99;x1<=50;x1+=0.01)
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
				if(hh<1e-06)
				{
					x[n++]=xg;
					break;
				}
				
			}while(true);
		}
		a=x1;
	}
	return n;
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


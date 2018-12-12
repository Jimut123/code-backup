#include<iostream>
#include<cmath>
using namespace std;
class gauss_siedel
{
	public:
		float x, y, z;
		void var1( int a1, int b1, int c1, int d1)
		{
			x=(d1-b1*y-c1*z)/a1;
		}
		void var2(int a2, int b2, int c2, int d2)
		{
			y=(d2-a2*x-c2*z)/b2;
		}
		void var3(int a3, int b3, int c3, int d3)
		{
			z=(d3-a3*x-b3*y)/c3;
		}
		void input()
		{
			
			cout<<"Enter the matrix";
			
			
		}
};

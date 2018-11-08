#include<iostream>
#include<cmath>
using namespace std;
class hcf
{
	int a, b, r;
	public:
		void input()
		{
			cout<<("Enter two numbers");
			cin>>a;
			cin>>b;
		}
		void hcff()
		{
			r=b%a;
			while(r>0)
			{
				b=a;
				a=r;
				r=b%a;
			}
		
			cout<<"hcf "<<a;
		
		}
	
};
int main ()
{
	hcf h;
	h.input();
	h.hcff();
    return 0; 	
}

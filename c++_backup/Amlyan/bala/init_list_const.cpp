#include<iostream>
using namespace std;

class alpha
{
	int x;
	public:
		alpha(int i)
		{
			x=i;
			cout<<"\n Alpha constructed ";
		}
		void show_alpha()
		{
			cout<<"x = "<<x<<"\n";
		}
};
class beta
{
	float p,q;
	public:
		beta(float a,float b):p(a),q(b+p)
		{
			cout<<"\n beta constructed ";
		}
		void show_beta(void)
		{
			cout<<" p = "<<p<<"\n";
			cout<<" q = "<<q<<"\n";
		}
};


class gamma : public alpha, public beta		// ordering of calling makes the object creation in 
	      					// that order
						// so , first alpha is created then beta is created
{
	int u,v;
	public:
		gamma(int a,int b,float c):alpha(a*2),beta(c,c),u(a)
		{
			v = b;
		       cout<<"\n gamma constructed ";	
		}
		void show_gamma(void)
		{
			cout<<" u = "<<u<<"\n";
			cout<<" v = "<<v<<"\n";
		}
};
int main()
{
	gamma g(2,4,2.5);
	cout<<"\n Display member values :: "<<endl;
	g.show_alpha();
	g.show_beta();
	g.show_gamma();
	return 0;
}







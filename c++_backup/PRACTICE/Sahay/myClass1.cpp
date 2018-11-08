#include<iostream>

using namespace std;

struct Distance
{
	private:
		int iFeet;
		float fInches;
	public:
		void setFeet(int x)
		{
			iFeet=x;
		}
		int getFeet()
		{
			return iFeet;
		}
		void setInches(float y)
		{
			fInches=y;
		}
		float getInches()
		{
			return fInches;
		}
};


int main()
{
	Distance d1,d2;   // created two objects of the class Distance
	d1.setFeet(2);
	//d1.iFeet=2;     // illegal
	d1.setInches(2.2);
	d2.setFeet(3);
	d2.setInches(3.3);
	cout<<d1.getFeet()<<" "<<d1.getInches()<<endl;
	cout<<d2.getFeet()<<" "<<d2.getInches()<<endl;
	return 0;
}






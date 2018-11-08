#include<iostream>
using namespace std;

class Centigrade;
class Farenheit;
class Centigrade
{
	public:
	int c;
	public:
		/*Centigrade(int m)
		{
			Centigrade::c=m;
		}*/
	 	Centigrade()
		{
			cout<<"\n Object of the centigrade class created!"<<endl;
			c=0;
		}
		friend istream & operator>>(istream & in, Centigrade & obj);
			
};
istream & operator>>(istream & in, Centigrade & obj)
{
	 in>>obj.c;		                        
	 return in;							                
}


class Farenheit
{
	public:
	double d;
	public:
		/*Farenheit(double d)
		{
			Farenheit::d=d;
		}*/
		Farenheit()
		{
			d=0;
			cout<<"\n Object of the farenheit class is created!"<<endl;
		}
		void conv(Centigrade &);
		friend ostream & operator<<(ostream & out,Farenheit &obj);
		/**{
			out<<obj.d;
			return out;
		}*/
		
};

ostream & operator<<(ostream & out,Farenheit &obj)
{
	out<<obj.d;
	return out;
}








void Farenheit::conv(Centigrade & obj)
{
	d = (double)((obj.c*9/5)+32);
}


int main()
{
	int cen;
	Centigrade centi;
	Farenheit faren;
	cout<<"\n Enter the centigrade value : "<<endl;
	cin>>centi;
	faren.conv(centi);
	cout<<faren;
	return 0;
}




















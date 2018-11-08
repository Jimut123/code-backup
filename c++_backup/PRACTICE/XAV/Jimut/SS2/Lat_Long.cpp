#include<iostream>
using namespace std;

class Location
{
	float latitude,longitude;
	public:
		Location();
		Location(float,float);		
		/**
		void operator++();
                void operator++(int);
                void operator--(int);
                void operator--();
		**/
		friend ostream & operator <<(ostream &,Location &);
		Location operator++();
	       	Location operator++(int);
		Location operator--(int);
		Location operator--();
		//friend Location operator+(int);
		//friend Location operator-
		
		void display();
};

ostream & operator<<(ostream & dout, Location & b)
{
	dout<<"From Ostream class :\n";
	dout<<"Location\n latitude :: "<<b.latitude<<"longitude :: "<<b.longitude<<endl;
	return dout;
}



void Location :: display()
{
	std::cout<<"latitude = "<<Location::latitude;
	std::cout<<" longitude = "<<Location::longitude<<std::endl;
	
}

Location Location::operator--()
{
	Location L;
	L.latitude=--latitude;
	L.longitude=--longitude;
	cout<<"Operator --L "<<endl;
	return L;
}

Location Location::operator--(int x=0)
{
	Location L;
	L.latitude=latitude--;	
	L.longitude=longitude--;
	cout<<"Operator L--"<<endl;
	return L;
}


Location Location::operator++()
{
	Location L;
	L.latitude=++latitude;
	L.longitude=++longitude;
	cout<<"Operator ++L "<<endl;
	return L;
}

Location Location::operator++(int x=0)
{
	Location L;
	L.latitude=latitude++;
	L.longitude=longitude++;
	cout<<"Operator L++ "<<endl;
	return L;
}
Location::Location()
{
	Location::latitude = 0.0;
	Location::longitude = 0.0;
}

Location::Location(float latitude,float longitude)
{
	Location::latitude = latitude;
	Location::longitude = longitude;
}

int main()
{
	//Location L;
	float longitude,latitude;
	cout<<"\n Enter the latitude and longitude for the program :: "<<endl;
	std::cin>>latitude;
	std::cin>>longitude;
	Location L(latitude,longitude);
	/**L++;
	L.display();
	++L;
	L.display();
	--L;
	L.display();
	L--;
	L.display();*/
	Location L1;
	L1 = --L;
	L1.display();
	L1 = L--;
	L1.display();
	L1 = L++;
	L1.display();
	L1 = ++L;
	L1.display();
	cout<<L1;
	return 0;
}













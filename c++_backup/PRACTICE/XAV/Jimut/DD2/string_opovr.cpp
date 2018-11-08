#include<iostream>
#include<cstring>
using namespace std;

class string_1
{
	char n[100];
	public:
		friend string_1 operator+(string_1 &,string_1 &); 
		string_1(char n[100])
		{
			int i;
			cout<<"par const"<<endl;
			for(i=0;n[i]!='\0';i++)
				string_1::n[i]=n[i];
		}
		string_1()
		{
			int i;
			cout<<"Def cons!"<<endl;
			for(i=0;i<100;i++)
				n[i]='\0';
		}
		
		inline ~string_1()
		{
			cout<<"Destructor!"<<endl;	
		}		
		void display();
};

string_1 operator+(string_1 & obj1,string_1 & obj2)
{
	string_1 s;
	int i,c=0;
	for(i=0;obj1.n[i]!='\0';i++)	
	{
		s.n[i]=obj1.n[i];
		c++;
	}
	for(i=0;obj2.n[i]!='\0';i++)
        {
                s.n[c]=obj2.n[i];
                c++;
        }

	return s;
}

void string_1 ::display()
{	
	int i;
	for(i=0;n[i]!='\0';i++)
                cout<<string_1::n[i];
	cout<<endl;
}
int main()
{
	//string_1 str;
	char c1[6] = {'J','i','m','u','t','\0'};
	char c2[4] = {'P','a','l','\0'};
	string_1 str1(c1),str2(c2),str3;
	
	str3 = str1+str2;
	str3.display();
	return 0;
}





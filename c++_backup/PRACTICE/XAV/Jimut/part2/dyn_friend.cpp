#include<iostream>
using namespace std;
int tot;
class ACM;

class NONACM
{
	int a[100];
	public:
		void input(int n);
		friend void add(NONACM obj1,ACM obj2);
};

void NONACM::input(int n)
{
	int i;
	cout<<"\n Enter "<<n<<"elements :"<<endl;
	for(i=0;i<n;i++)
	{
		cin>>a[i];
	}
	
}

class ACM
{
	int b[100];
	public:
		void input(int n);
		friend void add(NONACM obj1,ACM obj2);
};

void add(NONACM obj1,ACM obj2)
{
	//NONACM A;
	//ACM B;
	int i;
	int a2[100];
	for(i=0;i<tot;i++)
	{
		a2[i]=obj1.a[i]+obj2.b[i];
		cout<<a2[i]<<"\t";
	}		
}

void ACM::input(int n)
{
	int i;
        cout<<"\n Enter "<<n<<"elements :"<<endl;
        for(i=0;i<n;i++)
        {
                cin>>b[i];
        }

}

int main()
{
	int n;
	cout<<"\n Enter the no. of elements of the vector:"<<endl;
	cin>>n;
	tot=n;
	NONACM na_obj;
	ACM a_obj;
	na_obj.input(n);
	a_obj.input(n);
	add(na_obj,a_obj);
	return 0;
}

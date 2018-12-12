#include<iostream>
using namespace std;

// prototype declarations

void swapv(int,int);
void swapr(int&,int&);
void swapa(int*,int*);

void swapv(int i,int j)
{
        int t;
        t=i;
        i=j;
        j=t;
        cout<<"------------"<<i<<j<<endl;
}

void swapa(int *i,int *j)
{
        int t;
        t=*i;
        *i=*j;
        *j=t;
        //cout<<i<<j;
}


void swapr(int &i,int &j)
{
        int t;
        t=i;
        i=j;
        j=t;
        //cout<<i<<j;
}

int main()
{
	int a = 10,b = 20;
	swapv(a,b);
	cout<<endl<<a<<"\t"<<b<<endl;
	a = 10;
	b = 20;
	swapr(a,b);
        cout<<endl<<a<<"\t"<<b<<endl;
	a = 10;
        b = 20;
        swapa(&a,&b);
        cout<<endl<<a<<"\t"<<b<<endl;
	return 0;
}

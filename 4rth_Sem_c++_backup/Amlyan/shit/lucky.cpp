#include<iostream>
using namespace std;

const int size = 50;	// size of the lucky number

class Lucky
{
	int a[size+1];
	public:
		Lucky();
		void display();
		void calculate();
		void truncate();
		void Lucky_collector(int);
			
};

void Lucky::Lucky_collector(int n)
{
	int i,j;
	cout<<endl;
	for(i=0;i<size;i++)
	{
		if(a[i]>n)
			break;
		cout<<a[i]<<"\t";
	}
	cout<<endl;
}


void Lucky::truncate()
{
	int j1;
	int count=0;
	for(j1=0;j1<size+1;j1++)
	{
		if(a[j1]>0)
		{
			a[count++]=a[j1];
		}
			
	}	
	cout<<"\n Truncated value :: "<<endl;	
	display();

}

void Lucky::display()
{
	int i1;
	cout<<endl;
	for(i1=0;i1<size+1;i1++)
		cout<<a[i1]<<"\t";
	cout<<endl;
}
Lucky::Lucky()
{
	int i;
	cout<<endl<<"\n The matrix generated for the lucky number :: "<<endl;
	for(i=0;i<size;i++)
	{
		a[i]=i+1;
		cout<<a[i]<<" ";
	}
	a[i]=100;	// terminating condition, the last element should contain 100
	cout<<a[i]<<" "<<endl;
}

void Lucky::calculate()
{
	int i,j,c=1;
	for(j=1;j<5;j++)
	{
		cout<<endl<<"j = "<<j<<endl;	
		for(i=c;i<size+1;i=i+j+1)	
		{
			a[i] = 0;			
		}
		display();
		truncate();
		c++;
	}
	
}




int main()
{
	Lucky L;
	int n;
	L.calculate();
	cout<<"\n Enter upto which you want to find the lucky numbers : "<<endl;
	cin>>n;
	L.Lucky_collector(n);
	return 0;
}




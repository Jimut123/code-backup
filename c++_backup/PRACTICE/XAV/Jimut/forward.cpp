#include<iostream>
#include<string>
using namespace std;
int arr[100][100];
class FORWARD
{
	public:
		void forward_diff(int n);
		void print_t(int n);	

};

void FORWARD :: print_t(int n)
{
	int i,j;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)	
		{
			cout<<arr[i][j]<<"\t";
		}
		cout<<"\n";
	}
}
void FORWARD :: forward_diff(int n)
{
	int i,j,m=n;
	for(int k =0;k<n;k++)
	{
	for(i=0;i<n;i++)
	{
		for(j=2;j<m;j++)
		{
			//if(j-1>=0&&i+1<n)
			arr[i][j]=arr[i+1][j-1]-arr[i][j-1];			
		}
	m--;
	}	
	
	}
}

int main()
{
	FORWARD f;
	int i=0,x,y,choice;
	
	cout<<"Enter the values x y accordingly ::(press quit to exit)"<<endl;
	while(true)
	{	
		cout<<"a["<<i<<"][0]=";
		cin>>x;
		cout<<"a["<<i<<"][1]=";
		cin>>y;
		arr[i][0]=x;
		arr[i][1]=y;
		cout<<"Enter 0 to exit :"<<endl;
		cin>>choice;
		if(choice==0)
			break;
		i++;
	}
	f.forward_diff(i+1);
	f.print_t(i+1);
	return 0;
}




#include<iostream>
using namespace std;

class inverse
{
	public:
		int i,j;
		int a[20][20];
		void input(int n);
		
};


void inverse::input(int n)
{
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			cin>>a[i][j];
		}
	}
}

void inverse::print(int n)
{
	for(i=0;i<n;i++)
        {
                for(j=0;j<n;j++)
                {
                       	cout<<a[i][j]<<"  ";
                }
		cout<<"\n";
        }

}


int main()
{
	return 0;
}






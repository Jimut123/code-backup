#include<iostream>
using namespace std;
class sum
{
	public:
		int sumno(int n)
		{
			int i,s=0;
			for (i=0;i<=n;i++)
	                	s=s+i;
			return s;

		}
};




int main()
{
	int i,n,s=0;
	system("clear");
	sum sum1;
	cout<<"\n Enter n(1-10) : "<<endl;
	cin >> n;
	//for (i=0;i<=n;i++)
	//	s=s+i;
	s = sum1.sumno(n);
	cout<<"Sum = "<<s;
	return 0;
}




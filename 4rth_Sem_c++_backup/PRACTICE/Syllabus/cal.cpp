#include<iostream>
using namespace std;
int main()
{
	float i=9,j=3,k=67,p=98;
	while(true)
	{
		if(i>j)
		{
			i++;
			cout<<"i = "<<i<<" j = "<<j<<" k = "<<k<<" p = "<<p<<endl;
			j++;
			cout<<"i = "<<i<<" j = "<<j<<" k = "<<k<<" p = "<<p<<endl;
			k = k/(i-j);
			cout<<"i = "<<i<<" j = "<<j<<" k = "<<k<<" p = "<<p<<endl;
				
		}	
		p=p+7;
		if (p>k)
		{
			k=k-j;
			cout<<"i = "<<i<<" j = "<<j<<" k = "<<k<<" p = "<<p<<endl;
			i=i+6;
			cout<<"i = "<<i<<" j = "<<j<<" k = "<<k<<" p = "<<p<<endl;
		}
	}
}




#include<iostream>
#include<cmath>
using namespace std;
class fint
{
        float arr[100][100];
        public:
        void forward();
        void display(int);
	float factorial(int a);
	float interpolation(int n);
};
float fint::factorial(int a)
{
	float p=1;
	for(int i=1;i<=a;i++)
	p*=i;
	return p;
}
void fint::forward()
{
        cout<<"Enter the value of intervals \n";
        int n=0;
        cin>>n;
        cout<<"\nEnter the data in the format x <enter> y\n";
        for(int i=0;i<n;i++)
        {
                cin>>arr[i][0];
                cin>>arr[i][1];
        }
        int m=n-1;
        for(int j=2;j<n+1;j++)
        {
                for(int i=0;i<m;i++)
                arr[i][j]=arr[i+1][j-1]-arr[i][j-1];
                m--;
        }
        display(n);
	cout<<interpolation(n);
}
float fint::interpolation(int n)
{
	float h=arr[1][0]-arr[0][0];
	float x=0;
	cout<<"\Enter your value of x \n";
	cin>>x;
	float p=(x-arr[0][0])/h;
	float y=arr[0][1];
	float u=1;
	int fac=1;
	for(int i=2;i<n+1;i++)
	{
		u=u*(p-i+2);
		float f1=arr[0][i]*u;
		float f2=factorial(fac);
		fac++;
		y+=f1/f2;
	}
	return y;
}
		
void fint::display(int n)
{
        cout<<"\nThe difference table is\n";
        cout<<"x\tf(x)\t";
        for(int i=2;i<n+1;i++)
        cout<<"f"<<i<<"(x)\t";
        cout<<"\n";
        int m=n;
        for(int i=0;i<n;i++)
        {
                for(int j=0;j<=n&&j<=m;j++)
                {
                        cout<<arr[i][j]<<"\t";
                }
                m--;
                cout<<endl;
        }
}
int main()
{
        fint ob;
        ob.forward();
        return 0;
}


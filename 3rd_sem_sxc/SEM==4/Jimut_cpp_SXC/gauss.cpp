#include<iostream>
using namespace std;
class Gauss
{

        public : void gauss_elm(float a[10][10], float b[10], float x[10], int n);

};

void Gauss::gauss_elm(float a[10][10], float b[10], float x[10], int n)
{
        int i,j,k;
        float am;
        for(i=0;i<n;i++)
        {
                for(j=0;j<n;j++)
                        if(i!=j)
                        {
                                am=a[j][i]/a[i][i];
				for(k=0;k<n;k++)
				a[j][k]=a[j][k]-a[i][k]*am
			b[j]=b[j]-b[j]*am;
                        }
		x[n-1]=b[n-1]/a[n-1][n-1];
			for(i=n-2;i>=0;i--)
			{
			s=0;
				for(j=i+1;j<n;j++)	
				s=s+a[i][j]*x[j];
			x[i]=(b[i]-s)/a[i][i];
			}
        }
}


int main()
{
	float a[10][10],b[10],x[10];
	int i,j,n;
	system("clear");
	cout<<endl<<"Enter no. of equations :"<<endl;
	cin>>n;
	cout<<endl<<"enter all the coefficients :"<<endl;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			cout<<"a["<<i<<"]["<<j<<"]=";
			cin>>a[i][j];
		}
	cout<<"b["<<i<<"]=";
	cin>>b[i];
	}
	Gauss gaus;
	return 0;	


}





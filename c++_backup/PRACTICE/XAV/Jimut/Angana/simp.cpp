#include<iostream>
#include<cmath>
using namespace std;
class simp
{
        public:
        float func(float);
        float simpson(float a, float b, int n);
};
float simp::func(float a)
{
        float r=(1+a*a);
        float f=1/r;
        r=4*f;
        return r;
}
float simp::simpson(float a, float b, int n)
{
        float h=(float)(b-a)/n;
        float fx[n+1][2];
        for(int i=0;i<n+1;i++)
        {
                fx[i][0]=a+i*h;
                fx[i][1]=func(fx[i][0]);
        }
        cout<<"\nThe initial value matrix is ....\n";
        for(int i=0;i<n+1;i++)
        cout<<fx[i][0]<<"\t"<<fx[i][1]<<endl;
        float sum_even=0;
	float sum_odd=0;
        for(int i=1;i<n;i+=2)
        sum_odd+=fx[i][1];
	for(int i=2;i<n;i+=2)
	sum_even+=fx[i][1];
        float s=(fx[0][1]+fx[n][1]+2*sum_even + 4*sum_odd);
        s=s*h;
        float I=s/3;
        return I;
}
int main()
{
	int n;
        float a,b;
        cout<<"\nEnter the lower limit, uper limit and even number of intervals";
        cin>>a;
        cin>>b;
        cin>>n;
	if(n%2==0){
        simp ob;
        float y=ob.simpson(a,b,n);
        cout<<"\nThe answer is :"<<y<<endl;}
	else cout<<"\nThe number if intervals is not even.\n";
        return 0;
}


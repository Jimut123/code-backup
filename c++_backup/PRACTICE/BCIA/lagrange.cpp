#include<iostream>
using namespace std;

class Lagrange
{
  float X1[100][100],X2[100],X[100],Y[100],N;
  float x;
  public:
    void input();
    void calculate();
};

void Lagrange :: input()
{
  int i;
  cout<<"\n Enter the X and Y matrices :: "<<endl;
  cout<<"\n Enter the total no. of points :"<<endl;
  cin>>Lagrange::N;
  for(i=0;i<Lagrange::N;i++)
  {
    cout<<"X  = ";
    cin>>Lagrange::X[i];
    cout<<"Y = ";
    cin>>Lagrange::Y[i];
  }
  cout<<"\n Enter the value of x for which u want to find the interpolation of : "<<endl;
  cin>>Lagrange::x;
}

void Lagrange :: calculate()
{
  // calculating the matrix
  int i,j,k;
  cout<<"\n The difference marix :: "<<endl;
  for(i=0;i<Lagrange::N;i++)
  {
    for(j=0;j<Lagrange::N;j++)
    {
      Lagrange::X1[i][j]=Lagrange::X[i]-Lagrange::X[j];
      cout<<Lagrange::X1[i][j]<<"  ";
    }
    cout<<endl;
  }
  // calculating the X2 matrix
  cout<<"The x - x[i] vector :: "<<endl;
  for(i=0;i<Lagrange::N;i++)
  {
    Lagrange::X2[i] = Lagrange::x - Lagrange::X[i];
    cout<<Lagrange::X2[i]<<"\t";
  }
  float num,den;
  float sum=0.0f,numbyden,yi_numbyden;
  for(i=0;i<Lagrange::N;i++)
  {
    num=1.0f;
    den=1.0f;
    for(j=0;j<Lagrange::N;j++)
    {
      if(i!=j)
      {
        num=num*Lagrange::X2[i];
        den=den*Lagrange::X1[i][j];
      }

    }
    numbyden = float(num/den);
    yi_numbyden = (float)numbyden*Y[i];
    sum = sum + yi_numbyden;
    cout<<"sum = "<<sum<<"num = "<<num<<" den = "<<den<<" y = "<<Y[i]<<endl;
  }
  cout<<"\n The value at x = "<<x<<" is = "<<sum<<endl;
}

int main()
{
  Lagrange L;
  L.input();
  L.calculate();
}

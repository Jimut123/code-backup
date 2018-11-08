#include <iostream>
using namespace std;

/*

3
5 1 1 7
1 5 1 7
1 1 5 7

*/

class Jacobi
{
  int A[100][100],B[100],n;
  float X[100];
  public:
    void input();
    void calculate();
};

void Jacobi :: input()
{
  cout<<"\n Enter the no. of equations : "<<endl;
  cin>>n;
  int i,j;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cout<<"A["<<i<<"]"<<"["<<j<<"] = ";
      cin>>A[i][j];
    }
    cout<<"\n Enter the value of B["<<i<<"] = ";
    cin>>B[i];
    X[i] = 0;   // initializing each and every variable with 0
  }
}

void Jacobi :: calculate()
{
  int i,j,k,sum;

    sum=0;
    for(j=0;j<n;j++)
    {
      for(k=0;k<n;k++)
      {
        if(j!=k)
        {
          cout<<"A[j][k]"<<A[j][k]<<"\t";
          sum = sum + A[j][k];
        }
      }
      sum = B[j] - sum;
      cout<<"sum = "<<sum<<"\n";
      X[j] = (1/A[j][j])*sum;
    }

  cout<<"The X values are :: "<<endl;
  for(i=0;i<n;i++)
    cout<<X[i]<<" ";
}

int main()
{
  Jacobi J;
  J.input();
  J.calculate();
  return 0;
}

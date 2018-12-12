#include <iostream>
#include <cmath>
#include <vector>
#include <algorithm>
#define MAX 10
using namespace std;
/*
3
1 2 3
4 5 6
7 8 9

50 50 40
30 40 70

---------------
1	2	3	  50
4	5	6	  50
7	8	9	  40
30	40	70
---------------

*/

class NorthWest
{
  int matrix[MAX][MAX],n,m,cost[MAX],dest[MAX],alloc[MAX][MAX];
public:
  NorthWest(int);
  ~NorthWest();
  void input();
  void slv();
  void calculate();
};

void NorthWest :: calculate()
{
  int i,j;
  int sum=0;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(alloc[i][j]>0)
        sum=sum+alloc[i][j]*matrix[i][j];
    }
  }
  cout<<"Sum  = "<<sum<<endl;
}
NorthWest :: NorthWest(int n)
{
  NorthWest::n=n;
  int i,j;
  for(i=0;i<n;i++)
  for(j=0;j<n;j++)
  alloc[i][j]=0;

}

NorthWest :: ~NorthWest()
{
  cout<<"\n Destroyed!! "<<endl;
}

void NorthWest :: input()
{
  int i,j;
  //cout<<"Enter the matrix :";
  //cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cout<<i<<" "<<j<<endl;
      cin>>matrix[i][j];
    }
  }

  cout<<"Enter the cost and destination vector :: "<<endl;
  cout<<"cost ?: "<<endl;
  int total_cost=0,total_dest=0;
  for(i=0;i<n;i++)
  {
    cin>>cost[i];
    total_cost+=cost[i];
  }
  cout<<"dest ?: "<<endl;
  for(i=0;i<n;i++)
  {
    cin>>dest[i];
    total_dest+=dest[i];
  }
  if(total_cost!=total_dest)
  {
    cout<<"Fuck off !! \n not balanced!"<<endl;
    exit(3);
  }
  else
    cout<<"balanced!"<<endl;

  cout<<"The matrix inputted! : "<<endl;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cout<<matrix[i][j]<<"\t";
    }
    cout<<cost[i]<<"\t";
    cout<<endl;
  }
  for(i=0;i<n;i++)
    cout<<dest[i]<<"\t";
}

void NorthWest :: slv()
{
  int i,j,i1=0,j1=0;
  int a[MAX][MAX];
  for(i=0+i1;i<n;i++)
  {
    for(j=0+j1;j<n;j++)
    {
      if(cost[i]>dest[i])
      {
        alloc[i][j] = dest[i];
        cost[i] = cost[i] - dest[i];
        if(cost[i]==0)
        {
          i1=i;
          j1=j;
          break;
        }
      }
      else
      {
        alloc[i][j] = cost[i];
        dest[i] = dest[i] - dest[i];
        if(dest[i]==0)
        {
          i1=i;
          j1=j;
          break;
        }
      }
    }
  }
  cout<<endl<<"\n";
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cout<<alloc[i][j]<<" ";
    }
    cout<<endl;
  }
}

int main()
{
  int n,m;
  cout<<"n?:";
  cin>>n;
  /*
  cout<<"m?:";
  cin>>m;
  */
  NorthWest N(n);
  N.input();
  N.slv();
  N.calculate();
  return 0;
}

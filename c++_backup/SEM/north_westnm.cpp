#include <iostream>
#include <cmath>
#include <vector>
#include <algorithm>
#define MAX 10
using namespace std;
/*
2 4
5 1 2 0
3 0 1 2
50 10
10 10 10 30


2
3
5 0 7
3 2 1
10 20
10 5 15

*/

class NorthWest
{
  int matrix[MAX][MAX],n,m,cost[MAX],dest[MAX],alloc[MAX][MAX];
public:
  NorthWest(int,int);
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
    for(j=0;j<m;j++)
    {
      if(alloc[i][j]>0)
        sum=sum+alloc[i][j]*matrix[i][j];
    }
  }
  cout<<"Sum  = "<<sum<<endl;
}

NorthWest :: NorthWest(int n,int m)
{
  NorthWest::n=n;
  NorthWest::m=m;
  int i,j;
  for(i=0;i<n;i++)
  for(j=0;j<m;j++)
  alloc[i][j]=0;

}

NorthWest :: ~NorthWest()
{
  cout<<"\n Destroyed!! "<<endl;
}

void NorthWest :: input()
{
  int i,j;
  //cout<<"Enter the matrix :\n";
  //cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
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
  for(i=0;i<m;i++)
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
    cout<<"balanced!\n Processing your request sir!!!"<<endl;

  cout<<"The matrix inputted! : "<<endl;
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cout<<matrix[i][j]<<"\t";
    }
    cout<<cost[i]<<"\t";
    cout<<endl;
  }
  for(i=0;i<m;i++)
    cout<<dest[i]<<"\t";
}

void NorthWest :: slv()
{
  int i,j,i1=0,j1=0;
  int a[MAX][MAX];
  for(i=0+i1;i<n;i++)
  {
    for(j=0+j1;j<m;j++)
    {
      if(cost[i]>dest[j])
      {
        alloc[i][j] = dest[j];
        cost[i] = cost[i] - dest[j];
	dest[j] = 0;
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
        dest[j] = dest[j] - cost[i];
	cost[i] = 0;
        if(dest[j]==0)
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
    for(j=0;j<m;j++)
    {
      cout<<alloc[i][j]<<"\t";
    }
    cout<<endl;
  }
}

int main()
{
  int n,m;
  cout<<"n?:";
  cin>>n;
  cout<<"m?:";
  cin>>m;
  NorthWest N(n,m);
  N.input();
  N.slv();
  N.calculate();
  return 0;
}

/*
*                           THIS PROG SOLVES THE MATRIX MINIMA METHOD
*                                 @Author :: Jimut Bahan Pal
*
*/


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

class MatrixMinima
{
  int matrix[MAX][MAX],n,m,cost[MAX],dest[MAX],alloc[MAX][MAX],min_i,min_j,min,total;
public:
  MatrixMinima(int,int);
  ~MatrixMinima();
  void input();
  void slv();
  void find_min();
  void calculate();
};

void MatrixMinima :: find_min()
{
  int i,j;
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      if(matrix[i][j] != -200)                  // -200 is assigned the dead value
      {
        min = matrix[i][j];
        break;
      }
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      if(matrix[i][j] != -200 && min > matrix[i][j])
      {
        min = matrix[i][j];
        min_i = i;
        min_j = j;
      }
    }
  }
}

void MatrixMinima :: calculate()
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

MatrixMinima :: MatrixMinima(int n,int m)
{
  MatrixMinima::n=n;
  MatrixMinima::m=m;
  int i,j;
  for(i=0;i<n;i++)
  for(j=0;j<m;j++)
  alloc[i][j]=0;

}

MatrixMinima :: ~MatrixMinima()
{
  cout<<"\n Destroyed!! "<<endl;
}

void MatrixMinima :: input()
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
    {
      cout<<"balanced!\n Processing your request sir!!!"<<endl;
    }
  
  MatrixMinima::total = total_dest;

  cout<<"The matrix inputted! : "<<endl;
  cout<<"m = "<<m<<"n = "<<n;

  /****************************************************************/

    // Area of problem

  /***************************************************************/
  for(int k=0;k<n;k++)
  {
    for(int l=0;l<m;l++)
    {
      cout<<matrix[k][l]<<"\t";
    }
    cout<<cost[k];
    cout<<endl;
    //cout<<"\n i = "<<i<<"j = "<<j<<"\n";
  }
  cout<<"m = "<<m;
  for(int k=0;k<m;k++)
  {
    cout<<dest[k]<<"\t";
  }
  /*****************************************************************/
}

void MatrixMinima :: slv()
{
  int i,j,i1=0,j1=0;
  find_min();

  // store it in alloc[][] matrix
  // cost[] = n dest[] = m

  while(total != 0)
  {
    if(cost[min_i]>=dest[min_j])
    {
      cost[min_i] -= dest[min_j];
      total -= dest[min_j];
      alloc[min_i][min_j] = dest[min_j];
      dest[min_j] = 0;
      matrix[min_i][min_j] = -200;
    }
    else
    {
      dest[min_j] -= cost[min_i];
      total -= cost[min_i];
      alloc[min_i][min_j] = cost[min_i];
      cost[min_i] = 0;
      matrix[min_i][min_j] = -200;
    }
    find_min();
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
  MatrixMinima N(n,m);
  N.input();
  N.slv();
  N.calculate();
  return 0;
}

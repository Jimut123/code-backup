#include"iostream.h"
#include"conio.h"
#include"stdlib.h"
int* sum(int*,int);
int main()
{
     int* (*p)(int*,int);
     int *a,i,n;
     cin>>n;
	 a=(int*)malloc(n*sizeof(int));
     for(i=0;i<n;i++)
      cin>>*(a+i);
     p=&sum;
     a=p(a,n);
     for(i=0;i<n;i++)
     cout<<*(a+i)<<endl;
     getch();
     return 0;
     }
int* sum(int* x,int y)
{
     int z;
    for(z=0;z<y;z++)
     *(x+z)=*(x+z)+10;
     return x;
     }

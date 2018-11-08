#include<stdio.h>
//using namespace std;
int addmult(int,int);
int addmult(int ii,int jj)
{
	int kk,ll;
	kk = ii+jj;	
	kk = ii*jj;
	return (kk,ll);
}

int main()
{
	int i=3,j=4,k,l;
	k = addmult(i,j);
	l = addmult(i,j);
	printf("\n%d%d",k,l);
	return 0;
}





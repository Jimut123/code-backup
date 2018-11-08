/*
 * This program is designed by Jimut Bahan pal
 */

//
#include<iostream>
using namespace std;


void print_();


//const int size = 10;              // size of the board

//char a[10][10];
//a[5][5] = 'J';


void print_(char a[10][10],int size)
{
	int i,j;
	for(i=0;i<size;i++)
	{
		for(j=0;j<size;j++)
		{
			cout << a[i][j]<<' ';
		}
		cout<<endl;
	}
}



int main()
{
	char a[10][10];
	a[5][5] = 'J';
	int size = 10;              // size of the board

	
	int i,j;
	print_(a, size);
	
	return 0;

}


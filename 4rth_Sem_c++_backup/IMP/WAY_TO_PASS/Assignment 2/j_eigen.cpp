/*
q1as2.cpp: Write a program to solve eigne value equation using Jacobi Method
*/
#include <iostream>
#include <math.h>
using namespace std;
class Jacobi
{
 public:
	void jacobi(float a[10][10], float eval[10], float evec[10][10], int n);
	void mat_prod(float a[10][10], float b[10][10], float p[10][10], int n);
	void mat_transpose(float a[10][10], float t[10][10], int n);
	void maximum(float a[10][10], int *i1, int *j1, int n);
};
void Jacobi :: mat_prod(float a[10][10], float b[10][10], float p[10][10], int n)
{
	int i, j, k;
	float s;
	for(i = 0; i < n; i++)
	{
		for(j = 0; j < n; j++)
		{
			s = 0; 
			for(k = 0; k < n; k++)
				s = s + a[i][k] * b[k][j];
			p[i][j] = s;	
		}
	}
}
void Jacobi :: mat_transpose(float a[10][10], float t[10][10], int n)
{	
	int i, j;
	for(i = 0; i < n; i++)
	{
		for(j = 0; j <= i; j++)
		{
			t[i][j] = a[j][i];
			t[j][i] = a[i][j];
		}
	}
}
void Jacobi :: maximum(float a[10][10], int *i1, int *j1, int n)
{
	float mx, mx1;
	int ii, jj, i, j;
	mx = a[0][1];
	*i1 = 0;
	*j1 = 1;
	if(mx < 0)
		mx = -mx;
	//To find the index of maximum value
	for(i = 0; i < n; i++)
	{
		for(j = i + 1; j < n; j++)
		{
			mx1 = a[i][j];
			if(mx1 < 0)
				mx1 = -mx1;
			if(mx1 > mx)
			{
				mx = mx1;
				*i1 = i;
				*j1 = j;
			}
		}
	}
}
void Jacobi :: jacobi(float a[10][10], float eval[10], float evec[10][10], int n)
{
	float s1[10][10], s1t[10][10], sn[10][10], sn1[10][10];
	float a1[10][10], a2[10][10];
	float aii, ajj, aij;
	float sint, cost, tant, num1, den1, mx;
	int i1, j1;
	int i, j;
	int flag;
	//To form identity
	for(i = 0; i < n; i++)
		for(j = 0; j < n; j++)
			if(i == j)
				sn[i][j] = 1;
			else
				sn[i][j] = 0;
	flag = 0;
	while(flag == 0)
	{
		//To create s1 matrix
		for(i = 0; i < n; i++)
			for(j = 0; j < n; j++)
				if(i == j)
					s1[i][j] = 1;
				else
					s1[i][j] = 0;
		//To find the index of maximum value in off diagonal terms of matrix a[][]
		i1 = 0;
		j1 = 1;
		maximum(a, &i1, &j1, n);
		aii = a[i1][i1];
		ajj = a[j1][j1];
		aij = a[i1][j1];
		//To calculate tant, sint, cost
		if(aii >= ajj)
		{
			num1 = 2 * aij;
			den1 = (aii - ajj) + sqrt((aii - ajj) * (aii - ajj) + 4 * aij * aij);
			tant = num1 / den1;
		}
		else
		{
			num1 = -2 * aij;
			den1 = (ajj - aii) + sqrt((aii - ajj) * (aii - ajj) + 4 * aij * aij);
			tant = num1 / num1;
		}
		cost = 1.0 / sqrt(1 + tant * tant);
		sint = cost * tant;
		s1[i1][i1] = cost;
		s1[j1][j1] = cost;
		s1[i1][j1] = -sint;
		s1[j1][i1] = sint;
		mat_transpose(s1, s1t, n);	//To calculate transpose of s1
		mat_prod(s1t, a, a1, n); 	//To take product of a[][] & s1[][]
		mat_prod(a1, s1, a2, n);
		mat_prod(sn, s1, sn1, n);
		for(i = 0; i < n; i++)
			for(j = 0; j < n; j++)
				sn[i][j] = sn1[i][j];
		for(i = 0; i < n; i++)
			for(j = 0; j < n; j++)
				a[i][j] = a2[i][j];
		i1 = 0;
		j1 = 1;	
		maximum(a, &i1, &j1, n);
		mx = a[i1][j1];
		if(mx < 0)
			mx = -mx;
		if(mx < 0.001)
		{
			flag = 0;	
			break;
		}
	}
	//To extract eigen values
	for(i = 0; i < n; i++)
		eval[i] = a[i][i];
	for(i = 0; i < n; i++)
		cout << "Eigen_Value[" << (i+1) << "] = " << eval[i] << endl;
	cout << endl << "Eigen Vectors are --->\n";
	for(i = 0; i < n; i++)
	{
		for(j = 0; j < n; j++)
		{
			evec[i][j] = sn[i][j];
			cout << evec[i][j] << "\t";
		}
		cout << endl;
	}
}
int main()
{
	float a[10][10], eval[10], evec[10][10];
	int i, j, n;
	system("clear");
	cout << "\nEnter size of your matrix(1-10): ";
	cin >> n;
	cout << "\nEnter elements of a[][] matrix one by one --->\n";
	for(i = 0; i < n; i++)
		for(j = 0; j < n; j++)
		{
			cout << "a[" << i << "][" << j << "] = ";
			cin >> a[i][j];
		}
	Jacobi J;
	J.jacobi(a, eval, evec, n);
	return 0;
}


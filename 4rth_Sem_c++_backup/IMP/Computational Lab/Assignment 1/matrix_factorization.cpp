/*
Write a program to implement matrix factorization method to solve linear simultaneous equations
*/
#include <iostream>
using namespace std;
class MatrixFactorization
{
   public:
	void matrix_fact(float a[10][10], float b[10], float x[10], int n);
	void display1(float x[10], int n);
};

void MatrixFactorization :: matrix_fact(float a[10][10], float b[10], float x[10], int n)
{
	float ut[10][10], lt[10][10], y[10];
	float s;
	int i, j, k;
	//To initialize ut[][] and lt[][] to 0
	for(i = 0; i < n; i++)
		for(j = 0; j < n; j++)
		{
			ut[i][j] = 0;
			lt[i][j] = 0;
		}
	//To construct lt[][] and ut[][] matrices
	for(i = 0; i < n; i++)
	{
		lt[i][i] = 1;
		for(j = 0; j < n; j++)
			if(i > j)
			{
				s = 0;
				for(k = 0; k < j; k++)
					s = s + lt[i][k] * ut[k][j];
				lt[i][j] = (a[i][j] - s) / ut[j][j];
			}
			else if(i <= j)
			{
				s = 0;
				for(k = 0; k < i; k++)
					s = s + lt[i][k] * ut[k][j];
				ut[i][j] = a[i][j] - s;
			}
	}
	system("clear");
	cout << endl << "Elements in lt[][] --->\n";
	for(i = 0; i < n; i++)
	{
		for(j = 0; j < n; j++)
			cout << lt[i][j] << "\t";
		cout << endl;
	}
	cout <<  endl <<  "Elements in ut[][] --->\n";
	for(i = 0; i < n; i++)
	{
		for(j = 0; j < n; j++)
			cout << ut[i][j] << "\t";
		cout << endl;
	}
	//To calculate y[] using forward substitution method
	y[0] = b[0];
	for(i = 1; i < n; i++)
	{
		s = 0;
		for(j = 0; j < i; j++)
			s = s + lt[i][j] * y[j];
		y[i] = b[i] - s;
	}
	//To Calculate x[] using back substitution  method
	x[n - 1] = y[n - 1]/ ut[n-1][n-1];
	for(i = n - 2; i >= 0; i--)
	{
		s = 0;
		for(j = i + 1; j < n; j++)
			s = s + ut[i][j] * x[j];
		x[i] = (y[i] - s) / ut[i][i];
	}
	//To display all roots
	cout << endl << "Roots are --->\n";
	for(i = 0; i < n; i++)
		cout << "Root[" << i+1 << "] = " << x[i] << endl;
}

int main()
{
	float a[10][10], b[10], x[10];
	int i, j, n;
	system("clear");
	cout << endl << "Enter Number of Equations(1-10): ";
	cin >> n;
	cout <<  endl << "Enter all co-efficients ---> \n";
	for(i = 0; i < n; i++)
	{
		for(j = 0; j < n; j++)
		{
			cout << "a[" << i << "][" << j << "] = ";
			cin >> a[i][j];
		}
		cout << "b[" << i << "] = ";
		cin >> b[i];
	}
	MatrixFactorization MF;
	MF.matrix_fact(a, b, x, n);
	return 0;
}

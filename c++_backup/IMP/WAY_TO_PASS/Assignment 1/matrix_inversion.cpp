/*
Solve linear simultaneous equations using Matrix Inversion Method
*/

#include <iostream>
using namespace std;
class Matrix_Inversion
{
   public:
	void mat_inv(float a[10][10], float b[10], float x[10], int n);
	void display(float x[10], int n);
	void display1(float x1[10][20], int n);
};

void Matrix_Inversion :: mat_inv(float a[10][10], float b[10], float x[10], int n)
{
   float aug[10][20];
   float s, am;
   int i, j, k, n1;
   float inverse[10][20];
//To construct initial augmented matrix aug[][]
   for(i = 0; i < n; i++)
	for(j = 0; j < n; j++)
	{
		aug[i][j] = a[i][j];
		if(i == j)
			aug[i][j+n] = 1;
		else
			aug[i][j+n] = 0;
	}
   display1(aug, n); //To display augmented matrix aug[][]
//To construct modified augmented matrix
  n1 = 2 * n; 
  for(i = 0; i < n; i++)
   {
	am = aug[i][i];
	for(j = 0; j < n1; j++)
		aug[i][j] = aug[i][j] / am;
	for(j = 0; j < n; j++)
		if(i != j)
		{
			am = aug[j][i];
			for(k = 0; k < n1; k++)
				aug[j][k] = aug[j][k] - aug[i][k] * am;
		}
	display1(aug, n); 	//To display elements of augmented matrix
   }
//To Extract elements of Inverse matrix
   for(i = 0; i < n; i++)
	for(j = 0; j < n; j++)
		inverse[i][j] = aug[i][j + n];
   cout << endl << "Elements of Inverse Matrix--->\n";
   for(i = 0; i < n; i++)
   {
	for(j = 0; j < n; j++)
		cout << inverse[i][j] << "   ";
        cout << endl;
   }
//To calculate the roots
	for(i = 0; i < n; i++)
	{
		s = 0;
		for(j = 0; j < n; j++)
			s = s + inverse[i][j] * b[j];
		x[i] = s;
	}
}

void Matrix_Inversion :: display(float x[], int n)
{
	int i;
	for(i = 0; i < n; i++)
		cout << "Root[" << i << "] = " << x[i] << endl;
}

void Matrix_Inversion :: display1(float x1[10][20], int n)
{
	int i, j, n1;
	char ch;
	cout << endl << "Elements in Augmented Matrix\n";
	n1 = 2 * n;
	for(i = 0; i < n; i++)
	{
		for(j = 0; j < n1; j++)
			cout << x1[i][j] << "   ";
		cout << endl;
	}
	cout << endl << "type any character and press enter key --->";
	cin >> ch;
}
	
int main()
{
	float a[10][10], b[10], x[10];
	int i, j, n;
	system("clear");
	cout << endl << "Enter Number of Equations(1-10): ";
	cin >> n;
	cout << endl << "Enter Co-eficients of your Equations--->\n";
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
	Matrix_Inversion MI;
	MI.mat_inv(a, b, x, n);
	MI.display(x, n);
	return 0;
}

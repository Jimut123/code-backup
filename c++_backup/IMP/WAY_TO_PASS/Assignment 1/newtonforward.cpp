//Write a program to calculate the difference table for Newton Forward Interpolation Method:

#include <iostream>
using namespace std;
class NewtonForward
{
  public:
	void newtonforward(float x[10][2], int n);
	void display(float x[10][2], int n);
};
void NewtonForward :: newtonforward(float x[10][2], int n)
{
	float diff[10][10];
	int i, j;
	for(i = 0; i < n; i++)
	{
		diff[i][0] = x[i][1];
	}
	for(i = 0; i < n-1; i++)
		for(j = 0; j < n - i-1; j++)
			diff[j][i+1] = diff[j+1][i] - diff[j][i];
	for(i = 0; i < n; i++)
	{
		for(j = 0; j < n - i; j++)
			cout << diff[j][i] << " ";
		cout << endl;
	}
}
int main()
{
	int n, i, j;
	float x[10][2];
	cout << "Enter Number of Entries: ";
	cin >> n;
	for(i = 0; i< n; i++)
		for(j = 0; j < 2; j++)
			cin >> x[i][j];
	NewtonForward NF;
	NF.newtonforward(x, n);
	return 0;
}		

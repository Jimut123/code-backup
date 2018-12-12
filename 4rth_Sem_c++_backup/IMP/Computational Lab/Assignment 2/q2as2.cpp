/* q2as2.cpp: Write a program to implemment Floyd's algorithm to find shortest path among all vertices in a given graph
*/

#include <iostream>
using namespace std;
class Floyd
{
 public:
	void floyd(float w[11][11], int n);
	float minimum(float x, float y);
};

float Floyd :: minimum(float x, float y)
{
	if(x < y)
		return x;
	else
		return y;
}

void Floyd :: floyd(float w[11][11], int n)
{
	float qk[11][11][11], s;
	int i, j, k;
	char ch;
	//To copy elements of w[][] to q[0][][]
	for(i = 1; i <= n; i++)
		for(j = 1; j <= n; j++)
			if(w[i][j] == 0)
				qk[0][i][j] = 99999;
			else	
				qk[0][i][j] = w[i][j];
	//To calculate all elements of qk[][][]
	for(k = 1; k <= n; k++)
		for(i = 1; i <= n; i++)
			for(j = 0; j <= n; j++)
			{
				s = minimum(qk[k-1][i][j], qk[k-1][i][k] + qk[k-1][k][j]);
				if(s > 99999)
					s = 99999;
				qk[k][i][j] = s;
			}
	//To display all elements of qk[][][]
	for(k = 0; k <= n; k++)
	{
		cout << "\nElements in qk[" << k << "]--->\n";
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= n; j++)
				if(qk[k][i][j] == 99999)
					cout << "*" << "\t";
				else
					cout << qk[k][i][j] << "\t";
			cout << endl;
		}
		cout << endl << "Type any character and then press enter key: ";
		cin >> ch;
	}
}
int main()
{
	float w[11][11];
	int i, j, n;
	system("clear");
	cout << endl << "Enter Number of vertices in your graph: ";
	cin >> n;
	cout << endl << "Enter elements in your weight matrix--->\n";
	for(i = 1; i <= n; i++)
		for(j = 1; j <= n; j++)
		{
			cout << "w[" << i << "][" << j << "] = ";
			cin >> w[i][j];
		}
	Floyd F;
	F.floyd(w, n);
	return 0;
}

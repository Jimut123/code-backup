	//floyd1.cpp : Write a program to implement floyd's
	//algorithm to find shortest path
	using namespace std;
	#include<iostream>
	class Floyd
	{
	public:
	void floyd(float w[11][11],float qk[11][11][11],int n);
	float minimum(float x,float y);
	};

	float Floyd :: minimum(float x,float y)
	{
	if(x<y)
	return x;
	else
	return y;
	}
	void Floyd :: floyd(float w[11][11],float qk[11][11][11],int n)
	{
	int i,j,k;
	float mn;
	char ch;
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				if(w[i][j]==0)
				qk[0][i][j]=9999;
				else
				qk[0][i][j]=w[i][j];
	//To calculate qk[][][] matrix
		for(k=1;k<=n;k++)
			for(i=1;i<=n;i++)
				for(j=1;j<=n;j++)
				{
			mn=minimum(qk[k-1][i][j],qk[k-1][i][k]+qk[k-1][k][j]);
					if(mn>9999)
					mn=9999;
				qk[k][i][j]=mn;
				}
	cout<<"\nPress Enter key to display qk[][] matrix--->\n";
	cin>>ch;
		for(k=0;k<=n;k++)
		{
		cout<<endl<<"Elements in qk["<<k<<"] Matrix--->\n";
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
					if(qk[k][i][j]>=9999)
					cout<<'*'<<"\t";
					else
					cout<<qk[k][i][j]<<"\t";
			cout<<endl;
			}
		cout<<endl<<"Press enter key to continue--->";
		cin>>ch;
		}
	}
	int main()
	{
	float w[11][11],qk[11][11][11];
	int i,j,k,n;
	system("clear");
	cout<<endl<<"Enter number of vertices(1-10) :";
	cin>>n;
	cout<<endl<<"Enter elements of weight matrix--->\n";
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
			{
			cout<<"w["<<i<<"]["<<j<<"]=";
			cin>>w[i][j];
			}
	Floyd F;
	F.floyd(w,qk,n);
	return 0;
	}


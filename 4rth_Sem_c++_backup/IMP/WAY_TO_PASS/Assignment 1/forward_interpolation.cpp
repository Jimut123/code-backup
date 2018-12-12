	//q51as1.cpp : Write a program to implement
	//Forward Interpolation method
	using namespace std;
	#include<iostream>
	class Forward
	{
	public:
	float forward(float x[50],float y[50],float xx, int n);
	};
float Forward :: forward(float x[50],float y[50],float xx, int n)
	{
	float diff_matrix[50][50], p,h,fact,p1,p2,yy;
	int i,j,k;

	//To copy y[] to 0-th column of diff_matrix
		for(i=0;i<n;i++)
		diff_matrix[i][0]=y[i];
	//To construct diff_matrix

		for(i=1;i<n;i++)	
		{
		k=n-i;
			for(j=0;j<k;j++)
    diff_matrix[j][i]=diff_matrix[j+1][i-1]-diff_matrix[j][i-1];
		}
	//To display elements in diff_matrix[][]
	cout<<endl<<"Elements in Diff_Matrix--->\n";
		for(i=0;i<n;i++)
		{
		k=n-i;
			for(j=0;j<k;j++)
			cout<<diff_matrix[i][j]<<"\t";
		cout<<endl;
		}
	// To calculate yy at x=xx
	yy=y[0];
	h=x[1]-x[0];
	p=(xx-x[0])/h;
		for(i=1;i<n;i++)
		{
		p1=1;
		p2=p;
		fact=1;
			for(j=1;j<=i;j++)
			{
			p1=p1*p2;
			fact=fact*j;
			p2=p2-1;
			}
		yy=yy+p1*diff_matrix[0][i]/fact;
			
		}

		
	cout<<"xx="<<xx<<" yy="<<yy<<endl;
	return yy;
	}
	int main()
	{
	float x[50],y[50],xx,yy;
	int i,n;
	system("clear");
	cout<<endl<<"Enter number of points(1-50)=";
	cin>>n;
	cout<<endl<<"Enter x-points, y-points one by one--->\n";
		for(i=0;i<n;i++)
		{
		cout<<"x["<<i<<"]=";
		cin>>x[i];
		cout<<"y["<<i<<"]=";
		cin>>y[i];
		}
	cout<<"Enter xx=";
	cin>>xx;
	Forward F;
	yy=F.forward(x,y,xx,n);
	return 0;
	}




		







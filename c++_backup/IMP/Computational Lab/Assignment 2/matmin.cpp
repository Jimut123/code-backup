//matmin.cpp : Write a program to implement Matrix Minima method
	using namespace std;
	#include<iostream>
	class MATMIN
	{
	public:
     float matmin(float cost[10][10],int c,int r,float cap[10],float req[10]);
	};
        float MATMIN :: matmin(float cost[10][10],int c,int r, float cap[10],float req[10])
	{
	int i,j,k,flag,flag1;
	float s1,s2;
	float allot[10][10];
	int row[10],col[10];
	int imin,jmin;
	int ii,jj;
	float mn;
	char ch;
	//To check whether the problem is balanced or unbalanced
	s1=s2=0;
		for(i=1;i<=c;i++)
		s1=s1+cap[i];
		for(i=1;i<=r;i++)
		s2=s2+req[i];
		if(s1<s2)
		{
		c=c+1;
			for(i=1;i<=r;i++)
			cost[c][r]=0;
		}
		else if(s2<s1)
		{
		r=r+1;
			for(i=1;i<=c;i++)
			cost[i][r]=0;
		}
	//To initialize allotment matrix with '0'
		for(i=1;i<=c;i++)
			for(j=1;j<=r;j++)
			allot[i][j]=0;
	//To calculate allotment using Matrix Minima algorithm

	flag=1;
	imin=1;
	jmin=1;
	cout<<endl<<"Elements of cost matrix---->\n";
		for(i=1;i<=c;i++)
		{
			for(j=1;j<=r;j++)
			cout<<cost[i][j]<<"\t";
		cout<<endl;
		}
		cout<<endl<<"Type any character and then press enter key-->";
		cin>>ch;
		for(i=1;i<=c;i++)
		row[i]=0;
		for(i=1;i<=r;i++)
		col[i]=0;
		do
		{
		flag=0;
		//To find the minimum index of minimum value
			flag1=1;
			for(i=1;i<=c;i++)
			{
				for(j=1;j<=r;j++)
					if(row[i]==0 && col[j]==0)
					{
					mn=cost[i][j];
					imin=i;
					jmin=j;
					flag1=0;
					break;
					}
				if(flag1==0)
				break;
			}

			for(i=1;i<=c;i++)
				for(j=1;j<=r;j++)
				if(row[i]==0 && col[j] ==0 && cost[i][j]<mn)
					{
					mn=cost[i][j];
					imin=i;
					jmin=j;
					}

			if(cap[imin]<req[jmin])
			{

			allot[imin][jmin]=cap[imin];
			req[jmin]=req[jmin]-cap[imin];
			cap[imin]=0;
			row[imin]=1;
			}
			else
			{
			allot[imin][jmin]=req[jmin];
			cap[imin]=cap[imin]-req[jmin];
			req[jmin]=0;
			col[jmin]=1;
			}
				for(i=1;i<=c;i++)
					if(cap[i]!=0)
					{
					flag=1;
					break;
					}
				for(i=1;i<=r;i++)
					if(req[i]!=0)
					{
					flag=1;
					break;
					}
			cout<<"\nElements in Allotment Matrix--->\n";
			for(i=1;i<=c;i++)
			{
				for(j=1;j<=r;j++)
				cout<<allot[i][j]<<"\t";
			cout<<endl;
			}
			cout<<endl<<"Residual capacities :\t";
			for(i=1;i<=c;i++)
			cout<<cap[i]<<"\t";
			cout<<endl<<"Residual Requirements :\t";
			for(i=1;i<=r;i++)
			cout<<req[i]<<"\t";
		     cout<<endl<<"Type any character and press enter key-->";
			cin>>ch;
		}while(flag==1);
	cout<<endl<<"Elements in Final allotment matrix--->\n";
		for(i=1;i<=c;i++)
		{
			for(j=1;j<=r;j++)
			cout<<allot[i][j]<<"\t";
		cout<<endl;
		}
	cout<<endl<<"Elements in original cost matrix--->\n";
		for(i=1;i<=c;i++)
		{
			for(j=1;j<=r;j++)
			cout<<cost[i][j]<<"\t";
		cout<<endl;
		}


	//To calculate total transportation cost
	s1=0;
		for(i=1;i<=c;i++)
			for(j=1;j<=r;j++)
			s1=s1+allot[i][j]*cost[i][j];
	return s1;
	}
	int main()
	{
	float cost[10][10],cap[10],req[10],s;
	int i,j,c,r,ch;
	system("clear");
	cout<<endl<<"Enter number of capacities(1-9)=";
	cin>>c;
	cout<<"Enter number of requirements(1-9)=";
	cin>>r;
     cout<<endl<<"Enter elements of cost matrix, capacity, requirement-->\n";
		for(i=1;i<=c;i++)
			for(j=1;j<=r;j++)
			{
			cout<<"cost["<<i<<"]["<<j<<"]=";
			cin>>cost[i][j];
			}
		for(i=1;i<=c;i++)
		{
		cout<<"capacity["<<i<<"]=";
		cin>>cap[i];
		}
		for(i=1;i<=r;i++)
		{
		cout<<"requirement["<<i<<"]=";
		cin>>req[i];
		}
     MATMIN M;
     s=M.matmin(cost,c,r,cap,req);
     cout<<endl<<"Total Transportation cost using Matrix Minima="<<s<<endl;
     cout<<"type any number and then press enter key--->";
     cin>>ch;
     return 0;
     }












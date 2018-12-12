#include<iostream>
using namespace std;
int main()
{
	int  i,j,n,status[20],l,k,p,s,z;
	float w[20][20],d[20][20],lo,tot,low[20];
	char ch;
	system("clear");
	cout<<"\nEnter the nos of vertices\n";
	cin>>n;
	cout<<"Enter elements in weight matrix(enter 999 for no value)\n";
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
			cout<<"w["<<(i+1)<<"]["<<(j+1)<<"]=";
			cin>>w[i][j];
		}
	cout<<"\nElements in Weight Matrix--->\n";
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(w[i][j]==999)
			cout<<"*\t";
			else
			cout<<w[i][j]<<"\t";
		}
		cout<<endl;
	}
	cout<<"\nType any character and then press enter key-->";
	cin>>ch;
	system("clear");
	cout<<"\n\nEnter the starting vertex\n";
	scanf("%d",&s);
	for(i=0;i<n;i++)
	status[i]=-1;
	status[s-1]=0;
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		d[i][j]=999;
	z=0;
	lo=0;
	p=0;
	d[p][s-1]=0;
	p++;
	while(z<n)
	{
		for(i=0;i<n;i++)
		if(status[i]==0)
		k=i;
		for(j=0;j<n;j++)
		{
			if(status[j]==-1)
			{
				if(w[k][j]<d[p-1][j])
				{
					tot=w[k][j]+lo;
					if(tot<d[p-1][j])
					d[p][j]=tot;
					else
					d[p][j]=d[p-1][j];
				}
				if(w[k][j]>=999)
					d[p][j]=d[p-1][j];
			}
			if((status[j]==1)||(status[j]==0))
				d[p][j]=d[p-1][j];
		}
		p++;
		status[k]=1;
		cout<<"\n\ttable after "<<(z+1)<<"  iteration(s)\n\n";
		for(i=0;i<p;i++)
		{
			for(j=0;j<n;j++)
			{
				if(d[i][j]>=999)
				cout<<"*\t";
				else
				cout<<d[i][j]<<"\t";
			}
			cout<<endl;
		}
		cout<<"\nType any character and then press enter key--->\n";
		cin>>ch;
		l=0;
		for(i=0;i<n;i++)

		low[l++]=d[p-1][i];
		lo=999;
		for(i=0;i<l;i++)
		if(status[i]==-1)
		if(lo>low[i])
		{
			lo=low[i];
			s=i;
		}
	cout<<"\nThe lowest val = ["<<lo<<"]  &  index =["<<(s+1)<<"]"<<endl;
	cout<<endl<<"Type any character and then press enter key-->";
	cin>>ch;
		status[s]=0;
		z++;
	}
}

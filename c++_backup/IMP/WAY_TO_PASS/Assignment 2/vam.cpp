	/**************************************************************
	       Transportation problem: Vogel  Approximation method                 
	**************************************************************/
	#include<iostream>
	using namespace std;
	class Sorting
	{
	 public:
	 void bubble(float x[],int n);
	 void minimum(float t[11][11],int n,int m,int *ir,int *ic);
	};

	/**************************************************************
	 Bubble sort subroutine to sort numbers in descending order
	**************************************************************/
	void Sorting :: bubble(float x[],int n)
	{
	float t;
	int i,flag;
	flag=0;
	while(flag == 0)
	{
	flag=1;
	n=n-1;
		for(i=0;i<n;i++)
		if(x[i] > x[i+1])
		{
		t=x[i];
		x[i]=x[i+1];
		x[i+1]=t;
		flag=0;
		}
	}
	}
	/****************************************************************
	    To get the minimum value from matrix-a
	****************************************************************/
	void Sorting:: minimum(float t[][11],int n,int m,int *ir,int *ic)
	{
	float small;
	int i,j;

	if(*ir == -1)
	{
		for(i=0;i<n;i++)
		if(t[i][*ic] != -999)
		{
		small=t[i][*ic];
		*ir=i;
		break;
		}

		for(j=0;j<n;j++)
		if((t[j][*ic] != -999) && (t[j][*ic] <  small))
		{
		small=t[j][*ic];
		*ir=j;
		}
	}
	else
	{

		for(i=0;i<m;i++)
		if(t[*ir][i] != -999)
		{
		small=t[*ir][i];
		*ic=i;
		break;
		}
		for(j=0;j<m;j++)
		if((t[*ir][j] != -999) && (t[*ir][j] < small))
		{
		small=t[*ir][j];
		*ic=j;
		}
	}
	}


	int main()
	{
	float c[11][11],allot[11][11],a[11],b[11],cost;
	float t[11][11]/*,nr[11],nc[11]*/,s1,s2;
	float  rop[11],cop[11],pmax,r1[11],c1[11],rmax,cmax;
	int n,m,i,j,k,l,l1,k1,flag,ir,ic,nr[11],nc[11];
	char ch;
	Sorting S;
	do
	{
	while(1)
	{
	system("clear");
	cout<<"\n\nEnter number or origins(1-10)=";
	cin>>n;
	cout<<"\nEnter number of destinations(1-10)=";
	cin>>m;
		if((n < 1) || (n > 10) || (m < 1) || (m>10))
		cout<<"\n***Invalid Data.Try again.***\n";
		else
		break;
	}

	system("clear");
	/* To initialize cost matrix, signature matrix and allotment matrix */
	for(i=0;i<11;i++)
		for(j=0;j<11;j++)
		{
		c[i][j]=0;
		t[i][j]=0;
		allot[i][j]=0;
		}
	cout<<"\nEnter cost matrix one by one--->\n";
	for(i=0;i<n;i++)
		for(j=0;j<m;j++)
		{
		cout<<"c["<<(i+1)<<"]["<<(j+1)<<"]=";
		cin>>c[i][j];
		t[i][j]=c[i][j];
		}

	cout<<"\nEnter capacity one by one--->\n";
	s1=0;
	for(i=0;i<n;i++)
	{
	cout<<"capacity["<<(i+1)<<"]=";
	cin>>a[i];
	s1=s1+a[i];
	}

	cout<<"\nEnter requirement one by one--->\n";
	s2=0;
	for(i=0;i<m;i++)
	{
	cout<<"requirement["<<(i+1)<<"]=";
	cin>>b[i];
	s2=s2+b[i];
	}

	/**************************************************************
	       Testing of balanced/unbalanced matrix
	**************************************************************/

	if(s1 < s2)
	{
	n=n+1;
	a[n-1]=s2-s1;
	}

	if(s2 < s1)
	{
	m=m+1;
	b[m-1]=s1-s2;
	}
       if(s1!=s2)
       {
       cout<<"\nThe matrix was unbalanced. We have made it balanced\n";
       cout<<"\nType any character and then press enter key--->";
	cin>>ch;
       }

	/**************************************************************
	       Printing of input data                                       
	**************************************************************/
	system("clear");
	cout<<"\nCost Matrix--->\n";
	for(i=0;i<n;i++)
	{
	//cout<<"     ";
		for(j=0;j<m;j++)
		cout<<c[i][j]<<"\t";
	cout<<"a-"<<(i+1)<<" : "<<a[i]<<endl;
	}
	cout<<"\nb:";
	for(i=0;i<m;i++)
	cout<<b[i]<<"\t";
	cout<<"\n\nType any character and then Press enter  key--->";
	cin>>ch;
	/**************************************************************
	      Formation of allotment matrix
	**************************************************************/
	flag=0;
	while(flag == 0)
	{
	/*  calculation of row penalties  */

		for(i=0;i<11;i++)
		{
		rop[i]=0;
		cop[i]=0;
		r1[i]=0;
		c1[i]=0;
		nr[i]=0;
		nc[i]=0;
		}
		k1=0;
		for(i=0;i<n;i++)
		{
		k=0;
			for(j=0;j<m;j++)
				if(t[i][j] != -999)
				{
				r1[k]=t[i][j];
				k=k+1;
				}
			if( k >1)
			S.bubble(r1,k);

			if(k >1)
			rop[k1]=r1[1]-r1[0];
			else if(k==1)
			rop[k1]=r1[0];
			if(k>=1)
			{
			nr[k1]=i;
			k1=k1+1;
			}
		}

	/**************************************************************
	       Calculation of column penalties                               *
	**************************************************************/
	l1=0;
		for(i=0;i<m;i++)
		{
		l=0;
			for(j=0;j<n; j++)
			if(t[j][i] != -999)
			{
			c1[l]=t[j][i];
			l=l+1;
			}
			if(l > 1)
			S.bubble(c1,l);
				if(l > 1)
				cop[l1]=c1[1]-c1[0];
				else if(l==1)
				cop[l1]=c1[0];
				if(l>=1)
				{
				nc[l1]=i;
				l1=l1+1;
				}
		}
	/**************************************************************
	    Printing of intermediate cost matrix with row and column
	    penalties.
	*************************************************************/

	cout<<"\nIntermediate signature matrix--->\n";
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
				if(t[i][j] != -999)
				cout<<t[i][j]<<"\t";
				else
				cout<<"   *   ";
		cout<<endl;
		}

	/**************************************************************
	       Printing of row penalty and column penalty                    *
	**************************************************************/
	cout<<"\nRow penalties--->";
		for(i=0;i<k1;i++)
		cout<<rop[i]<<"\t";
	cout<<"\nColumn penalties--->";
		for(i=0;i<l1;i++)
		cout<<cop[i]<<"\t";
		cout<<endl;

	/*   Corrected upto here */
	cout<<endl<<"Type any character and then press enter key-->";
	cin>>ch;

	/**************************************************************
	   Calculation of maximum penalty value from row and column
	   penalties.
	**************************************************************/
	rmax=rop[0];
	ir=nr[0];
	for(i=1;i<k1;i++)
		if(rop[i] > rmax)
		{
		rmax=rop[i];
		ir=nr[i];
		}
	cmax=cop[0];
	ic=nc[0];
	for(i=1;i<l1;i++)
		if(cop[i] >  cmax)
		{
		cmax=cop[i];
		ic=nc[i];
		}
	/**************************************************************
	     Calculation of  largest penalty value
	 *************************************************************/
	if(rmax > cmax)
	{
	ic=-1;
	pmax=rmax;
	}
	else
	{
	ir=-1;
	pmax=cmax;
	}
	cout<<"\nMaximum penalty="<<pmax<<endl;

	/*   To get the lowest cost value from cost matrix  */
       S.minimum(t,n,m,&ir,&ic);
		if(b[ic] < a[ir])
		{
		allot[ir][ic]=b[ic];
		a[ir]=a[ir]-b[ic];
		b[ic]=0;
		for(i=0;i<n;i++)
		t[i][ic]=-999;
		}
		else
		{
		allot[ir][ic]=a[ir];
		b[ic]=b[ic]-a[ir];
		a[ir]=0;
		for(i=0;i<m;i++)
		t[ir][i]=-999;
		}

		cout<<"\nAllotment matrix--->\n";
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			cout<<allot[i][j]<<"\t";
		cout<<endl;
		}
		cout<<endl<<"Type any character and then press enter key-->";
		cin>>ch;
		cout<<endl;

	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		if(t[i][j] != -999)
		{
		flag=1;
		break;
		}
	if(flag == 1)
	break;
	}
	if(flag == 1)
	flag=0;
	else
	flag=1;

    }      /*  End of while(flag==0)-- loop  */

	/**************************************************************
	      To display allotment matrix
	**************************************************************/
	cout<<"\nAllotment matrix--->\n";
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		cout<<allot[i][j]<<"\t";
	cout<<endl;
	}
	cout<<"\nCost matrix--->\n";

	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		cout<<c[i][j]<<"\t";
	cout<<"\n";
	}

	/**************************************************************
	 Calculation of cost by taking the product of allotment matrix
	 and the cost matrix.
	**************************************************************/
	cost=0;
	for(i=0;i<n;i++)
		for(j=0;j<m;j++)
		cost=cost+allot[i][j]*c[i][j];
	cout<<"\nTotal transportation cost using VAM="<<cost<<endl;
	cout<<"\n\nDo you want to continue(Y/N?)--->";
	cin>>ch;
	}while((ch=='y') || (ch=='Y'));
	return 0;
	}

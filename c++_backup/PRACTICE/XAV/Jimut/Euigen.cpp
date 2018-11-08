#include<iostream>
#include<math.h>
using namespace std;

class Euigen
{
	public:
	int n,i,j;
	int off_d_dummy;	// total no. of rows/columns in the matrix
	
	float lar;
	float a[100][100],M[100][100],MT[100][100],F[100][100],F1[100][100];
	float tan_th,cos_th,sin_th;
	public:
		Euigen()
		{
			off_d_dummy=0;
			cout<<"Const created!"<<endl;
		}
		void input();
		void largest_offd();
		void cal_tan_th();	
		void const_M();
		void const_M_T();
		void const_F();
		void check_off_d();
		void swap_mat_F1_to_a();
};

void Euigen::swap_mat_F1_to_a()
{
	int i,j;
	for(i=0;i<Euigen::n;i++)
	{
		for(j=0;j<Euigen::n;j++)
		{
			Euigen::a[i][j]=Euigen::F1[i][j];
		}
	}
	cout<<"a = "<<endl;
	for(i=0;i<Euigen::n;i++)
        {
                for(j=0;j<Euigen::n;j++)
                {
			cout<<Euigen::a[i][j]<<"\t";
		}
		cout<<"\n";
	}


}

void Euigen::check_off_d()
{
	int i,j;
	 for(i=0;i<Euigen::n;i++)
        {
                for(j=0;j<Euigen::n;j++)
                {
                        if(i!=j)
			{
                        	if(Euigen::F1[i][j]>=.0001||Euigen::F1[i][j]<=.0001)
					Euigen::off_d_dummy = 1; // if 1 then loop
				//if(Euigen::tan_th<0.00000001)
				//	Euigen::off_d_dummy = 0;
			}
		}
	}
				
}


void Euigen::const_F()
{
	//Euigen::F the final matrix
	// calculating A*s1
	int i,j,k;
	float s=0;
	for(i=0;i<Euigen::n;i++)
	{
		for(j=0;j<Euigen::n;j++)
		{
			s=0;
			for(k=0;k<Euigen::n;k++)
			{
				s=s+Euigen::a[i][k] * Euigen::M[k][j];		
			}
			Euigen::F[i][j]=s;
		}
	}
	cout<<"First Multiplication = "<<endl;
	for(i=0;i<Euigen::n;i++)
	{
		for(j=0;j<Euigen::n;j++)
		{
			cout<<Euigen::F[i][j]<<"\t";
		}
		cout<<"\n";
	}
	
	for(i=0;i<Euigen::n;i++)
        {
                for(j=0;j<Euigen::n;j++)
                {
                        s=0;
                        for(k=0;k<Euigen::n;k++)
                        {
                                s=s+Euigen::MT[i][k] * Euigen::F[k][j];
                        }
                        Euigen::F1[i][j]=s;
                }
        }

	cout<<"Second Multiplication = "<<endl;
	for(i=0;i<Euigen::n;i++)
        {
                for(j=0;j<Euigen::n;j++)
                {
                        cout<<Euigen::F1[i][j]<<"\t";
                }
                cout<<"\n";
        }

	
}

void Euigen::const_M_T()
{
	int i,j;
	for(i=0;i<Euigen::n;i++)
        {
                for(j=0;j<Euigen::n;j++)
                {
			Euigen::MT[i][j]=0;
		}
	}
	cout<<"M Transpose = "<<endl;
	for(i=0;i<Euigen::n;i++)
	{
		for(j=0;j<Euigen::n;j++)
		{	
			Euigen::MT[i][j]=Euigen::M[j][i];
			cout<<Euigen::MT[i][j]<<"\t";
		}
		cout<<"\n";
	}
	
		
}

void Euigen::const_M()
{
	int i,j;
	for(i=0;i<Euigen::n;i++)
	{
		for(j=0;j<Euigen::n;j++)
		{
			if(i==j)
				Euigen::M[i][j]=1;
			else
				Euigen::M[i][j]=0;
			
			
		}
	}
	Euigen::M[Euigen::i][Euigen::j] = -Euigen::sin_th;
	Euigen::M[Euigen::j][Euigen::i] = Euigen::sin_th;
	Euigen::M[Euigen::j][Euigen::j] = Euigen::cos_th;
	Euigen::M[Euigen::j][Euigen::j] = Euigen::cos_th;
	cout<<"\nM = \n"<<endl;
	for(i=0;i<Euigen::n;i++)
        {
                for(j=0;j<Euigen::n;j++)
                {
			cout<<Euigen::M[i][j]<<"\t";
		}
		cout<<"\n";
	}
}

void Euigen :: input()
{
	int i,j;
	cout<<"\n Enter the no. of rows/columns for the matrix :: ";
	cin>>Euigen::n;
	for(i=0;i<n;i++)	
	{
		for(j=0;j<n;j++)
		{		
			cout<<"\n Enter the element of "<<i<<" row and "<<j<<" column: "<<endl;
			cin>>a[i][j];
		}
	}
}

void Euigen :: cal_tan_th()
{
	float root_d,diff_1,pow_diff_1;
	float a_ii,a_jj,a_ij,den_root,sqrt_den;
	a_ii = a[Euigen::i][Euigen::i];
	a_jj = a[Euigen::j][Euigen::j];
	a_ij = a[Euigen::i][Euigen::j];
	diff_1 = a_ii - a_jj;
	pow_diff_1 = diff_1*diff_1;
	den_root = (pow_diff_1 - 4*a_ij*a_ij);
	//den_root = abs(den_root);
	if(den_root<0)
		den_root = -den_root;	// abs
	sqrt_den = sqrt(den_root);
	cout<<"a[i][i] = "<<a_ii<<" a[j][j] = "<<a_jj<<" a[i][j] = "<<a_ij<<
		"diff_1 = "<<diff_1<<" pow_diff_1 = "<<pow_diff_1<<" den_root "<<den_root
		<<" sqrt_den = "<<sqrt_den<<endl;
	if(a_ii>=a_jj)
	{
		// +
		Euigen::tan_th = (2*a_ij)/(diff_1 + sqrt_den);
	}
	else
	{
		// -
		Euigen::tan_th = (2*a_ij)/(diff_1 - sqrt_den); 
	}
	cout<<"Euigen::tan_th :: "<<Euigen::tan_th<<endl;
	
	Euigen::cos_th = 1/sqrt((1+(Euigen::tan_th*Euigen::tan_th)));
	cout<<"Euigen::cos_th :: "<<Euigen::cos_th<<endl;
	Euigen::sin_th = Euigen::cos_th*Euigen::tan_th;
	cout<<"Euigen::sin_th :: "<<Euigen::sin_th<<endl;
	
}

void Euigen :: largest_offd()
{
	int i,j;
	//float max = a[1][0];
	Euigen::lar = a[1][0];
        for(i=0;i<n;i++)
        {
                for(j=0;j<n;j++)
                {
			if(i!=j)
			{
				if(Euigen::lar<a[i][j])
				{
					Euigen::lar=a[i][j];
					Euigen::i=i;
					Euigen::j=j;
				}
					
			} 
                }
        }
	cout<<"Max = "<<Euigen::lar<<endl;
	cout<<"i = "<<Euigen::i<<" j = "<<Euigen::j<<endl;

}

int main()
{
	Euigen E;
	E.input();
	while(true)
	{
		cout<<"\n Entered into loop :"<<endl;
		E.largest_offd();
		E.cal_tan_th();	
		E.const_M();	
		E.const_M_T();
		E.const_F();
		E.check_off_d();
		cout<<"Off diagonal dummy = "<<E.off_d_dummy<<endl;
		if(E.off_d_dummy == 1)
		{
			E.swap_mat_F1_to_a();
		}
		else
			break;
	}
}








 

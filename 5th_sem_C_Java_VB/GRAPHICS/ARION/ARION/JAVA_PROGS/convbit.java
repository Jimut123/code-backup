import java.io.*;
//import java.util.*;
class transform
{
	char a[][]=new char[100][100];
	int n;
			transform(char arr[][],int m)
			{
				int i,j;
				n=m;
				for(i=0;i<n;i++)
					for(j=0;j<n;j++)
					{
						a[i][j]=arr[i][j];
					}
			} 
			void store(char x[][])
			{
				for(int i=0;i<n;i++)
                                        for(int j=0;j<n;j++)
                                 		x[i][j]=a[i][j];
                        }

			void upshift()
			{
				char t[]=new char[n];
				int i=1,j;
				for(j=0;j<n;j++)
					t[j]=a[0][j];
				while(i<n)
				{
					for(j=0;j<n;j++)
						a[i-1][j]=a[i][j];
					i++;
				}
				for(j=0;j<n;j++)
					a[n-1][j]=t[j];
			}
			 void downshift()
                        {
                                char t[]=new char[n];
                                int i=n-2,j;
                                for(j=0;j<n;j++)
                                        t[j]=a[n-1][j];
                                while(i>=0)
                                {
                                        for(j=0;j<n;j++)
                                                a[i+1][j]=a[i][j];
                                        i--;
                                }       
                                for(j=0;j<n;j++)
                                        a[0][j]=t[j];
                        }
			 void leftshift()
                        {
                                char t[]=new char[n];
                                int i=1,j;
                                for(j=0;j<n;j++)
                                        t[j]=a[j][0];
                                while(i<n)
                                {
                                        for(j=0;j<n;j++)
                                                a[j][i-1]=a[j][i];
                                        i++;
                                }
                                for(j=0;j<n;j++)
                                        a[j][n-1]=t[j];
                        }
			 void rightshift()
                        {
                                char t[]=new char[n];
                                int i=n-2,j;
                                for(j=0;j<n;j++)
                                        t[j]=a[j][n-1];
                                while(i>=0)
                                {
                                        for(j=0;j<n;j++)
                                                a[j][i+1]=a[j][i];
                                        i--;
                                }
                                for(j=0;j<n;j++)
                                        a[j][0]=t[j];
                        }
			void diagshift()
			{
				int flag=0,i=0,j=n-1;
				char t;
					while(flag<n/2)
					{
						t=a[i][i];
						a[i][i]=a[j][j];
						a[j][j]=t;
						i++;
						j--;
						flag++;
					}
					flag=0;
					i=0;
					j=n-1;
					while(flag<n/2)
					{
						t=a[i][j];
						a[i][j]=a[j][i];
						a[j][i]=t;
						i++;
						j--;
						flag++;
					}
			}
			void circshift()
			{
				 int row = 0, col = 0;
                 char prev, curr;
                 int m=n,n1=n;
 
            
                while (row < m && col < n1)
                {
                    if (row + 1 == m || col + 1 == n1)
                    break;
                    prev = a[row + 1][col];
     
           
                    for (int i = col; i < n1; i++)
                    {
                        curr = a[row][i];
                        a[row][i] = prev;
                        prev = curr;
                    }
                    row++;
     
                    for (int i = row; i < m; i++)
                    {
                        curr = a[i][n1-1];
                        a[i][n1-1] = prev;
                    prev = curr;
                    }
                    n1--;
     
            
                    if (row < m)
                    {
                        for (int i = n1-1; i >= col; i--)
                        {
                            curr = a[m-1][i];
                            a[m-1][i] = prev;
                            prev = curr;
                        }
                    }
                    m--;
            
            
                    if (col < n1)
                    {
                        for (int i = m-1; i >= row; i--)
                        {
                            curr = a[i][col];
                            a[i][col] = prev;
                            prev = curr;
                        }
                    }
                    col++;
                }
            }
			void display()
			{
				
				 String str = "|\t";

        			for(int i=0;i<n;i++){
            				for(int j=0;j<n;j++){
                				str += a[i][j] + "\t";
            				}

            				System.out.println(str + "|");
            				str = "|\t";
					}
			}

}
class Conv
{
	static char s[]=new char[4];
	public static void convdna(int b[])
	{
		//char dna[]=new char[3];
		int k=0;
		for(int i=0;i<8;i+=2)
		{	//k=0;
			switch(b[i])
			{
				case 0:if(b[i+1]==0)
					s[k]='A';
					else
					s[k]='T';
					break;
				case 1:	if(b[i+1]==0)
                                        s[k]='C';
                                        else
                                        s[k]='G';
					break;
			}
			k++;
		}
		
	}
	public static void main(String args[])throws IOException
	{
	String f1,f2;
	//char s[]=new char[3];
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int b[]=new int[8];
	int ch,i=7,noc=0,nom=0,n=0;
	for(int j=0;j<8;j++)
		b[j]=0;
	System.out.println("Enter Ip file name:");
	f1=br.readLine();
	 System.out.println("Enter Op file name:");
        f2=br.readLine();
	FileInputStream fp1=new FileInputStream(f1);
	FileOutputStream fp2=new FileOutputStream(f2);
	while((ch=fp1.read())!=-1)
	{	
		i=7;
		while(ch!=0)
		{
			b[i--]=ch%2;
			ch=ch/2;
		}
		/*for(int j=0;j<8;j++)
                 {
		               System.out.print(b[j]);
		}
		
		/*System.out.println();
            for(int j=0;j<8;j++)
				fp2.write((int)b[j]);*/
		convdna(b);
		
		for(int j=0;j<4;j++)
			fp2.write((int)s[j]);
        
        System.out.println(s);
		
		noc++;
			
	}
	fp1.close();
	fp2.close();
	nom=(int)Math.sqrt(noc*4);
	
	char mat[][]=new char[nom][nom];
    char rmat[]=new char[1000];
    int i1=0,j1=0,i2=0;
	fp1=new FileInputStream(f2);
	n=0;
	while((ch=fp1.read())!=-1)
	{
        if(j1<nom)
        {
            mat[i1][j1++]=(char)ch;
            
        }
        else if(++i1<nom)
        {
            j1=0;
            mat[i1][j1++]=(char)ch;
            
        }
        else {
                rmat[++n]=(char)ch;
            }
     }      
	transform tobj=new  transform(mat,nom);
	tobj.upshift();
	tobj.leftshift();
	tobj.store(mat);
	tobj.display();
	fp1.close();
	}
}

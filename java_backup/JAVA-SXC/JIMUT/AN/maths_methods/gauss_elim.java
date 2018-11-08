import java.io.*;
class gauss_elim
{
	public static void main(String args[])throws IOException
	{	
			InputStreamReader ab = new InputStreamReader(System.in);
			BufferedReader cd = new BufferedReader(ab);
			float a[][] = new float[10][10];
			float b[] = new float[10];
			float x[] = new float[10];
			gauss_elim()
			{

			}
			public void gauss_elim1()
			{
				int i,j,k;
				float s,am;
				for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
						if(i!=j)
						{
							am=a[j][i]/a[i][i];
								for(k=0;k<n;k++)
									a[j][k] = a[j][k] - a[i][k] * am;
							b[j] = b[j] - b[i]*am;
						}
				}
				// Back subs method starts
				x[n-1] = b[n-1]/a[n-1][n-1];
				for(i=(n-2);i>=0;i--)
				{
					s=0;
						for(j=(i+1);j<n;j++)
							s=s+a[i][j]*x[j];
					x[i]=(b[i]-s)/a[i][i];
					System.out.println("Root - "+(i+1)+" = "+x[i]);
					System.out.println("CREATION OF THE EQUATION");
				}
			}
	}
}
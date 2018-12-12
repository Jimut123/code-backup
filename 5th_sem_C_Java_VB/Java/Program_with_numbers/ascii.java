import java.io.*;
class ascii
{
  char a[][] = new char[20][20];
  int n;
  ascii(char x[][])
  {
    int i,j;
    n=16;
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
	a[i][j]=x[i][j];
  }
  public void left()
  {
    int i,j;
    char t;
    for(i=0;i<n;i++)
    {
      t=a[i][0];
      for(j=0;j<n-1;j++)
        a[i][j]=a[i][j+1];
      a[i][n-1]=t;
    }
  }
  public void right()
  {
    int i,j;
    char t;
    for(i=0;i<n;i++)
    {
      t=a[i][n-1];
      for(j=n-2;j>=0;j--)
        a[i][j+1]=a[i][j];
      a[i][0]=t;
    }
  }
  public void up()
  {
    int i,j;
    char t;
    for(i=0;i<n;i++)
    {
      t=a[0][i];
      for(j=0;j<n-1;j++)
        a[j][i]=a[j+1][i];
      a[n-1][i]=t;
    } 
  }
  public void down()
  {
    int i,j;
    char t;
    for(i=0;i<n;i++)
    {
      t=a[n-1][i];
      for(j=n-2;j>=0;j--)
        a[j+1][i]=a[j][i];
      a[0][i]=t;
    }
  }
  public void diag()
  {
    int j,c=n-1;
    char t;
    t=a[0][0];
    for(j=0;j<n-1;j++)
      a[j][j]=a[j+1][j+1];
    a[n-1][n-1]=t;
    t=a[c][0];
    for(j=0;j<n-1;j++)
      a[c--][j]=a[c][j+1];
    a[c][n-1]=t;  
  }
  public void cyclic(){
				//It's a circular shift so things need to be a complete circle
				int i=0,j=0,k=1,r1=0,r2=n-1,c1=0,c2=n-1;
				char temp[][]=new char[n][n];
				while(k<=(n*n))
				{
					if((k%2!=0)){
						if((r1==r2)&&(c1==c2)){
							temp[r1][c1] = a[c1][c2];
							break;
						}
					for (j=c1;j<=c2;j++){
						if(j==c1)
							temp[r1][j] = a[r1+1][j];
						else
						temp[r1][j] = a[r1][j-1];
					}
					for(i=(r1+1);i<=r2;i++){
						temp[i][c2] = a[i-1][c2];
					}
					for(j=c2-1;j>=c1;j--){
						temp[r2][j] = a[r2][j+1]; 
					}
					for (i=r2-1;i>r1;i--){
						temp[i][c1] = a[i+1][c1];
					}
					}
					else{
						for (j=c1;j<=c2;j++){
						if(j==c2)
							temp[r1][j] = a[r1+1][j];
						else
						temp[r1][j] = a[r1][j+1];
					}
					for(i=(r1+1);i<=r2;i++){
						if(i==r2)
							temp[i][c2] = a[i][c2-1];
						else
						temp[i][c2] = a[i+1][c2];
					}
					for(j=c2-1;j>=c1;j--){
						if(j==c1)
							temp[r2][j] = a[r2-1][j];
						else
						temp[r2][j] = a[r2][j-1]; 
					}
					for (i=r2-1;i>r1;i--){
						temp[i][c1] = a[i-1][c1];
					}
					}
					r1++;
					r2--;
					c1++;
					c2--;
					k++;
				}
				for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
					{
						a[i][j] = temp[i][j];
					}
				}
			}	
  public void display()
  { 
    int i,j;
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
	System.out.print(a[i][j]+"\t");
      System.out.println();
    }
    System.out.println();  
  }
  public static void main(String args[])throws IOException
  {
    int i,j,c=0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char b[][]=new char[20][20];
    for(i=0;i<16;i++)
      for(j=0;j<16;j++)
	b[i][j]=(char)c++;
    ascii ob = new ascii(b);
    ob.display();
    ob.left();
    ob.display();
    ob.right();
    ob.display();
    ob.up();
    ob.display();
    ob.down();
    ob.display();
    ob.diag();
    ob.display();
    ob.cyclic();
    ob.display();
  }
}
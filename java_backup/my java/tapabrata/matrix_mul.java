import java.io.*;
class matrix_mul
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,k;
int m[][]=new int[4][4];
int n[][]=new int[4][4];
int p[][]=new int[4][4];
System.out.println("Enter the elements in the 1st matrix");
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{
m[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("The elements are: ");
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{System.out.print(m[i][j]+ "");
}
System.out.println();
}
System.out.println("Enter elements in the 2nd matrix");
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{n[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("The elements are: ");
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{System.out.print(n[i][j]+ "");
}
System.out.println();
}
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{p[i][j]=0;
for(k=0;k<4;k++)
{p[i][j]=p[i][j]+m[i][k]*n[k][j];
}
}
}
System.out.println("The product of two matrices are : ");
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{System.out.print(p[i][j]+ "");
}
System.out.println();
}
}
}



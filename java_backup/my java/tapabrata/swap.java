import java.io.*;
class swap
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,t;
int m[][]=new int[4][4];
System.out.println("Enter elements in the matrix");
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{m[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("The elements of the matrix are:");
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{System.out.print(m[i][j]+"");
}
System.out.println();
}
for(j=0;j<4;j++)
{t=m[0][j];
m[0][j]=m[3][j];
m[3][j]=t;
}
System.out.println("The elements of matrix after swaping are:");
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{System.out.print(m[i][j]+"");
}
System.out.println();
}
}
}

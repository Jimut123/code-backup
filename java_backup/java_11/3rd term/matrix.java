 import java.io.*;
class Matrix
{
public static void main (String args [])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader x = new BufferedReader(read);
int n,a,b,c = 0,i = 0,j = 0;
System.out.print("ENTER A NUMBER:");
n = Integer.parseInt(x.readLine());
b = n;
int s[][] = new int [n][n];
a = n * n;
while(b != 0)
{
c++;
while(j < b)
{
s[i][j] = a;
a--;
j++;
}
j--;
i++;
while(i < b)
{
s[i][j] = a;
a--;
i++;
}
i--;
j--;
while(j >= (c-1))
{
s[i][j] = a;
a--;
j--;
}
j++;
i--;
while(i >= c)
{
s[i][j] = a;
a--;
i--;
}
i++;
j++;
b--;
}
System.out.println("SPIRAL MATRIX:");
for(i = 0;i < n;i++)
{
for(j = 0;j < n;j++)
{
System.out.print(s[i][j]+"\t");
}
System.out.println();
  }
 }
}


import java.io.*;
class matrix_elements_exchange
{public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j;
int max,min;
 int n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];

for(i=0;i<n;i++)
{for(j=0;j<n;j++)
{a[i][j]=Integer.parseInt(br.readLine());
System.out.println("Enter elements");
}
}
max=a[0][0];
for(i=0;i<n;i++)
{for(j=0;j<n;j++)
{System.out.print(a[i][j]+" ");
}
System.out.println("");
}
for(i=0;i<n;i++)
{for(j=i+1;j<n;j++)
{if(a[i][j]>max)
max=a[i][j];
}
}
min=max;
for(i=0;i<n;i++)
{for(j=0;j<i;j++)
{if(a[i][j]<min)
min=a[i][j];
}
}
System.out.println(max+" "+min);
for(i=0;i<n;i++)
{for(j=0;j<n;j++)
{if(i!=j)
if(a[i][j]==max)
a[i][j]=min;
else
if(a[i][j]==min)
a[i][j]=max;
}
}
for(i=0;i<n;i++)
{for(j=0;j<n;j++)
{System.out.print(a[i][j]+" ");
}
System.out.println("");
}
}
}




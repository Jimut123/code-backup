import java.io.*;
class shift
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,t;
int m[]=new int[20];
System.out.println("Enter no of cells");
n=Integer.parseInt(br.readLine());
System.out.println("Enter numbers in the array");
for(i=0;i<n;i++)
{m[i]=Integer.parseInt(br.readLine());
}
System.out.println("The numbers present in the array are");
for(i=0;i<n;i++)
{System.out.print(m[i]+" ");
}
System.out.println();
t=m[n-1];
for(i=(n-1);i>=1;i--)
{m[i]=m[i-1];
}
m[0]=t;
System.out.println("The numbers in the array after shifting are");
for(i=0;i<n;i++)
{System.out.print(m[i]+" ");
}
System.out.println();
}
}
	
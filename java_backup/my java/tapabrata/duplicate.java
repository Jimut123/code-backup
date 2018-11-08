import java.io.*;
class duplicate
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j;
int a[]=new int[10];
int b[]=new int[10];
System.out.println("Enter the numbers in the array");
for(i=0;i<10;i++)
{a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<10;i++)
{for(j=i+1;j<10;j++)
{if(a[i]==a[j])
a[j]=0;
}
}
j=0;
for(i=0;i<10;i++)
{if(a[i]!=0)
{b[j]=a[i];
j=j+1;
}
}
System.out.println("The result after removing duplicate digits");
for(i=0;i<10;i++)
{System.out.println(b[i]+" ");
}
}
}

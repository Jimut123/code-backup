package File_Handling;

import java.io.*;
class File_1
{
FileWriter fw;
BufferedWriter bw;
PrintWriter pw;
 int i,n,j,k,a[],t=0,f=0;String s;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
fw=new FileWriter("File.dat");
bw=new BufferedWriter(fw);
pw=new PrintWriter(bw);
 n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{ k=Integer.parseInt(br.readLine());
  pw.println(k);
}
pw.close();
bw.close();
fw.close();
}
void insert()throws IOException
{
a=new int[n];
FileReader fw=new FileReader("File.dat");
BufferedReader br=new BufferedReader(fw);
while(true)
{
    s=br.readLine();
    if(s==null)
    {break;
    }
    k=Integer.parseInt(s);
    System.out.println(k);
    a[t++]=k;
}
for(i=0;i<t;i++)
{
   for(j=0;j<t-i-1;j++)
    { 
        if(a[j]>a[j+1])
        {
            f=a[j];
            a[j]=a[j+1];
            a[j+1]=n;
        }
    }
}
fw.close();
br.close();
}
void reinsert()throws IOException
{

fw=new FileWriter("File.dat");
bw=new BufferedWriter(fw);
pw=new PrintWriter(bw);
for(i=0;i<n;i++)
{pw.println(a[i]);
}
pw.close();
bw.close();
fw.close();
}
void print()throws IOException
{
FileReader fw=new FileReader("File.dat");
BufferedReader br=new BufferedReader(fw);
while(true)
{
    s=br.readLine();
    if(s==null)
    {break;
    }
    k=Integer.parseInt(s);
    System.out.println(k);
    //a[t++]=k;
}
}
}    
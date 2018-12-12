import java.io.*;
import java.util.*;
class name
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n,i,flag,pass,m,l,j;
    String na,temp,file2;
    System.out.print("Enter number of names : ");
    n = Integer.parseInt(br.readLine());
    String s[] = new String[n];
    for(i=0;i<n;i++)
    {
       System.out.print("Enter name : ");
       s[i]=br.readLine();
    }
    System.out.print("Enter Output File Name = ");
    file2=br.readLine();
    FileOutputStream fp2=new FileOutputStream(file2);
    for(i=0;i<n;i++)
    {
      na="";
      StringTokenizer str = new StringTokenizer(s[i]," ");
      while(str.hasMoreTokens())
        na=str.nextToken()+" "+na;
        na=na.trim();
      s[i]=na;
     }
     System.out.println("\nUnsorted List");
     for(i=0;i<n;i++)
       System.out.println(s[i]);
     flag=pass=0;
		m=n;
			while(flag==0)
			{
			flag=1;
			pass=pass+1;
			m=m-1;
				for(i=0;i<m;i++)
				{
					if(s[i].compareTo(s[i+1])>0)
					{
					temp=s[i];
					s[i]=s[i+1];
					s[i+1]=temp;
					flag=0;
					}
				System.out.println("\nPass="+pass+" Step="+(i+1));
					for(int k=0;k<n;k++)
					System.out.println(s[k]);
				System.out.print("\nPress enter key--->");
				br.readLine();
				}
			}
		System.out.println("\nSorted List");
                for(i=0;i<n;i++)
                  System.out.println(s[i]);
      for(i=0;i<n;i++)
      {
         l=s[i].length();
         for(j=0;j<l;j++)
           fp2.write(s[i].charAt(j));
         fp2.write(13);
         fp2.write(10);
      }
      fp2.close();
  }
}


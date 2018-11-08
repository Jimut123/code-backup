import java.io.*;
class reverse_array
    {
        public static void main(String args[])throws IOException
            {
                int n;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                n=Integer.parseInt(br.readLine());
                int a[]=new int[n];
                int i,j;
                for(i=0;i<n;i++)
                    {
                        System.out.println("give value");
                        a[i]=Integer.parseInt(br.readLine());
                    }
                j=n-1;
                for(i=0;i<n/2;i++,j--)
                    {
                       int t;
                       t=a[i];
                       a[i]=a[j];
                       a[j]=t;
                    }
                     for(i=0;i<n;i++)
                    {
                        System.out.println(" value"+a[i]);
                       
                    }
                }
            }
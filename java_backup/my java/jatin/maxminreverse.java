import java.io.*;
class maxminreverse
    {
        public static void main(String args[])throws IOException
            {
                int n;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                n=Integer.parseInt(br.readLine());
                int a[]=new int[n];
                int i;
                for(i=0;i<n;i++)
                    {
                        System.out.println("give value");
                        a[i]=Integer.parseInt(br.readLine());
                    }
                int max,min,j,pos,pos1;
                
              pos=pos1=0;
                max=a[0];
                min=a[0];
                for(i=0;i<n;i++)
                    {
                        if(a[i]>max)
                        {
                            max=a[i];
                            pos=i;
                        }
                        else
                        if(a[i]<min)
                        {
                            min=a[i];
                            pos1=i;
                            
                        }
                    }
                        j=a[pos];
                        a[pos]=a[pos1];
                        a[pos1]=j;
                for(i=0;i<n;i++)
                System.out.print("value"+a[i]);
            }
        }
                    

        
import java.io.*;
class Find
{
 public static void main(String args[])throws IOException
 {
      BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
         int n; 
      System.out.println ("Give no.of elements");
         
         n=Integer.parseInt(br.readLine());
         int a[]= new int [n];
          int i,f,v;
          for(i=0;i<n;i++)
          {
              System.out.print ("Enter the elements");
              a[i]=Integer.parseInt(br.readLine());
              System.out.print ("give searching element");
              v=Integer.parseInt(br.readLine());
              f=0;
               for(i=0;i<n;i++)
               {
             if(a[i]==v)
             {  
                 f=1;
                break;
                }
            }
            if(f==1)
            System.out.println ("found");
            else
            System.out.println ("not found");
        }
        
    }
}

            
              
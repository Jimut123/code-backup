import java.io.*;
class sortMerge
{
 public static void main(String args[])throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int m=0,n=0,f;
     int i=0,j=0,k=0;
     System.out.println("Enter size of array A[]");
     m=Integer.parseInt(br.readLine());
     System.out.println("Enter size of array B[]");
     n=Integer.parseInt(br.readLine());
     f=(m+n);
     String A[]=new String[m];
     String B[]=new String[n];
     String C[]=new String[f];
     for(i=0;i<m;i++)
     {
         System.out.println("Enter elements of array A:");
         A[i]=br.readLine();
     }
     for(i=0;i<n;i++)
     {
         System.out.println("Enter elements of array B:");
         B[i]=br.readLine();
     }   
     String w="";
     for(i=0;i<m-1;i++)
     {
         for(j=i+1;j<m;j++)
         {
             if(A[i].compareTo(A[j])>0)
             {
                 w=A[i];
                 A[i]=A[j];
                 A[j]=w;
             }
         }
     }
     String v="";
     for(i=0;i<n-1;i++)
     {
         for(j=i+1;j<n;j++)
         {
             if(B[i].compareTo(B[j])>0)
             {
                 v=B[i];
                 B[i]=B[j];
                 B[j]=v;
             }
         }
     }
     i=j=0;
     k=0;
     while(i<m && j<n)
     {
         if(A[i].compareTo(B[j])>0)
         {
             C[k]=B[j];
             j++;
             k++;
         }
         else
         if(A[i].compareTo(B[j])<0)
         {
             C[k]=A[i];
             i++;
             k++;
            }
            else
            {
                C[k]=A[i];
                i++;
                k++;
                j++;
            }
        }
        if(i<m)
        {
            while(i<n)
            {
                C[k]=A[i];
                i++;
                k++;
            }
        }
        if(j<n)
        {
            while(j<m)
            {
                C[k]=B[j];
                j++;
                k++;
            }
        }
        for(i=0;i<f;i++)
        {
            System.out.println(C[i]);
        }
    }
}

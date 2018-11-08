import java.io.*;
class Max
{
 public static void main()throws IOException
 { int max,min,i;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("ENTER ARRAY ELEMENTS");
  int n=Integer.parseInt(br.readLine());
  int a[]=new int[n];
  for(i=0;i<n;i++)
  {
      a[i]=Integer.parseInt(br.readLine());
    }
  max=min=a[0];
  for(i=0;i<n;i++)
  {
      if(a[i]>max)
      {
          max=a[i];
        }
        else
         if(a[i]<min)
            min=a[i];
        
            
    }
    System.out.println(max+","+min);
}
}

           
  
     
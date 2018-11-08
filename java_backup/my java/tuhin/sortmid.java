
public class sortmid
{
    
    
    public static void main(String args[])
    {
        int arr[]={1,75,56,73,2,4,89};
        int l=7;
        int mid=l/2;
        int max=0;
        int min=0;
        for(int i=0;i<l;i++)
        {
           if(arr[i]>max)
           max=arr[i];
           if(arr[i]<min)
           min=arr[i];
        }
        int c=0;int k=-1;
        for(int i=max;i>=min;i--)
        {
            int space=mid+(c*k);
            //System.out.println(space);
            for(int j=0;j<l;j++)
         {
            if(arr[j]==i)
            {
                //System.out.println("found"+i);
                int temp=arr[j];
                arr[j]=arr[space];
                arr[space]=temp;
                         
                mid=space;
                c=c+1;
                k=k*-1;
               break; 
            
             }
          }
        }
        for(int i=0;i<l;i++)
        {
            System.out.println(arr[i]);
        }
            
        
        
  }
}

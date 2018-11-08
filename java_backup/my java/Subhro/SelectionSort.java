 //        SELECTION
import java.io.*;
class sort
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[];
        int n,j,i,s;
        public void get() throws IOException
        {
            System.out.println(" Enter an array size");
            n=Integer.parseInt(br.readLine());
            arr= new int[n];
            for(i=0;i<n;i++)
            {
                System.out.println(" Enter an array element");
                arr[i]=Integer.parseInt(br.readLine());
            } // for loop ends
            System.out.println(" Showing original array");
            show(arr);
            calc(arr);
            System.out.println(" Showing sorted array");
            show(arr);
        } // get() ends
        public void calc(int a[])
        {
            s=a.length;
            for(i=0;i<s;i++)
            {              
                int min=a[i];
                int minp=i;
                    for(j=i+1;j<s;j++)
                    {
                        if(a[j]<min)
                        {
                            min=a[j];
                            minp=j;
                        } // if ends
                     } // inner loop ends
                    a[minp]=a[i];
                    a[i]=min;
             } // outer loop ends
        } // calc() ends
             
        public void show(int a[]) 
        {
            for(i=0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        } // show() ends
    } // class sort ends
public class SelectionSort
    {
        public static void main(String args[]) throws IOException
        {
            sort obj=new sort();
            obj.get();
        } // main() ends
    } // class SelectionSort ends
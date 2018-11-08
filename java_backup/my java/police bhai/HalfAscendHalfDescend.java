 // HALF Descend HALF Ascend

import java.io.*;
class sort
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[];
        int n,i,j,s,c,t;
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
            int mid=(s/2);
            for(i=1;i<mid;i++)
            {
                for(j=0;j<mid-i;j++)
                {
                    if(a[j]<a[j+1])
                    {
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    } // if ends
                } // inner loop ends
            } // outer loop ends 
            for(i=1;i<mid;i++)
            {
                for(j=mid;j<s-i;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    } // if ends
                } // inner loop ends
            } // outer loop ends
        } // calc() ends
         public void show(int a[])
        {
            for(i=0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        } // show() ends
    } // class sort ends
    public class HalfAscendHalfDescend
    {
        public static void main(String args[]) throws IOException
        {
            sort obj=new sort();
            obj.get();
        } // main() ends
    } // class HalfAscendHalfDescend ends
//  INSERTION
import java.io.*;
class insert
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[];
        int k,n,i,j,s,val;
        public void get() throws IOException
        {
            System.out.println(" Enter an array size");
            n=Integer.parseInt(br.readLine());
            arr= new int[n+1];
            for(i=0;i<n;i++)
            {
                System.out.println(" Enter an array element");
                arr[i]=Integer.parseInt(br.readLine());
            } // for loop ends
            System.out.println(" Enter value to be inserted");
            val=Integer.parseInt(br.readLine());
            System.out.println(" Showing original array");
            show1(arr);
            calc(arr);
            System.out.println(" Showing new array");
            show2(arr);
        } // get() ends
        public void calc(int a[])
        {
            s=a.length-1;
            int c=0,p=0;
            for(i=0;i<s;i++)
            {
                if(val==a[i])
                {
                    p=i;
                    c++;
                    break;
                } // if ends
            } // for loop ends
            if(c==0)
              a[s]=val;
            else
            {
                for(j=s-1;j>=p;j--)
                    a[j+1]=a[j];
                a[p]=val;
            } // else part ends
        }
        public void show1(int a[])
        {
            for(i=0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        } // show1() ends
        public void show2(int a[])
        {
            for(i=0;i<=n;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        } // show2() ends
    } // class insert ends
        public class Insertion
        {
            public static void main(String args[]) throws IOException
            {
                insert obj=new insert();
                obj.get();
            } // main() ends
        } // class Insertion ends
            
                
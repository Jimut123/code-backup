import java.io.*;
class Mixer
{
    int arr[];
    int n,i,p=0,q=0,x=0;
    Mixer(int nn)
    {
       n=nn;
    }
    void accept()throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array without duplication and in sorted order : ");
        for(i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(cd.readLine());
        }
    }
    Mixer mix (Mixer A)
    {
        Mixer M = new Mixer(n+A.n);
        while(p<n && q<A.n)
        {
            if(arr[p]<A.arr[q])
            {
                M.arr[x++]=arr[p];
                p++;
            }
            else
            {
                M.arr[x++]=A.arr[q];
                q++;
            }
        }
        if(p<n)
        {
            for(i=p;i<n;i++)
            M.arr[x++]=arr[i];
        }
        else if(q<A.n)
        {
            for(i=q;i<A.n;i++)
            M.arr[x++]=A.arr[i];
        }
        return M;
    }
    void display()
    {
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
    public static void main()throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the size of the array .");
        int n=Integer.parseInt(cd.readLine());
        Mixer ob = new Mixer(n);
        Mixer k = new Mixer(n);
        ob.mix(k);
        ob.display();
    }
}
    
    
    
    
        
import java.io.*;
class Vampire
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,j,n,v,v2,c=0,arr[];
    void disp()
    {
        int arr[]=new int[10];
        System.out.println("Enter number");
        n=Integer.parseInt(br.readLine());
        k=n;
        i=0;
        while(k>0)
        {
            r=k%10;
            arr[i]=r;
            k=k/10;
            i++;
            c++;
        }
        if(c%2!=0)
        {
            System.out.println("Not a vampire number");
        }
        else
        {
            c=c/2;
        }
        v=0;
        for(i=0;i<c;i++)
        {
            v=v+arr[i]*Math.pow(10,i);
        }
        v2=0;
        for(i=c;i<2*c;i++)
        {
            v2=v2+arr[i]*Math.pow(10,i);
        }
        